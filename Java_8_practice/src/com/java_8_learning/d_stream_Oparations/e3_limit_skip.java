package com.java_8_learning.d_stream_Oparations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class e3_limit_skip {
    private static Optional<Integer> withoutLimit(List<Integer> list){
        return list.stream().
                reduce((a,b)->a+b);
    }
    private static Optional<Integer> withLimit(List<Integer> list){
        return list.stream().
                limit(3).
                reduce((a,b)->a+b);
    }
    private static Optional<Integer> withSkip(List<Integer> list){
        return list.stream().
                skip(3).
                reduce((a,b)->a+b);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,7,8,9,10);
        Optional<Integer> sum1 = withoutLimit(list);
        System.out.println(sum1.get());
        Optional<Integer> sum2 = withLimit(list);
        System.out.println(sum2.get());
        Optional<Integer> sum3 = withSkip(list);
        System.out.println(sum3.get());

    }
}
