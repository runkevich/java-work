package com.gmail.runkevich8.Task2;

import com.gmail.runkevich8.Task2.Exception.Exception1;
import com.gmail.runkevich8.Task2.Exception.Exception2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){


        Build building = new Build("School");
        building.addRoom("Audit", 100, 3);
        building.addRoom("Labor", 200, 4);

        int idRoom = 0;
        try {
            addFurniture(building, idRoom);
            addLamp(building, idRoom);
            idRoom = 1;

            addFurniture(building, idRoom);
            addLamp(building, idRoom);
            print(building);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void addFurniture(Build building, int numberRoom) throws Exception {
        String nameFurniture;
        double sRoom = building.getRoomList().get(numberRoom).getSq();
        int idQuery, idAddFur, sumS = 0;
        double s = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Для добавления мебели нажмите 1\nНазад - 2");
            idQuery = Integer.parseInt(reader.readLine());
            if (idQuery == 1) {
                System.out.println("Если хотите добавить диван нажмите - 1");
                idAddFur = Integer.parseInt(reader.readLine());
                switch (idAddFur) {
                    case 1:
                        System.out.println("Введите название дивана:");
                        nameFurniture = reader.readLine();
                        System.out.println("Введите площадь дивана");
                        s = Double.parseDouble(reader.readLine());
                        building.getRoomList().get(numberRoom).addFurniture(new Sofa(nameFurniture, s));
                    default:
                        System.out.println("Вы ввели не правильный номер, повторите ввод");
                }
                sumS += s;
                if (sRoom * 0.7 <= sumS) {
                    System.out.println("Превышена наполняемость комнаты в 70% от площади. Выход из этого меню.");

                    building.getRoomList().get(numberRoom).getFurnitures().remove(building.getRoomList().get(numberRoom).getFurnitures().size() - 1);
                    try {
                        throw new Exception1();
                    } catch (Exception1 e) {
                        e.getMessage();
                    }
                }
            } else if (idQuery == 2) {
                return;
            } else {
                System.out.println("Вы ввели не правильный номер, повторите ввод");
                addFurniture(building, numberRoom);
            }
        }

    }

    private static void addLamp(Build building, int number) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumWatt = 0;
        double sRoom = building.getRoomList().get(number).getSq();
        int windowsLight = building.getRoomList().get(number).getNumberWindows() * 700;

        while (true) {
            System.out.println("Для добавленя лампочки нажмите - 1\nНазад - 2");
            int g = Integer.parseInt(reader.readLine());
            if (g == 1) {
                System.out.println("Введите мощность добавляемой светодиодной лампы:");

                int i = Integer.parseInt(reader.readLine());
                sumWatt += i;

                if (sumWatt * 70  / sRoom + windowsLight >= 4000) {

                    System.out.println("Освещённость не может превышать 4000лк");
                    try {
                        throw new Exception2();
                    } catch (Exception2 e) {
                        e.getMessage();
                    }
                    return;
                }
                building.getRoomList().get(number).addLamp(i);
            } else if (g == 2) {
                if (sumWatt * 70 / sRoom + windowsLight <= 300) {
                    System.out.println("Освещённость не может быть меньше 300лк, добавте ещё ламп");
                    addLamp(building, number);
                }
                break;

            } else {
                System.out.println("Вы ввели не правильный номер, повторите ввод");
                addLamp(building, number);
            }

        }

    }

    private static void print(Build building) {

        int sumLight = 0;
        int sumFurniture = 0;

        StringBuilder builder = new StringBuilder();
        builder.append("Название здания: ");
        builder.append(building.getName());
        builder.append("\n");
        if (building.getRoomList().size() != 0) {
            for (int i = 0; i < building.getRoomList().size(); i++) {
                builder.append(" Название комнаты: ");
                builder.append(building.getRoomList().get(i));
                builder.append("\n Освещённость = ");

                for (int g = 0; g < building.getRoomList().get(i).getLampList().size(); g++) {
                    sumLight += building.getRoomList().get(i).getLampList().get(g).getLight();
                }
                builder.append(sumLight * 700 + building.getRoomList().get(i).getNumberWindows() * 700);
                sumLight = 0;
                builder.append(" (");
                builder.append(building.getRoomList().get(i).getNumberWindows());
                builder.append(" окно(а) по 700 лк, лампочки: ");
                for (int g = 0; g < building.getRoomList().get(i).getLampList().size(); g++) {
                    builder.append(building.getRoomList().get(i).getLampList().get(g).getLight() * 70);
                    builder.append(" лк ");
                }
                builder.append(")\n");
                //находим суммарную площадь которую занимает мебель
                if (building.getRoomList().get(i).getFurnitures().size() != 0) {
                    for (int g = 0; g < building.getRoomList().get(i).getFurnitures().size(); g++)
                        sumFurniture += building.getRoomList().get(i).getFurnitures().get(g).getS();
                }
                if (sumFurniture != 0) {
                    builder.append("Площадь = ");
                    builder.append(building.getRoomList().get(i).getSq());
                    builder.append(" м^2 (занято ");
                    builder.append(sumFurniture);
                    builder.append(" м^2, гаранитированно свободно ");
                    builder.append(building.getRoomList().get(i).getSq() - sumFurniture);
                    builder.append(" м^2 или ");
                    builder.append(Math.floor(100 - (100 * sumFurniture) / building.getRoomList().get(i).getSq()));
                    builder.append("% площади)\nМебель:\n");
                    for (Furniture f : building.getRoomList().get(i).getFurnitures()) {
                        builder.append(" ");
                        builder.append(f.getName());
                        builder.append(" (площадь ");
                        builder.append(f.getS());
                        builder.append(" м^2)\n");
                    }

                } else if (sumFurniture == 0) {
                    builder.append("Мебели нет");
                }
                sumFurniture = 0;
            }

        }
        System.out.println(builder);

    }
}




