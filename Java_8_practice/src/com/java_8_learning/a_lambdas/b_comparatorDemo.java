package com.java_8_learning.a_lambdas;

import java.util.Comparator;

public class b_comparatorDemo {
    public static void main(String[] args) {
        // 1
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Output 1 :" + c1.compare(3,2));

        // 2
        Comparator<Integer> c2 = (Integer a,Integer b) ->{return a.compareTo(b);};
        System.out.println("Output 2 :" + c2.compare(3,2));

        // 3
        Comparator<Integer> c3 = (Integer a,Integer b) -> a.compareTo(b);
        System.out.println("Output 3 :" + c3.compare(3,2));

        // 4
        Comparator<Integer> c4 = (a,b) -> a.compareTo(b);
        System.out.println("Output 4 :" + c4.compare(3,2));

        // 5
        Comparator<Integer> c5 = (a,b) -> b.compareTo(a);
        System.out.println("Output 5 :" + c5.compare(3,2));

        // 6
        Comparator<Integer> c6 = (a,b) -> {return - b.compareTo(a);};
        System.out.println("Output 6 :" + c6.compare(3,2));

//        // 7
//        Comparator<int> c5 = (a,b) -> a.compareTo(b);
//        System.out.println("Output 5 :" + c5.compare(3,2));

        // 8
        Comparator<String> c7 =(a,b) -> a.compareTo(b);
        System.out.println("Output 7 :" + c7.compare("Akshay","Akshay"));

        // 9
        Comparator<String> c8 =(a,b) -> a.compareTo(b);
        System.out.println("Output 8 :" + c8.compare("Akshay","Anil"));
    }
}
