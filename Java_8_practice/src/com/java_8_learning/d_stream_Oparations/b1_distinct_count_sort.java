package com.java_8_learning.d_stream_Oparations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class b1_distinct_count_sort {
    public static List<String> stringList1(){
        List<String> list = StudentDataBase.getAllStudents().stream(). //  Stream<Student>
                map(Student::getActivities). // Stream<List<String>>
                flatMap(List::stream). // Stream<String>
                map(String::toUpperCase).
                distinct(). // Stram<String> with dictict elements
                sorted().  // sorting..
                collect(Collectors.toList());
        return list;
    }
    public static long getCount(){
        return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).
                       distinct().count();
    }
    public static void main(String[] args) {
        System.out.println(stringList1());
        System.out.println(getCount());
    }

}
