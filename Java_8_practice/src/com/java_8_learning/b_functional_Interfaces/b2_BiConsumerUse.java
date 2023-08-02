package com.java_8_learning.b_functional_Interfaces;

import java.util.List;
import java.util.function.BiConsumer;

public class b2_BiConsumerUse {
    public static void getNamesAndActivities(){
        List<Student> list1 = StudentDataBase.getAllStudents();
        BiConsumer<String,List<String>> b1 = (name,activities) ->{
            System.out.println(name+":"+activities);
        };
        list1.forEach(student -> {
            b1.accept(student.getName(),student.getActivities());
        });
    }
    public static void main(String[] args) {
        getNamesAndActivities();
    }
}
