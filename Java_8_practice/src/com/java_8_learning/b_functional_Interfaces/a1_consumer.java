package com.java_8_learning.b_functional_Interfaces;

import java.util.function.Consumer;

public class a1_consumer {
    public static void main(String[] args) {
        Consumer<String> s1 = (s) -> {
            System.out.println(s.toUpperCase());
        } ;
        s1.accept("java8");
        Consumer<Integer> s2 = (i) -> {
            System.out.println("Square of "+i+" is:"+ Math.pow(i,2));
        } ;
        s2.accept(20);
    }
}
