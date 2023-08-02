package com.java_8_learning.f_terminal_operations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class b3_groupBy {
    // we provided two inputs to groupBy..
    // the default return type for it is "HashMap".
    // if we wanna change it.. we can send it as input to groupingBy(classifier,required Type,collectors)

    private static void groupByNames(){
      LinkedHashMap<String, Set<Student>> stringSetLinkedHashMap=  StudentDataBase.getAllStudents().stream().
                collect(Collectors.groupingBy(Student::getName,
                                              LinkedHashMap::new,
                                              Collectors.toSet()));
        System.out.println(stringSetLinkedHashMap);
    }
    public static void main(String[] args) {
        groupByNames();
    }
}
