package com.gmail.runkevich8.Task1;

public class Manager {//долден хранить массив паиентов

    private  Pacient[] pacientArray;
    /**
     *Создаем пациентов для тестирования программы
     */

    public void createTestData(){

        pacientArray = new Pacient[2];

        pacientArray[0] = new Pacient();
        pacientArray[1] = new Pacient();
    }
    /**
    *@return Возвращает массив пациентов
    */
    public Pacient[] getPacientArray() {
        return pacientArray;
    }
    /**
     *@return Возвращает пациентов с заданным именем
     */
    public Pacient[] searchByName(String name){

        //поиск по пациентам

        Pacient[] search = new Pacient[pacientArray.length];

        int i = 0;
        for (Pacient pacient: pacientArray){
            if(pacient.getName().toLowerCase()
                    .equals(name.toLowerCase())){
                search[i] = pacient;
                i++;
            }

        }
        Pacient[] searchFinal = new Pacient[i];

        System.arraycopy(search, 0,searchFinal,0,i);

        return searchFinal;
    }

    /**
     *@return Возвращает пациентов с заданным возрастом
     */
    public Pacient[] searchByAge(int age){


        return null;
    }

}

