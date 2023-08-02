package com.java_8_learning.e_numeric_streams;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class c_aggregate {
    public static void main(String[] args) {
        // 1-sum
        int sum = IntStream.rangeClosed(1,50).sum();
        System.out.println("Summation: "+sum);

        // 2 max
        OptionalInt integer = IntStream.rangeClosed(1,50).max();
        System.out.println("\nMax element: "+ (integer.isPresent()?integer.getAsInt():0));

        // 3 min
        OptionalLong optionalLong = LongStream.rangeClosed(1,50).min();
        System.out.println("\nMin element: "+ (optionalLong.isPresent()?optionalLong.getAsLong():0));

        // 4 average
        OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
        System.out.println("\nAverage: "+ (optionalDouble.isPresent()?optionalDouble.getAsDouble():0));

        // try all above with empty range..(0,0)
    }
}
