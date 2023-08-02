package com.java_8_learning.d_stream_Oparations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.Optional;

public class f2_finding {
    private static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream().
                filter(student -> student.getGpa()>=3.9). // optional...
                findFirst();
    }
    private static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream().
                findAny();
    }
    public static void main(String[] args) {
        Optional<Student> s1 = findFirst();
        if(s1.isPresent())
            System.out.println("First Find:"+s1.get());
        else
            System.out.println("Not Found...");

        // 2
        Optional<Student> s2 = findAny();
        if(s2.isPresent())
            System.out.println("First Any:"+s2.get());
        else
            System.out.println("Not Found...");
    }
}
