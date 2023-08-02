package com.java_8_learning.c_method_Constructor_reference;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.function.Consumer;

public class b_consumer {
    static Consumer<Student> c1 = (s) -> System.out.println(s);
    static Consumer<Student> c2 = System.out::println;
    // create a method in "Student" class that will print all activities..
    static Consumer<Student> c3 = Student::printActivities;
    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(c1);
        System.out.println("-----\n");
        StudentDataBase.getAllStudents().forEach(c2);
        System.out.println("-----\n");
        StudentDataBase.getAllStudents().forEach(c3);
    }
}
