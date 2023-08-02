package com.java_8_learning.f_terminal_operations;

import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.stream.Collectors;

public class a2_collectors_counting {
    // counting gives the 'number of elements' from results...

    private static long counting1(){
        return StudentDataBase.getAllStudents().stream().
                collect(Collectors.counting());

        // we can get same result using 'size' method on 'getAllStudents'
        // 'counting' is useful when we need count based on some conditions..
    }
    private static long counting2(){
        return StudentDataBase.getAllStudents().stream().
                filter(student -> student.getGpa()>=3.9).
                collect(Collectors.counting());
    }
    public static void main(String[] args) {
        System.out.println("Number of Students: "+counting1());
        System.out.println("Number of Students with Gpw>3.9 : "+counting2());
    }
}
