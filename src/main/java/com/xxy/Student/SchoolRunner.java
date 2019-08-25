package com.xxy.Student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        Userinput();
        Student.pass = 50;
        Student stu = new Student("Hank", 50, 80);
        Student stu2 = new Student("Jeff", 50, 30);
        Student stu3 = new Student("Eric", 70, 30);
        stu.print();
        stu2.print();
        stu3.print();
        GraduateStudent gstu = new GraduateStudent("Jack", 60, 60, 60);
        gstu.print();
        System.out.println("High score:"+"\t" + stu.highest());
    }

    private static void Userinput() {
        System.out.println("Please input student's name:");
//        System.out.println("Please input student's englsih grade:");
//        System.out.println("Please input student's math grade:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Please input student's englsih grade:");
        int english = scanner.nextInt();
        System.out.println("Please input student's math grade:");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score:" + stu.highest());
    }
}
