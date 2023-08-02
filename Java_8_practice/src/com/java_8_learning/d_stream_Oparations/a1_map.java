package com.java_8_learning.d_stream_Oparations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class a1_map {
    // we can use 'map' to convert types(student->string,etc..) and also can perform many operations
    // (uppercase,etc...)
    public static List<String> namesList(){
        List<String> list= StudentDataBase.getAllStudents().stream(). // Stream<Student>
                map(Student::getName).    // converted to Stream<String>
                map(String::toUpperCase). // map to make string upper case
                collect(Collectors.toList());
        return list;
    }

    public static Set<String> namesSet(){
        Set<String> set= StudentDataBase.getAllStudents().stream(). // Stream<Student>
                map(Student::getName).    // converted to Stream<String>
                map(String::toUpperCase). // map to make string upper case
                collect(Collectors.toSet());
        return set;
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println("-----------");
        System.out.println(namesSet());
    }
}
