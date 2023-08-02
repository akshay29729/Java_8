package com.java_8_learning.d_stream_Oparations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class c1_filter {
    public static List<Student> getFemalesOnly(){
        return StudentDataBase.getAllStudents().stream(). // stream<Student>
                filter(student -> student.getGender().toLowerCase().equals("female")). // stream<Student>
                // passing stream of female student only
                filter(student -> student.getGpa()>=3.9). // we can add many filters..
                collect(Collectors.toList());
    }
    public static void main(String[] args) {
      getFemalesOnly().forEach(System.out::println);
    }
}
