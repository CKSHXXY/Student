package com.xxy.Student

fun main(args:Array<String>) {
    val stu=Student( "XXY", english = 55, math = 40)
    stu.print()
}

class Student(var name:String, var english:Int, var math:Int){
    fun print(){
        println(name+"\t"+english+"\t"+math)
    }
    
}