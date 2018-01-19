package com.gmail.runkevich8.Task3

import com.gmail.runkevich8.Task2.Student

fun main(arg: Array<String>){
    //название затем тип

    print(78)
    print("jkrfj")

    //изменяемое поэтому var
    var student: Int = 2


    //val = final - неизменяемое не имеет сеттеры и геттеры
    val student1 = Student()
    val student3 = "Ko"

    val list = listOf<Int>()
    val list1 = mutableListOf<String>()

    val a = test(name = "name", title = "title")

}
fun test(title:String, name: String): String {

    return "Doooo"
}