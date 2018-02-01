package com.gmail.runkevich8.parse;

import com.gmail.runkevich8.entity.Root;
import com.gmail.runkevich8.entity.Schedule;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParseXML extends Thread implements ParseData{

    private Document dom;
    private Object object;
    private String fileName;

    public ParseXML(String fileName, Object object){
        this.fileName = fileName;
        this.object = object;
    }

    public Root parse() {

            Root root = new Root();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder builder = null;
        try {
            builder = dbf.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {
            dom = builder.parse(fileName);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element rootElement = dom.getDocumentElement();

            //получаем элемент по названию, в даннном случае вытягиваем тег
            NodeList nameNodeList = rootElement.getElementsByTagName("name");
            NodeList dateNodeList = rootElement.getElementsByTagName("date");

            Node nameNode = nameNodeList.item(0);
            String nameFile = nameNode.getTextContent();
            root.setName(nameFile);

            String dateNode = dateNodeList.item(0).getTextContent();
            try {
                root.setDate(format.parse(dateNode));
            } catch (ParseException e) {
                e.printStackTrace();
            }

            NodeList sheduleList = rootElement.getElementsByTagName("schedule");
            Node sheduleNode = sheduleList.item(0);
            NodeList elementNodeList = sheduleNode.getChildNodes(); //для вытаскивания element

            List<Schedule> schedules = new ArrayList<>();

            //обходим всех  element
            for (int i = 0; i < elementNodeList.getLength(); i++){

                Node node = elementNodeList.item(i);
                List<String> waypointsList = new ArrayList<>();

                if (node.getNodeType() != Node.ELEMENT_NODE){
                    continue;
                }

                Element element = (Element) node;

                String sBusNumber = element.getElementsByTagName("busNumber")
                        .item(0).getTextContent();
                int busNumber = Integer.valueOf(sBusNumber);


                String sDateEnd = element.getElementsByTagName("dateEnd")
                        .item(0).getTextContent();
                Date dateEnd = null;
                try {
                    dateEnd = format.parse(sDateEnd);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                String sDateStart = element.getElementsByTagName("dateStart")
                        .item(0).getTextContent();
                Date dateStart = null;
                try {
                    dateStart = format.parse(sDateStart);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                String sId = element.getElementsByTagName("id").item(0).getTextContent();
                int id = Integer.valueOf(sId);

                String locationEnd = element.getElementsByTagName("locationEnd").item(0).getTextContent();
                String locationStart = element.getElementsByTagName("locationStart").item(0).getTextContent();

                String sPrice = element.getElementsByTagName("price")
                        .item(0).getTextContent();
                int price = Integer.valueOf(sPrice);


                NodeList waypointsElement = element.getElementsByTagName("waypoints");
                for (int j = 0; j < waypointsElement.getLength(); j++) {
                    waypointsList.add(waypointsElement.item(j).getTextContent());
                }

                Schedule schedule = new Schedule();
                schedule.setBusNumber(busNumber);
                schedule.setDateEnd(dateEnd);
                schedule.setDateStart(dateStart);
                schedule.setId(id);
                schedule.setLocationEnd(locationEnd);
                schedule.setLocationStart(locationStart);
                schedule.setPrice(price);
                schedule.setWaypoints(waypointsList);

                schedules.add(schedule);
            }
         root.setSchedule(schedules);
         return root;
    }

    @Override
    public void run() {
        try {
            synchronized (object) {
                object.wait();
            }

        } catch (InterruptedException e) {
        }
        parse();
        synchronized (object) {
            object.notify();
        }
    }
}
