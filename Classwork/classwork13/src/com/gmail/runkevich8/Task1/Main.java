package com.gmail.runkevich8.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        String text = "@abs@gmail.com@";
        text = text.replaceAll("^@|@$","");
        System.out.println(text);

        String text1 = "2020 MF-7";
        String text2 = "+375 (29) 232-71-81";

      //  Pattern pattern = Pattern.compile("^[0-9]{4} [A-Za-z]{2}-[1-7]{1}$");
        text2 = text2.replaceAll("\\D","");

        System.out.println(text2);
        Pattern pattern = Pattern.compile("^375(17|29|25|33|44){1}[0-9]{7}$");
        Matcher matcher = pattern.matcher(text2);


        if (matcher.matches()){
            System.out.println("Номер корректный");
        } else {
            System.out.println("Номер не корректный");
        }
    }

    public static boolean checkCarNubber (String text){
        Pattern pattern = Pattern.compile("^[0-9]{4} [A-Za-z]{2}-[1-7]{1}$");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    public static boolean checkPhoneNubber (String text){
        text = text.replaceAll("\\D","");
        Pattern pattern = Pattern.compile("^375(17|29|25|33|44){1}[0-9]{7}$");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

}
