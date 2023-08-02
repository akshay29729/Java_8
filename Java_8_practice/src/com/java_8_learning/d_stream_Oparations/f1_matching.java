package com.java_8_learning.d_stream_Oparations;

import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

public class f1_matching {
    private static  boolean allMatching(){
        return StudentDataBase.getAllStudents().stream().
                allMatch(student -> student.getGpa()>3.5);
               // return 'true' only if 'all' elements from stream matches the criteria
    }
    private static  boolean anyMatching(){
        return StudentDataBase.getAllStudents().stream().
                anyMatch(student -> student.getGpa()>3.5);
        // return 'true'  if 'any one' element from stream matches the criteria
    }
    private static  boolean noneMatching(){
        return StudentDataBase.getAllStudents().stream().
                noneMatch(student -> student.getGpa()>3.5);
        // return 'true'  if 'no' element from stream matches the criteria(opposite to allMatch)
    }
    public static void main(String[] args) {
        System.out.println(allMatching());
        System.out.println(anyMatching());
        System.out.println(noneMatching());

    }
}
