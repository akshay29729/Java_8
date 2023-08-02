package com.java_8_learning.b_functional_Interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class e4_BiFunctional {
    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> bifunctional
             = (studentList,studentPredicate)->{
        HashMap<String,Double> studentMap = new HashMap<>();
        studentList.forEach((student -> {
            if(studentPredicate.test(student)) // used gpa condition from predicate example..
                studentMap.put(student.getName(),student.getGpa());
        }));
        return studentMap;
    };
    public static void main(String[] args) {
        System.out.println("Students with gpa >=3.8:"+ bifunctional.apply(
                StudentDataBase.getAllStudents(),c2_predicateUse.p2));
    }
}
