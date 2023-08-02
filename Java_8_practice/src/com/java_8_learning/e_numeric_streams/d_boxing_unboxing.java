package com.java_8_learning.e_numeric_streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class d_boxing_unboxing {
    private static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10).
                // elements as 'int'
                boxed().  // converting primitive type to wrapper class type..
                // elements as 'Integer'
                collect(Collectors.toList());
    }
    private static int unboxing(List<Integer> list){
        return  list.stream().
                // elements as 'Integer'
                mapToInt(Integer::intValue). // unboxing: converting wrapper class type to primitive type.
                // elements as 'int'
                sum();
    }
    public static void main(String[] args) {
        System.out.println("Boxing: "+boxing());
        List<Integer> list = boxing();
        System.out.println("Unboxing: "+unboxing(list));
    }
}
