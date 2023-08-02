package com.java_8_learning.h_optional;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.Optional;

public class e1_methods4 {
    // 1-filter
    private static void filterMethod(){
       Optional<Student> optionalStudent= Optional.ofNullable(StudentDataBase.studentSupplier.get());
       optionalStudent.filter(student -> student.getGpa()>=3.5).
               ifPresent(student -> System.out.println(student));
    }
    // 2-map
    private static void mapMethod(){
        Optional<Student> optionalStudent= Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (optionalStudent.isPresent()){
           Optional<String> stringOptional= optionalStudent.
                   filter(student -> student.getGpa()>3). // try with 4
                   map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    // 3-flatMap - it is used to get optional object from another optional object
    // create 'Bike' class with fields name,model and set getter-setters
    // create a optional bike field in 'student' class,set getter-setter and add this field to 'studentSupplier' method
    private static void flatMapMethod(){
        Optional<Student> optionalStudent= Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> stringOptional=optionalStudent.
                         filter(student -> student.getGpa()>=3.5). // Optional<Student<Optional<Bike>>>
                         flatMap(Student::getBike). // Optional<Bike>
                         map(Bike::getName);
        System.out.println(stringOptional);
        System.out.println(stringOptional.get());
    }

    public static void main(String[] args) {
        filterMethod();
        mapMethod();
        flatMapMethod();
    }
}
