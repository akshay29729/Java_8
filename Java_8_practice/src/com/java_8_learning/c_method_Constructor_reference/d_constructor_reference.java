package com.java_8_learning.c_method_Constructor_reference;

import com.java_8_learning.b_functional_Interfaces.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class d_constructor_reference {
    static Supplier<Student> supplierConstructor = Student::new; // for this we created empty constructor
                                                                // in 'Student' class
    static Function<String,Student> functionConstructor = Student::new;
               // for this we created constructor with one string argument..
    public static void main(String[] args) {
        System.out.println(supplierConstructor.get());
        System.out.println(functionConstructor.apply("Akshay"));
    }
}
