package com.java_8_learning.c_method_Constructor_reference;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class c_refactoring_lambda {
    // we can't refactor all lambda expressions...

//    static Predicate<Student> p1 = (s) ->s.getGradeLevel()>=3;

    static Predicate<Student> p1 = c_refactoring_lambda::getStudentsWithGrade;
    static boolean getStudentsWithGrade(Student s){
        if(s.getGradeLevel()>=3)
            return true;
        else {
            System.out.println("Not eligible:");
            return false;
        }
    }
    public static void main(String[] args) {
        List<Student> list1 = StudentDataBase.getAllStudents();
        list1.forEach(student -> {
            if(p1.test(student))
                System.out.println(student);
        });
    }
}
