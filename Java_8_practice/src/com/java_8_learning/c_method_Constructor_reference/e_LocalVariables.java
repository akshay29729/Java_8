package com.java_8_learning.c_method_Constructor_reference;

import java.util.function.Consumer;

public class e_LocalVariables {
    static int value1 =1;

    public static void main(String[] args) {
        int value2=11;
        // 1- We can't use 'local variable' as 'argument' in lambda
//        Consumer<Integer> c1 =(value2)->{
//            System.out.println("Value:"+value2);;
//        }

        //2 - we can't modify 'local' variable in lambda function
//        Consumer<Integer> c2 = (i)->{
//            value2++;
//            System.out.println(i+value2);
//        };

        // 3
        Consumer<Integer> c3 = (i)->{
            System.out.println((i+value2));
        };
        c3.accept(5);

        // 4 - there is no restrictions on 'instance' variables
        Consumer<Integer> c4 = value1->{
            System.out.println(value1+value1);
        };
        c4.accept(5);

        System.out.println(value1);
        Consumer<Integer> c5 = i->{
            value1++;
            System.out.println(i+value1);
        };
        c5.accept(5);
        System.out.println(value1);
    }
}
