package com.java_8_learning.d_stream_Oparations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class e1_max {
    private static int maxValue(List<Integer> list){
        return list.stream().
                reduce(0,(a,b)-> a>b ? a:b);
    }
    private static Optional<Integer> maxValueOptional(List<Integer> list){
        return list.stream().
                reduce((a,b)-> a>b ? a:b);
    }
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(11,23,1,-1,2);
        List<Integer> list2 = Arrays.asList();
        // 1
        System.out.println("Max value is:"+maxValue(list1));
        System.out.println("Max value is:"+maxValue(list2)); // it returns '0' for empty list..
        // 2
        Optional<Integer> max1 = maxValueOptional(list1);
        System.out.println(max1.isPresent());
        System.out.println((max1.get()));
        Optional<Integer> max2 = maxValueOptional(list2);
        if(max2.isPresent())
            System.out.println(max2.get());
        else
            System.out.println("List is empty..");
    }
}
