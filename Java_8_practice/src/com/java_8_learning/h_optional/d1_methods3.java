package com.java_8_learning.h_optional;

import java.util.Optional;

public class d1_methods3 {
    public static void main(String[] args) {
        // 1-isPresent
        Optional<String> stringOptional1 = Optional.ofNullable("Akshay");
        Optional<String> stringOptional2 = Optional.ofNullable(null);
        System.out.println(stringOptional1.isPresent());
        System.out.println(stringOptional2.isPresent());
        if (stringOptional1.isPresent())
            System.out.println(stringOptional1.get());

        // 2-ifPresent
        stringOptional1.ifPresent(s -> System.out.println(s));
        stringOptional2.ifPresent(s -> System.out.println(s));
    }
}
