package com.java_8_learning.f_terminal_operations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class b2_groupingBy {
    // in groupingBy along with 'classifier' we can also give any 'collector' as second input..
    private static void groupingByGradeAndGpa(){
       Map<Integer,Map<String, List<Student>>> integerMapMap= StudentDataBase.getAllStudents().stream().
        // grade is integer, key is map having string-key and student_list-value
                collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa()>=3.9? "Outstanding":"Average")));
        System.out.println(integerMapMap);
    }
    private static void groupingByNameAndNotebooks(){
        Map<String,Integer> integerMapMap= StudentDataBase.getAllStudents().stream().
                // grade is integer, key is map having string-key and student_list-value
                        collect(Collectors.groupingBy(Student::getName,
                        Collectors.summingInt(Student::getNotebooks)));
        System.out.println(integerMapMap);
    }
    public static void main(String[] args) {
     groupingByGradeAndGpa();
        groupingByNameAndNotebooks();
    }
}
