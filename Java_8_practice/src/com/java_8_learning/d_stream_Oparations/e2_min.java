package com.java_8_learning.d_stream_Oparations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class e2_min {
    private static int minValue(List<Integer> list){
        return list.stream().
                reduce(Integer.MIN_VALUE,(a,b)-> a<b ? a:b); // this is the problem to give default values..
    }
    private static Optional<Integer> minValueOptional(List<Integer> list){
        return list.stream().
                reduce((a,b)-> a<b ? a:b);
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(11,23,1,-1,2);
        List<Integer> list2 = Arrays.asList();
        // 1
        System.out.println("Min value is:"+minValue(list1));
        System.out.println("Min value is:"+minValue(list2));
        // 2
        Optional<Integer> min1 = minValueOptional(list1);
        System.out.println(min1.isPresent());
        System.out.println((min1.get()));
        Optional<Integer> min2 = minValueOptional(list2);
        if(min2.isPresent())
            System.out.println(min2.get());
        else
            System.out.println("List is empty..");
    }
}
