package com.java_8_learning.b_functional_Interfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class d1_combineAllAbove {
    Predicate<Student> p1 = (s)-> s.getGradeLevel()>=3;
    Predicate<Student> p2 = (s)-> s.getGpa()>=3.9;
    BiConsumer<String,List<String>> b1 = (name,activities)->{
        System.out.println("Name:"+name+" and "+"Activities:"+activities);
    };
    Consumer<Student> c1 = (s) ->{
      if(p1.and(p2).test(s)){
          b1.accept(s.getName(),s.getActivities());
      }
    };
    public void getNamesAndActivities(List<Student> list){
        list.forEach(c1);
    }
    public static void main(String[] args) {
        List<Student> list1 = StudentDataBase.getAllStudents();
        new d1_combineAllAbove().getNamesAndActivities(list1);
    }
}
