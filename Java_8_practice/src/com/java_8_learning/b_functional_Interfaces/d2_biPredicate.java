package com.java_8_learning.b_functional_Interfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class d2_biPredicate {
    BiPredicate<Integer,Double> bi1 = (a,b)-> a>=3&&b>=3.9;

    BiConsumer<String, List<String>> b1 = (name, activities)->{
        System.out.println("Name:"+name+" and "+"Activities:"+activities);
    };
    Consumer<Student> c1 = (s) ->{
        if(bi1.test(s.getGradeLevel(),s.getGpa())){
            b1.accept(s.getName(),s.getActivities());
        }
    };
    public void getNamesAndActicities2(List<Student> list){
        list.forEach(c1);
    }
    public static void main(String[] args) {
        List<Student> list1 = StudentDataBase.getAllStudents();
        new d2_biPredicate().getNamesAndActicities2(list1);
    }
}
