package com.java_8_learning.b_functional_Interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class e3_functionalUse {
    // 1 without filter
    static Function<List<Student>, Map<String,Double>> studentFunction = (studentList)->{
        HashMap<String,Double> namesAndGpa = new HashMap<String, Double>();
        studentList.forEach((student)->{
            namesAndGpa.put(student.getName(),student.getGpa());
        });
        return namesAndGpa;
    };
    // 2 with filter using predicate conditions
    static Function<List<Student>, Map<String,Double>> studentFunction2 = (studentList)->{
        HashMap<String,Double> namesAndGpa = new HashMap<String, Double>();
        studentList.forEach((student)->{
            if (c2_predicateUse.p1.and(c2_predicateUse.p2).test(student))
                namesAndGpa.put(student.getName(),student.getGpa());
        });
        return namesAndGpa;
    };
    public static void main(String[] args) {
        System.out.println("List of students and their grades:\n"+studentFunction.apply(StudentDataBase.getAllStudents()));
        System.out.println("List of students and their grades using filter:\n"+studentFunction2.apply(StudentDataBase.getAllStudents()));

    }
}
