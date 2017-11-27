//package com.gmail.runkevich8.Task1;
//
//public class Main {
//
//    public static void main(String[] arg){
//
//        Manager manager = new Manager();
//
//        System.out.println("введите команду");
//
//        //создаем пациентов для теста через менеджера
//        manager.createTestData();
//
//        switch (command){
//            case "0"{
//                //вывести всех пациентов на экран
//                Pacient[] array = manager.getPacientArray();
//                if (array.length>0){
//
//                    //распечатываем пациентов в фор
//                    printPacientArray(array);
//                } else {
//                    //сообщение о том,что пациентов нет
//                }
//
//                break;
//            }
//            case "1"{
//                //найти по имени
//                Pacient[] array = manager.searchByName(name);
//                if (array.length > 0){
//                    printPacientArray(array);
//                } else {
//                    // сообщение о том,что пациентов нет
//                }
//                break;
//            }
//            case "2"{
//                //найти по возрасту
//                break;
//            }
//        }
//
//    }
//
//    private static void printPacientArray(Pacient[] array) {
//
//        for(Pacient pacient: array){
//
//            System.out.println("name = " + pacient.getName()+
//            ", age = " + pacient.getAge());
//        }
//
//    }
//
//}
