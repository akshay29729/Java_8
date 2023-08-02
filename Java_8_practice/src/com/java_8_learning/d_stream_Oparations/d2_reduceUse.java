package com.java_8_learning.d_stream_Oparations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.Optional;

public class d2_reduceUse {
    public static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream().
                reduce((s1,s2)->{ // reduce ((s1,s2)->(s1.getGpa()>=s2.getGpa())?s1:s2)
                    if(s1.getGpa()>=s2.getGpa())
                        return s1;
                    else
                        return s2;
                });
    }
    public static void main(String[] args) {
        Optional<Student> student = getHighestGpaStudent();
        System.out.println(student.isPresent());
        System.out.println(student.get());
    }
}
