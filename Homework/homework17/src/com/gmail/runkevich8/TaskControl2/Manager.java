package com.gmail.runkevich8.TaskControl2;

import com.gmail.runkevich8.TaskControl2.entity.MyFiles;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager {

        public static Map<String, ArrayList<MyFiles>> loadData (String[]arg){
            Map<String, ArrayList<MyFiles>> mapFiles = new HashMap<>();

            for (String link : arg) {

                File folder = new File(link);
                File[] files = folder.listFiles();
                if (files != null) {
                    for (File file : files) {
                        if (file.isFile()) {

                            MyFiles myFile = new MyFiles();
                            myFile.setNameF(file.getName());

                            Pattern pattern = Pattern.compile("(.)\\.([A-Za-z0-9]+)$");
                            Matcher matcher = pattern.matcher(myFile.getNameF());

                            String namePathFile = null;
                            if (matcher.find()) {
                                namePathFile = matcher.group(2);
                                if (!mapFiles.containsKey(namePathFile)) {
                                    mapFiles.put(namePathFile, new ArrayList<>());
                                }
                                mapFiles.get(namePathFile).add(myFile);

                            } else {
                                namePathFile = "Неизвестный формат";
                            }
                        }
                    }
                }
            }
            return mapFiles;
        }

    public void writeFile(Map<String, ArrayList<MyFiles>> mapFiles) throws TransformerException {

        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = null;
        try {
            docBuilder = docFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document doc = docBuilder.newDocument();
        Element rootElement1 = doc.createElement("Files");
        doc.appendChild(rootElement1);

        for (Map.Entry<String, ArrayList<MyFiles>> map : mapFiles.entrySet()) {
            Element rootElement = doc.createElement("ext");
            rootElement.setAttribute("name", map.getKey());
            rootElement1.appendChild(rootElement);

            for (MyFiles file : map.getValue()) {

                Element fileElement = doc.createElement("file");
                rootElement.appendChild(fileElement);

                Element name = doc.createElement("name");
                name.setTextContent(file.getNameF());
                fileElement.appendChild(name);

            }
        }

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("D:\\file.xml"));

            transformer.transform(source, result);
            System.out.println("File saved!");
       }
}
