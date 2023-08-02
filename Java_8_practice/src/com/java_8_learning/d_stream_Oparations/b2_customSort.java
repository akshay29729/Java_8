package com.java_8_learning.d_stream_Oparations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class b2_customSort {
    public static List<Student> sortByName(){
        return StudentDataBase.getAllStudents().stream().
                sorted(Comparator.comparing(Student::getName)).
                collect(Collectors.toList());
    }
    public static List<Student> sortByGpa(){
        return StudentDataBase.getAllStudents().stream().
                sorted(Comparator.comparing(Student::getGpa)).
                collect(Collectors.toList());
    }
    public static List<Student> sortByGrade(){
        return StudentDataBase.getAllStudents().stream().
                sorted(Comparator.comparing(Student::getGradeLevel)).
                collect(Collectors.toList());
    }
    public static List<Student> sortByGpaDesc(){
        return StudentDataBase.getAllStudents().stream().
                sorted(Comparator.comparing(Student::getGpa).reversed()).
                collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("Sort By Names ---");
        sortByName().forEach(System.out::println);
        System.out.println("Sort By Gpa ---");
        sortByGpa().forEach(System.out::println);
        System.out.println("Sort By Gpa Descending---");
        sortByGpaDesc().forEach(System.out::println);
        System.out.println("Sort By Grade ---");
        sortByGrade().forEach(System.out::println);
    }
}
