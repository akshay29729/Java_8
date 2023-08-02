package com.java_8_learning.f_terminal_operations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class a4_collectors_min_max {
    // minBy and maxBy takes comparator as input parameter and returns optional as output
    private static Optional<Student> minByGpa(){
        return StudentDataBase.getAllStudents().stream().
                collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }
    private static Optional<Student> maxByGpa(){
        return StudentDataBase.getAllStudents().stream().
                collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }
    public static void main(String[] args) {
        System.out.println(minByGpa().get());
        System.out.println(maxByGpa().get());
    }
}
