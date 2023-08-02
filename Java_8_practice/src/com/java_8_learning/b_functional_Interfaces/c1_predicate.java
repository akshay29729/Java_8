package com.java_8_learning.b_functional_Interfaces;

import java.util.function.Predicate;

public class c1_predicate {
    // 2
    static Predicate<Integer> p3 = (i)-> i%5==0;
    static Predicate<Integer> p4 = (i)-> i%10==0;

    public static boolean predicateAND(int i){
        return p3.and(p4).test(i);
    }
    public static boolean predicateOR(int i){
        return p3.or(p4).test(i);
    }
    public static boolean predicateNEGATE(int i){
        return p3.or(p4).negate().test(i);
    }
    public static void main(String[] args) {
//        //1
//        Predicate<Integer> p1 = (i)-> {return  i%2==0;};
//        System.out.println(p1.test(2));
//        System.out.println(p1.test(5));
//
//        Predicate<String> p2 =(s)->{
//            return s.toLowerCase().equals("akshay");
//        };
//        System.out.println(p2.test("Akshay"));

        //2
        System.out.println(predicateAND(10));
        System.out.println(predicateAND(15));

        System.out.println(predicateOR(10));
        System.out.println(predicateOR(15));

        System.out.println(predicateNEGATE(10));
        System.out.println(predicateNEGATE(15));
    }
}
