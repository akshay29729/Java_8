package com.java_8_learning.c_streams;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class a_streamsUse {
    // in 'BiFunctional' example,we created map of students name and activities..
    // we will do same using streams..
    public static void main(String[] args) {
        // 1
        Map<String, List<String>> studentMap1 = StudentDataBase.getAllStudents().stream().
                         collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap1);

        // 2
        Map<String, List<String>> studentMap2 = StudentDataBase.getAllStudents().stream().
                filter(Student-> Student.getGpa()>=3.9).
                collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap2);

        // 3
        Predicate<Student> predicate = (s)-> s.getGradeLevel()>=3;
        Map<String, List<String>> studentMap3 = StudentDataBase.getAllStudents().stream().
                filter(predicate).
                collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap3);

        // 4
        Map<String, List<String>> studentMap4 = StudentDataBase.getAllStudents().stream().
                filter(predicate).
                filter(Student-> Student.getGpa()>=3.9).
                collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap4);
    }
}
