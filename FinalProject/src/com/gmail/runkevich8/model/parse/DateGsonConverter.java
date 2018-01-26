package com.gmail.runkevich8.model.parse;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateGsonConverter implements JsonDeserializer<Date> {

    private final String[] formats = new String[]{
            "yyyy-MM-dd HH:mm" ,
            "yyyy-MM-dd"
    };


    @Override
    public Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        for (String format: formats){ // не нужен,если один формат даты
            try{
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format,
                        Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                return simpleDateFormat.parse(jsonElement.getAsString());


            }catch (Exception e){

            }

        }

        return null;
    }
}