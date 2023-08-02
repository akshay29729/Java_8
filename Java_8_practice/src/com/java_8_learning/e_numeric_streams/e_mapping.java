package com.java_8_learning.e_numeric_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class e_mapping {
    private static List<Integer> mapToObject(){ // it maps numeric stream elements to any objects..
        return IntStream.rangeClosed(1,5).
               mapToObj(i->{
                   return new Integer(i); // here we can use any class that accepts 'int' and creates object
               }).
                collect(Collectors.toList());
    }

    private static long mapToLong(){
        return IntStream.rangeClosed(1,5).
                mapToLong(i->i).  // convert intstream to longstream
                sum();
    }
    private static double mapToDouble(){
        return IntStream.rangeClosed(1,5).
                mapToDouble(i->i).  // convert intstream to longstream
                        sum();
    }
    public static void main(String[] args) {
        System.out.println("Object Mapping: "+mapToObject());
        System.out.println("Long Mapping:"+mapToLong());
        System.out.println("Double Mapping:"+mapToDouble());
    }
}
