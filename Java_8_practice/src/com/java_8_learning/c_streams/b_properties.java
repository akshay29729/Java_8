package com.java_8_learning.c_streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class b_properties {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("akshay");
        list.add("Bajirao");
        list.add("Shinde");
        list.remove(0); // we can add,remove and modify collections..
        // 1
        Stream<String> stream = list.stream(); // We don't have methods to add,remove and modify streams..
                                  // we can't do changes in stream...

        // 2 - We can iterate through stream only once..
        stream.forEach(System.out::println);
        System.out.println("------------");
//        stream.forEach(System.out::println);

        // 3- we can access elements from stream only in sequence..
    }
}
