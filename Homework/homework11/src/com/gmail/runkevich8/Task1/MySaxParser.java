package com.gmail.runkevich8.Task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MySaxParser extends DefaultHandler{

    List<People> peopleL;
    String peopleXmlFileName;
    String tmpValue;
    People peopleTmp;

    public MySaxParser(String peopleXmlFileName) {
        this.peopleXmlFileName = peopleXmlFileName;
        peopleL = new ArrayList<>();
        parseDocument();
        printDatas();
    }
    private void parseDocument() {
        // parse
        SAXParserFactory factory = SAXParserFactory.newInstance();
        try {
            SAXParser parser = factory.newSAXParser();
            parser.parse(peopleXmlFileName, this);
        } catch (ParserConfigurationException e) {
            System.out.println("ParserConfig error");
        } catch (SAXException e) {
            System.out.println("SAXException : xml not well formed");
        } catch (IOException e) {
            System.out.println("Невозможно открыть xml error = " + e.toString());
        }
    }
    private void printDatas() {

        for (People tmpB : peopleL) {
            System.out.println(tmpB.toString());
        }
    }
    @Override
    public void startElement(String s, String s1, String elementName, Attributes attributes) throws SAXException {

        if (elementName.equalsIgnoreCase("element")) {
            peopleTmp = new People();
        }

    }
    @Override
    public void endElement(String s, String s1, String element) throws SAXException {
        // if end of book element add to list
        if (element.equals("element")) {
            peopleL.add(peopleTmp);
       }
        if(element.equalsIgnoreCase("age")){
            peopleTmp.setAge(tmpValue);

        }
        if (element.equalsIgnoreCase("id")) {
            peopleTmp.setId(tmpValue);

        }

        if(element.equalsIgnoreCase("isDegree")){
            peopleTmp.setDegree(tmpValue);
        }
        if (element.equalsIgnoreCase("name")) {
            peopleTmp.setName(tmpValue);
        }
        if(element.equalsIgnoreCase("surname")){
            peopleTmp.setSurname(tmpValue);
        }
    }
    @Override
    public void characters(char[] ac, int i, int j) throws SAXException {
        tmpValue = new String(ac, i, j);
    }

}
