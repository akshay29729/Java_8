package com.java_8_learning.b_functional_Interfaces;

import java.util.function.UnaryOperator;

// unary is used instead of 'Function' interface when input and outputs are of same type
// unary extends function
public class f1_UnaryOperator {
    static UnaryOperator<String> unaryOperator = (s)-> s.concat("_default");
    static UnaryOperator<Integer> unaryOperator2 = (i)-> i*i;
    public static void main(String[] args) {
        System.out.println("Adding:"+unaryOperator.apply("Akshay"));
        System.out.println("Squaring:"+unaryOperator2.apply(5));
    }
}
