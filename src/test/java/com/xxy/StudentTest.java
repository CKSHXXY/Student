package com.xxy;

import com.xxy.Student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest{
    @Test
    public void scoreTest(){
        Student student = new Student("XXY", 60, 80);
        Assertions.assertEquals(80, student.highest());
    }
}
