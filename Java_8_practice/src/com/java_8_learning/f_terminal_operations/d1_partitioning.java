package com.java_8_learning.f_terminal_operations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class d1_partitioning {
    // partitioningBy takes predicate as input and gives map as output having key-boolean

    private static void partitionByGpa1(){
        Predicate<Student> predicate = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> booleanListMap= StudentDataBase.getAllStudents().stream().
                collect(Collectors.partitioningBy(predicate));
        System.out.println(booleanListMap);
    }
    // we can give 'collectors' as second input to it..
    private static void partitionByGpa2(){
        Predicate<Student> predicate = student -> student.getGpa()>=3.8;
        Map<Boolean, Set<Student>> booleanListMap= StudentDataBase.getAllStudents().stream().
                collect(Collectors.partitioningBy(predicate,Collectors.toSet()));
        System.out.println(booleanListMap);
    }
    public static void main(String[] args) {
        partitionByGpa1(); // output is list..
        partitionByGpa2(); // output is set..
    }
}
