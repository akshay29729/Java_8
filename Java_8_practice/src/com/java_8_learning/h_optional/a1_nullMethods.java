package com.java_8_learning.h_optional;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.Optional;

public class a1_nullMethods {
    // 1
//    private static String getStudentName(){
////       Student student= StudentDataBase.studentSupplier();
//        Student student = null;
//       if (student!=null)
//           return student.getName();
//       return null;
//    }

    // 2
    private static Optional<String> getNameOptional(){
//        Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent =Optional.ofNullable(null);
        if (optionalStudent.isPresent())
            return optionalStudent.map(Student::getName);
        return Optional.empty(); // represents empty optional object..
    }
    public static void main(String[] args) {
//        // 1
//        String studentName = getStudentName();
//        if(studentName!=null)
//            System.out.println("Name Length: "+studentName.length());
//        else
//            System.out.println("No Name found");
//        // in case 1-we are having multiple 'null' checks..

        // 2
        Optional<String> stringOptional = getNameOptional();
        if (stringOptional.isPresent())
            System.out.println("Name length: "+stringOptional.get().length());
        else
            System.out.println("No Match found");

        // difference between 1&2
        // a: 1 returns 'null' which can be anything string,integer etc.
        //    but 2 returns only optional object..
        // b: We can perform operations on empty optional object returned by case:2
        //    but we can't perform any operation on null returned by case 1
    }
}
