package com.xxy.Student

import java.util.*

fun main(args:Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Please input student's name:")
    var name = scanner.next()
    println("Please input student's englsih grade:")
    var english = scanner.nextInt()
    println("Please input student's math grade:")
    var math = scanner.nextInt()
    val stu=Student( name, english, math)
    stu.print()
}

class Student(var name:String, var english:Int, var math:Int){
    fun print(){
        println(name+"\t"+english+"\t"+math)
    }

}