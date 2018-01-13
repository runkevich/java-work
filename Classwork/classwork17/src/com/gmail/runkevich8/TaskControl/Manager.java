package com.gmail.runkevich8.TaskControl;

import com.gmail.runkevich8.TaskControl.entity.MyFiles;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;


public class Manager {


    private static ArrayList<MyFiles> myFiles = new ArrayList<>();

    public void loadData(String link) throws IOException {
        File folder = new File(link);
        File[] files = folder.listFiles();


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

        for (File s : files) {

            Path file = Paths.get(String.valueOf(s));
            BasicFileAttributes basicAttr = Files.readAttributes(file, BasicFileAttributes.class);
            FileTime creationTime = basicAttr.creationTime();
            String name = s.getName();
            long size = s.getTotalSpace();
            String pathName = s.getPath();

            System.out.println(name);
            System.out.println(size);
            System.out.println(creationTime);
            System.out.println(pathName);

            MyFiles listMyFiles = new MyFiles();
            listMyFiles.setNameF(name);
            listMyFiles.setSizeF(size);
            listMyFiles.setCreationTime(String.valueOf(creationTime));
            listMyFiles.setPathName(pathName);

            myFiles.add(listMyFiles);

            // root elements
            Element staff = doc.createElement("file");
            rootElement1.appendChild(staff);

            Element nameF = doc.createElement("name");
            nameF.setTextContent(name);
            staff.appendChild(nameF);
            // elements
            Element pathF = doc.createElement("path");
            pathF.setTextContent(pathName);
            staff.appendChild(pathF);

            // elements
            Element sizeF = doc.createElement("size");
            sizeF.setTextContent(String.valueOf(size));
            staff.appendChild(sizeF);

            // elements
            Element dateF = doc.createElement("datetime");
            dateF.setTextContent(String.valueOf(creationTime));
            staff.appendChild(dateF);

            System.out.println("File saved!");
        }

        try {

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File("D:\\file.xml"));

            transformer.transform(source, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }

}
