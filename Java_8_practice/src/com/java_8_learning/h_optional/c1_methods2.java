package com.java_8_learning.h_optional;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.Optional;

public class c1_methods2 {
    // 1-orELse
    private static String orElseMethod(){
//        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        String name = optionalStudent.map(Student::getName).orElse("Akshay");
        return name;
    }

    // 2-OrElseGet
    private static String orElseGetMethod(){
//        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        String name = optionalStudent.map(Student::getName).orElseGet(()-> "Akshay");
        return name;
    }
    // 3-OrElseThrow
    private static String orElseThrowMethod(){
//        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        String name = optionalStudent.map(Student::getName).orElseThrow(()->new RuntimeException("No name found"));
        return name;
    }

    public static void main(String[] args) {
        System.out.println("OrElse:"+orElseMethod());
        System.out.println("OrElseGet:"+orElseGetMethod());
        System.out.println("OrElseGet:"+orElseThrowMethod());
    }
}
