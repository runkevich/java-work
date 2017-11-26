package com.gmail.runkevich8;

public class Student {

    private String FIO ;
    private int age;
    boolean diagnosis=false;

//    public Student(String FIO, int age, boolean diagnosis) {
//        this.FIO = FIO;
//        this.age = age;
//        this.diagnosis = diagnosis;
//    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(boolean diagnosis) {
        this.diagnosis = diagnosis;
    }
}
