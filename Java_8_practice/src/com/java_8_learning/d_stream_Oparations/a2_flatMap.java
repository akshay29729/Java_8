package com.java_8_learning.d_stream_Oparations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a2_flatMap {
    // flatMap is works same as 'map'..but it is used when each element in stream reperesnts
    // multiple elements..
    // ex- Stram<List>..

    public static List<String> stringList(){
        List<String> list = StudentDataBase.getAllStudents().stream(). //  Stream<Student>
                              map(Student::getActivities). // Stream<List<String>>
                              flatMap(List::stream). // Stream<String>
                              map(String::toUpperCase).
                              collect(Collectors.toList());
        return list;
    }

    public static Set<String> stringSet(){
        Set<String> set = StudentDataBase.getAllStudents().stream(). //  Stream<Student>
                map(Student::getActivities). // Stream<List<String>>
                flatMap(List::stream). // Stream<String>
                map(String::toUpperCase).
                collect(Collectors.toSet());
        return set;
    }
    public static void main(String[] args) {
        System.out.println(stringList());
        System.out.println("--------------------------------");
        System.out.println(stringSet());
    }
}
