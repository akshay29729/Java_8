package com.java_8_learning.e_numeric_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class a_intro {
    // numeric streams represents only 'Primitive' values..
    private static int sumOfNumbers(List<Integer> list){
        return list.stream().
                reduce(0,(a,b)->a+b); // here 'unboxing' takes place for each element
                                             // to convert 'Integer' to 'int'..
    }

    private static int sumUsingIntStream(){
        return IntStream.rangeClosed(1,5).sum();
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("Normal Stream..:"+sumOfNumbers(list));
        System.out.println("Int Stream..:"+sumUsingIntStream());
    }
}
