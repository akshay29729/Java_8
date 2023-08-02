package com.java_8_learning.f_terminal_operations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class a3_collectors_mapping {
    public static void main(String[] args) {
        // mapping apply transformation function first and then groups data in required collection form
        // 1 - we did it before
        List<String> list1 =StudentDataBase.getAllStudents().stream().
                map(Student::getName).
                collect(Collectors.toList());
        System.out.println(list1);
        // 2
        List<String> list2 =StudentDataBase.getAllStudents().stream().
                collect(Collectors.mapping(Student::getName,Collectors.toList()));
        System.out.println(list2);

        // 3
        Set<String> set = StudentDataBase.getAllStudents().stream().
                collect(Collectors.mapping(Student::getName,Collectors.toSet()));
        System.out.println(set);
    }
}
