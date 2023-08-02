package com.java_8_learning.d_stream_Oparations;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

public class d3_map_filter_reduce {
    // add 'Notebooks' variable in student class and also set getter-setter for it..
    private static int getTotalNotebooks(){
        return StudentDataBase.getAllStudents().stream(). // Stream<Student>
               filter(student -> student.getGpa()>=3).
               map(Student::getNotebooks).
               reduce(0,(a,b)->a+b);
    }
    public static void main(String[] args) {
        System.out.println("Number of notebooks: "+getTotalNotebooks());
    }
}
