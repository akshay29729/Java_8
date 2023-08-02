package com.java_8_learning.b_functional_Interfaces;

import java.util.List;
import java.util.function.Predicate;

public class c2_predicateUse {
    static Predicate<Student> p1 = (s)-> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s)-> s.getGpa()>=3.8;

    public static void gradeFilter(){
        List<Student> list1 = StudentDataBase.getAllStudents();
        list1.forEach((student -> {
            if(p1.test(student))
                System.out.println(student);
        }));
    }
    public static void gpaFilter(){
        List<Student> list1 = StudentDataBase.getAllStudents();
        list1.forEach((student -> {
            if(p2.test(student))
                System.out.println(student);
        }));
    }
    public static void gpaANDgradeFilter(){
        List<Student> list1 = StudentDataBase.getAllStudents();
        list1.forEach((student -> {
            if(p1.and(p2).test(student))
                System.out.println(student);
        }));
    }
    public static void gpaANDgradeFilter2(){
        List<Student> list1 = StudentDataBase.getAllStudents();
        list1.forEach((student -> {
            if(p1.and(p2).negate().test(student))
                System.out.println(student);
//            else
//                System.out.println(student);
        }));
    }
    public static void main(String[] args) {
        gradeFilter();
        System.out.println("------------------");
        gpaFilter();
        System.out.println("------------------");
        gpaANDgradeFilter();
        System.out.println("------------------");
        gpaANDgradeFilter2();
    }
}
