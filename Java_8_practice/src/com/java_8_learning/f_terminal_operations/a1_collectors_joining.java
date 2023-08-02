package com.java_8_learning.f_terminal_operations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.stream.Collectors;

public class a1_collectors_joining {
    // 'joining' used to concatenate strings and return 'string'..
    private static String joining1(){
        return StudentDataBase.getAllStudents().stream().
                map(Student::getName).
                collect(Collectors.joining());
    }
    private static String joining2(){
        return StudentDataBase.getAllStudents().stream().
                map(Student::getName).
                collect(Collectors.joining(","));
    }
    private static String joining3(){
        return StudentDataBase.getAllStudents().stream().
                map(Student::getName).
                collect(Collectors.joining(",","(",")"));
    }
    public static void main(String[] args) {
        System.out.println("Joining 1: "+joining1());
        System.out.println("Joining 2: "+joining2());
        System.out.println("Joining 3: "+joining3());
    }
}
