package com.java_8_learning.c_method_Constructor_reference;

import java.util.function.Function;

public class a_function {
    static Function<String,String> usingLambda = (s)-> s.toUpperCase();
    static Function<String,String > usingMethodReference = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(usingLambda.apply("Akshay"));
        System.out.println(usingMethodReference.apply("Akshay"));
    }
}
