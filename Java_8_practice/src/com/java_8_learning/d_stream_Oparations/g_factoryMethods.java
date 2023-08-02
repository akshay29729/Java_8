package com.java_8_learning.d_stream_Oparations;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class g_factoryMethods {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("akshay","bajirao", "shinde");
        s1.forEach(System.out::println);
        System.out.println("---------");
        Stream.iterate(1,x->x*2). // try with different seed value..
                limit(10). // try without limit..
                forEach(System.out::println);

        System.out.println("--------");
        Supplier<Integer> supplier = new Random()::nextInt; // generates random integers..
        Stream.generate(supplier).limit(10).forEach(System.out::println);
    }
}
