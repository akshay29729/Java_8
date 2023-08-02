package com.java_8_learning.b_functional_Interfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

// binary is used instead of 'BiFunction' interface when both inputs and output are of same type
// binary extends bifunction
public class f2_BinaryOperator {
    static BinaryOperator<Integer> binaryOperator1 = (a,b)-> a*b;
    static Comparator<Integer> comparator = (a,b)-> a.compareTo(b);
    public static void main(String[] args) {
        System.out.println("Multiplication:"+binaryOperator1.apply(3,4));
        BinaryOperator<Integer> maxIs = BinaryOperator.maxBy(comparator);
        BinaryOperator<Integer> minIs = BinaryOperator.minBy(comparator);
        System.out.println("Maximum integer is:"+maxIs.apply(3,4));
        System.out.println("Minimum integer is:"+minIs.apply(3,4));
    }
}
