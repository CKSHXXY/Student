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
//        println("\t"+grading())

    }

//    fun grading(): Char {
//        return if (getAverage() in 90..100) {
//            'A'
//        }
//        else if (getAverage() in 80..89) {
//            'B'
//        }
//        else if (getAverage() in 70..79) {
//            'C'
//        }
//        else if (getAverage() in 60..69) {'D'}
//
////            else 'F'
//    }

    fun getAverage() = (english+math)/2


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

