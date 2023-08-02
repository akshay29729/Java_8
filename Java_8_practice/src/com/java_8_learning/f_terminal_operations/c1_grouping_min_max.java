package com.java_8_learning.f_terminal_operations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class c1_grouping_min_max {
    private static void groupByMaxGpa1(){
       Map<Integer, Optional<Student>> integerOptionalMap= StudentDataBase.getAllStudents().stream().
                collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(integerOptionalMap);
    }
    private static void groupByMaxGpa2(){
        Map<Integer,Student> integerOptionalMap= StudentDataBase.getAllStudents().stream().
                collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(integerOptionalMap);
    }
    private static void groupByLeastGpa(){
        Map<Integer,Student> integerOptionalMap= StudentDataBase.getAllStudents().stream().
                collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(integerOptionalMap);
    }
    public static void main(String[] args) {
        groupByMaxGpa1();
        groupByMaxGpa2();
        groupByLeastGpa();
    }
}
