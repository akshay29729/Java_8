package com.java_8_learning.b_functional_Interfaces;

import java.util.function.BiConsumer;

public class b1_BiConsumer {
    public static void main(String[] args) {
        // 1
        BiConsumer<String,String> b1 = (a,b) -> {
            System.out.println("a:"+a+","+"b:"+b);
        };
        b1.accept("akshay","shinde");
        // 2
        BiConsumer<Integer,String> b2 = (a,b) -> {
            System.out.println("Name:"+b+","+"Grade:"+a);
        };
        b2.accept(8,"shinde");
        // 3
        BiConsumer<Integer,Integer> b3 =(a,b)->{
            System.out.println("Multiplication: "+a*b);
        };
        b3.accept(10,5);
        // 4
        BiConsumer<Integer,Integer> b4 =(a,b)->{
            System.out.println("Division: "+a/b);
        };
        b4.accept(10,5);
    }
}
