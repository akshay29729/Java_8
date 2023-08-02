package com.java_8_learning.f_terminal_operations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class b1_groupingBy {
    // groupingBy is used to group elements based on any comparison and gives output as Map<K,V>.

    private static void groupByGender(){
         Map<String, List<Student>> listMap= StudentDataBase.getAllStudents().stream().
         // key is gender which is string and value is list of students matching key..
                collect(Collectors.groupingBy(Student::getGender));
        System.out.println(listMap);
    }
    private static void groupByGpa(){
        Map<String, List<Student>> listMap= StudentDataBase.getAllStudents().stream().
                // key is gender which is string and value is list of students matching key..
                        collect(Collectors.groupingBy(student -> student.getGpa()>=3.8? "Outstanding":"Average"));
        System.out.println(listMap);
    }
    public static void main(String[] args) {
        groupByGender();
        groupByGpa();
    }
}
