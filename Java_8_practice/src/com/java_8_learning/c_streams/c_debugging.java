package com.java_8_learning.c_streams;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class c_debugging {
    public static void main(String[] args) {
        Predicate<Student> predicate = (s)-> s.getGradeLevel()>=3;
        Map<String, List<String>> studentMap4 = StudentDataBase.getAllStudents().stream().
                peek(student -> System.out.println("Before Filter---\n"+student)).
                filter(predicate).
                peek(student -> System.out.println("After Filter 1---\n"+student)).
                filter(Student-> Student.getGpa()>=3.9).
                peek(student -> System.out.println("After Filter 2---\n"+student)).
                collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap4);
    }
}
