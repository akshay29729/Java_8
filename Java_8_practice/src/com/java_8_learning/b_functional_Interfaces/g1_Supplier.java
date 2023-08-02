package com.java_8_learning.b_functional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class g1_Supplier {
    public static void main(String[] args) {
        // the 'get' method in it doesn't take any argument
        Supplier<Student> studentSupplier1 = ()-> new Student("akshay",3,4.5,
                "male", Arrays.asList("swimming","reading","cycling"));

        Supplier<List<Student>> studentSupplier2 =()-> StudentDataBase.getAllStudents();

        System.out.println("Student info:"+studentSupplier1.get());
        System.out.println("All Students:\n"+studentSupplier2.get());
    }
}
