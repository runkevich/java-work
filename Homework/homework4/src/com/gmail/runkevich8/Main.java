package com.gmail.runkevich8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg) throws IOException {


        Patient patient1 = new Patient();
        patient1.setFIO("Лешкевич Лариса Петровна");
        patient1.setAge(32);
        patient1.setDiagnosis(true);

        Patient patient2 = new Patient();
        patient2.setFIO("Козак Василий Петрович");
        patient2.setAge(12);
        patient2.setDiagnosis(false);

        Patient patient3 = new Patient();
        patient3.setFIO("Козак Лариса Игоривна");
        patient3.setAge(32);
        patient3.setDiagnosis(true);

        Patient[] patientsArray = {patient1, patient2, patient3};


        for (Patient patient : patientsArray){
            printPatient(patient);
        }

        System.out.println("\nВыбери критерий поиска 1 - поиск по имени; 2 - поиск по возрасту.");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        switch (i){
            case 1 :
                findFIO(patientsArray);
                break;
            case 2:
                findAge(patientsArray);
                break;
            default:
                System.out.println("Отказ в поиске");
                break;
        }

    }

    private static void findAge(Patient[] patientsArray) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите возраст пациента:");

        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < patientsArray.length; i++) {
            if (patientsArray[i].getAge() == t) {
                printPatient(patientsArray[i]);
            }
        }
    }

    private static void findFIO(Patient[] patientsArray) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ФИО пациента:");

        String t = bufferedReader.readLine();
        for (int i = 0; i < patientsArray.length; i++)
            if (patientsArray[i].getFIO().toUpperCase().contains(t.toUpperCase())) {
            printPatient(patientsArray[i]);
            }
    }

    private static void printPatient(Patient patient) {
        System.out.println("Пациент  " + patient.getFIO() + " - Возраст = " + patient.getAge());

    }

}
