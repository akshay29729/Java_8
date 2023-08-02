package com.java_8_learning.g_parallel_processing;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class b_example {
    public static List<String> sequentialStringList(){
        long startTime = System.currentTimeMillis();
        List<String> list = StudentDataBase.getAllStudents().stream(). //  Stream<Student>
                map(Student::getActivities). // Stream<List<String>>
                flatMap(List::stream). // Stream<String>
                map(String::toUpperCase).
                collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential Performance time: "+(endTime-startTime));
        return list;
    }
    public static List<String> parallelStringList(){
        long startTime = System.currentTimeMillis();
        List<String> list = StudentDataBase.getAllStudents().stream(). //  Stream<Student>
                parallel().
                map(Student::getActivities). // Stream<List<String>>
                flatMap(List::stream). // Stream<String>
                map(String::toUpperCase).
                collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Parallel Performance time: "+(endTime-startTime));
        return list;
    }

    public static void main(String[] args) {
        sequentialStringList();
        parallelStringList();
    }
}
