package com.java_8_learning.b_functional_Interfaces;

import java.util.function.Function;

public class e1_functional {
    static Function<String,String> capitalize = (name)-> name.toUpperCase();
    static Function<String,String> addString = (name)->name.toLowerCase().concat("_default");

    public static String addAndCapitalize1(String s){
        return capitalize.andThen(addString).apply(s);
    }
    public static String addAndCapitalize2(String s){
        return capitalize.compose(addString).apply(s);
    }

    public static void main(String[] args) {

        System.out.println("Capitalizing:"+ capitalize.apply("akshay"));
        System.out.println("Adding string:"+ addString.apply("AkshAy"));
        System.out.println("Add and Capitalize1:"+ e1_functional.addAndCapitalize1("AkshAy"));
        System.out.println("Add and Capitalize2:"+ e1_functional.addAndCapitalize2("AkshAy"));

    }
}
