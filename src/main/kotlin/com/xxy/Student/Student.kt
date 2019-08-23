package com.xxy.Student

import java.util.*

fun main(args:Array<String>) {
//
    val stu = Student("XXY", 90, 100)
    stu.print()
    println("High score:${stu.highest()}")
}

class Student(var name:String, var english:Int, var math:Int){
    fun print(){
        print(name+"\t"+english+"\t"+math+"\t"+getAverage()+if(getAverage()>=60)"PASS" else {
            "FAILED"
        })
    }

    fun getAverage():Int{
        return (english+math)/2
    }

    fun highest():Int{
        val max = if (english > math) {
            english
        } else {
            math
        }
        return max
    }
}


private fun Userinput() {
    val scanner = Scanner(System.`in`)
    println("Please input student's name:")
    val name = scanner.next()
    println("Please input student's englsih grade:")
    val english = scanner.nextInt()
    println("Please input student's math grade:")
    val math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
}

