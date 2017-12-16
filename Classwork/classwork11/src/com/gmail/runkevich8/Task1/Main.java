package com.gmail.runkevich8.Task1;

import com.gmail.runkevich8.Task1.entity.People;
import com.gmail.runkevich8.Task1.entity.Root;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String LINK = "http://kiparo.ru/t/test.xml";
    public static void main(String[] args) {

        // inputStream - чтение файла
        // OutputStream - запись
        // url.openStream() - сокращенная форма
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;

        try {//java.net - package
            URL url = new URL(LINK);
            HttpURLConnection httpURLConnection =
                    (HttpURLConnection) url.openConnection();

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {// upload

                inputStream = httpURLConnection.getInputStream();

                File file = new File("test.xml");
                fileOutputStream = new FileOutputStream(file);

                int byteRead = -1;
                byte[] buffer = new byte[2048]; // то , куда скачивается наш сайт 2 Мб
                while ((byteRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);
                }

                parseXml(); // после скачивание переходим к parse файла

            } else {
                System.out.println("Данные не найдены, response code = " + responseCode);
            }


        } catch (Exception e) {
            System.out.println("Невозможно скачать файл");
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Невозсожно закрыть  inputStream, error =  " + e.toString());
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println("Невозсожно закрыть  outputStream, error =  " + e.toString());
                }
            }


        }
    }
    //...........parse...............
    public static void parseXml(){

        Document dom;

        try {
            //открываем xml файд
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance(); // pattern
            DocumentBuilder builder = dbf.newDocumentBuilder();
            dom = builder.parse("test.xml");

        } catch (Exception e){
            System.out.println("Невозможно открыть xml error = " + e.toString());
            return;
        }
        //наш объект, который мы будем заполнять данными из xml
        Root root = new Root();

        //.....парсинг xml .....

        //получаем главный, самый первый элемент из файла
        Element rootElement = dom.getDocumentElement();
        System.out.println("root tag name = " + rootElement.getTagName());

        //получаем элемент по названию, в даннном случае вытягиваем тег name
        NodeList nameNodeList = rootElement.getElementsByTagName("name");

        //т.к. в теге может быть много других тегов, мы изначально получаем массив
        //т.к. мы знаем, что у нас нет содержимого в name
        //берем первый элемент
        Node nameNode = nameNodeList.item(0);
        System.out.println("name tag name = " + nameNode.getNodeName());

        //вытягиваем из тега содержтимое, в данном случае текст
        String nameFile = nameNode.getTextContent();
        System.out.println("name tag name = " + nameFile);

        //заполняем наш объект Root
        root.setName(nameFile);




        //...........парсим people........

        //получаем элемент по названию, в даннном случае вытягиваем тег people
        NodeList peopleList = rootElement.getElementsByTagName("people");
        Node peopleNode = peopleList.item(0);

        //получаем из тега people все содержимое,т.е. массив элементов element
        //один элемент из elementNodeList  - это один тег element>
        NodeList elementNodeList = peopleNode.getChildNodes(); //для вытаскивания element

        List<People> peoples = new ArrayList<>();

        //обходим всех people,точнее element
        for (int i = 0; i < elementNodeList.getLength(); i++){

            Node node = elementNodeList.item(i);

            if (node.getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            System.out.println("___________________________________________________");
            Element element = (Element) node;

            //вытягиваем name
            String name = element.getElementsByTagName("name").item(0).getTextContent();
            System.out.println("name = " + name);

            //вытягиваем name
            String surname = element.getElementsByTagName("surname").item(0).getTextContent();
            System.out.println("surname = " + surname);

            String isDegreeString = element.getElementsByTagName("isDegree")
                    .item(0).getTextContent();
            boolean isDegree = Boolean.valueOf(isDegreeString);
            System.out.println("isDegree = " + isDegree);

            String sAge = element.getElementsByTagName("age")
                    .item(0).getTextContent();
           int age = Integer.valueOf(sAge);
            System.out.println("age = " + age);

            People people = new People();
            people.setName(name);
            people.setSurname(surname);
            people.setDegree(isDegree);
            people.setAge(age);


            peoples.add(people);//для заполнения пипла

        }
        root.setPeople(peoples);

        System.out.println("____________________________________________________");

        System.out.println("root = " + root.toString());
    }
}
