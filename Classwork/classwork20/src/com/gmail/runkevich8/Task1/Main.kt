package com.gmail.runkevich8.Task1

fun main(arg: Array<String>){

    var student : Student = Student
    var student1 = Student

    student1.name = "jjj"



   var list = 5;
           //:MutableList<String>
    // val as final

    print("Koooo")
    test(list);
    //.......................
    val i =50;
    when(i){
        in 10..40 ->{
            //...
        }
            50 ->{

        //...
        }else ->{

        }
    }
    //..........................
    for (a in  arg){

    }
   //..........................
    var t : Int? = null
//    t?.compareTo(0.9) //если t равно нулю,то код данный невыполняется
//    t!!.compareTo(0.9) //не обходит эту ошибку стороной
//    if (t!= null){   //запись похожая, как в java
//        t.toString()
//    }

    var e: Byte = t?.toByte() ?: 25 //если т будет нулевое ,
    // то в байт первод, если не нулевое , то 25




}
fun test(value: Int){
    print("fr"+value)
}