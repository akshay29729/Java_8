package com.java_8_learning.i_default_static_methods;

import java.util.*;

public class a1_intro {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList( "Akshay","Amar","Anil","Amit","Andy");
        List<String> list2 = Arrays.asList( "Akshay","Amar","Anil","Amit","Andy");
        // before java 8
        Collections.sort(list1);
        System.out.println("Before Java-8: "+list1);
        // after java 8
        list2.sort(Comparator.naturalOrder());
        System.out.println("After Java-8 Normal: "+list2);
        list2.sort(Comparator.reverseOrder());
        System.out.println("After Java-8 Reversed: "+list2);
    }
}
