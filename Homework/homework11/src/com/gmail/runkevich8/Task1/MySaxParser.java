package com.gmail.runkevich8.Task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MySaxParser extends DefaultHandler{

    List<People> peopleL;
    String peopleXmlFileName;
    People peopleTmp;
    private String thisElement;
    Root nameL = new Root();
    boolean curName = true;


    public MySaxParser(String peopleXmlFileName) {
        this.peopleXmlFileName = peopleXmlFileName;
        peopleL = new ArrayList<>();
        parseDocument();
        printData();
    }
    private void parseDocument() {

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
    private void printData() {

        System.out.println(nameL);
        for (People tmpP : peopleL) {
            System.out.println(tmpP.toString());
        }
    }



    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parse XML...");
    }

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        thisElement = qName;
        if (qName.equalsIgnoreCase("people")) {
            curName = false;
        }

        if (qName.equalsIgnoreCase("element")) {
            peopleTmp = new People();
        }


    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        thisElement = "";
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if(thisElement.equalsIgnoreCase("name") && curName){
            nameL.setName(new String(ch,start,length));
        }
        if (thisElement.equals("element")) {
            peopleL.add(peopleTmp);
        }

        if(thisElement.equalsIgnoreCase("age")){
           peopleTmp.setAge(String.valueOf(new String(ch,start,length)));

        }
        if (thisElement.equalsIgnoreCase("id")) {
            peopleTmp.setId(new String(ch,start,length));

        }
        if (thisElement.equalsIgnoreCase("isDegree")) {
            peopleTmp.setDegree(new String(ch,start,length));

        }

        if (thisElement.equalsIgnoreCase("name") && !curName) {
            peopleTmp.setName1(new String(ch,start,length));

        }
        if (thisElement.equalsIgnoreCase("surname")) {
            peopleTmp.setSurname(new String(ch,start,length));

        }

    }

    @Override
    public void endDocument() {
        System.out.println("Stop parse XML...");
    }

}

