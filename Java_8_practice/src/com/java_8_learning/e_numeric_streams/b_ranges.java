package com.java_8_learning.e_numeric_streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class b_ranges {
    public static void main(String[] args) {
        // 1 IntStream
        System.out.println("Int Stream:range");
        IntStream.range(1,50).forEach(value -> System.out.print(value+","));
        System.out.println("\nInt Stream:range closed");
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));

        // 2 longStream
        System.out.println("\nLong Stream:range");
        LongStream.range(1,50).forEach(value -> System.out.print(value+","));
        System.out.println("\nLong Stream:range closed");
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value+","));

        // 3 DoubleStream-it doesn't support range functions..
        System.out.println("\nInt Stream as double..:range");
        IntStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value+","));
        System.out.println("\nLong Stream as double..:range");
        LongStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value+","));
    }
}
