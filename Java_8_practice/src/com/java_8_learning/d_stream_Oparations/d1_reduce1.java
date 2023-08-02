package com.java_8_learning.d_stream_Oparations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class d1_reduce1 {
    public static int getMultiplication(List<Integer> list){
        return list.stream().
                reduce(1,(a,b)->a*b); // Try with identity 0,2,...
    }
    public static Optional<Integer> getMultiplicationWithoutIdentity(List<Integer> list){
        return list.stream().
                reduce((a,b)->a*b);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,7);
        System.out.println("Multiplication:\n"+getMultiplication(list));
        Optional<Integer> result1 = getMultiplicationWithoutIdentity(list);
        System.out.println(result1.isPresent());
        System.out.println(result1.get());
        List<Integer> list1 = Arrays.asList();
        Optional<Integer> result2 = getMultiplicationWithoutIdentity(list1);
        System.out.println(result2.isPresent());
       // System.out.println(result2.get());

    }
}
