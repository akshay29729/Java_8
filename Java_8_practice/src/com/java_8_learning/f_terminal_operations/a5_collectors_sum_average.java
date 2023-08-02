package com.java_8_learning.f_terminal_operations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.stream.Collectors;

public class a5_collectors_sum_average {
    // summingInt and averageInt returns sum and averages values of elements..
    private static int summation(){
        return StudentDataBase.getAllStudents().stream().
                collect(Collectors.summingInt(Student::getNotebooks));
    }
    private static double averaging1(){
        return StudentDataBase.getAllStudents().stream().
                collect(Collectors.averagingInt(Student::getNotebooks));
    }
    private static double averaging2(){
        return StudentDataBase.getAllStudents().stream().
                collect(Collectors.averagingDouble(Student::getNotebooks));
    } // ding difference between averagingDouble and averagingInt..

    public static void main(String[] args) {
        System.out.println("Number of books: "+summation());
        System.out.println("Average1 no. of books: "+averaging1());
        System.out.println("Average2 no. of books: "+averaging2());
    }
}
