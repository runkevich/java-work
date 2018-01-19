package com.gmail.runkevich8.Task2;

import java.io.File;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Main {

    private Student student = new Student();//сильная ссылка
    private static SoftReference<Student> studentSoftReference1 =
           new SoftReference<Student>(new Student()); //мягка ссылка

    private static WeakReference<Student> studentSoftReference2 =
            new WeakReference<Student>(new Student());


    public static void main(String[] args) {
        Student student = studentSoftReference2.get();

        Main main = new Main();

    }

    public static void readF(String path){//для читки файла в папках (аргументы)
        File file = new File(path);
        for (File f: file.listFiles()){    //насколько много можно вызывать рекусрию??
            if (f.isDirectory()){
                readF(f.getAbsolutePath());
            } else {
                //lfkjrlk
            }
        }

    }
}
