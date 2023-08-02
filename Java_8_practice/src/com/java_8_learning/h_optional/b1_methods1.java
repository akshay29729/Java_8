package com.java_8_learning.h_optional;

import java.util.Optional;

public class b1_methods1 {
    private static Optional<String> ofNullableMethod(){
        return Optional.ofNullable("hello"); // it accepts 'null' also and for 'null' returns Optional
                                            // empty object..
    }
    private static Optional<String> ofMethod(){
        return Optional.of("hello"); // it gives 'null point exception' for 'null' input
    }
    private static Optional<String> emptyMethod(){
        return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println("OfNullable: "+ofNullableMethod());
        System.out.println("of: "+ofMethod());
        System.out.println("Empty: "+emptyMethod());
        System.out.println("---------");
        System.out.println("OfNullable: "+ofNullableMethod().isPresent());
        System.out.println("of: "+ofMethod().isPresent());
        System.out.println("Empty: "+emptyMethod().isPresent());
        System.out.println("-----------");
        System.out.println("OfNullable: "+ofNullableMethod().get());
        System.out.println("of: "+ofMethod().get());
        System.out.println("Empty: "+emptyMethod().get()); // can't p
    }
}
