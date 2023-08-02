package com.java_8_learning.b_functional_Interfaces;

import java.util.List;
import java.util.function.Consumer;

public class a2_consumerUse {
    static Consumer<Student> c1 = (student) -> System.out.println(student.getName());
    static Consumer<Student> c2 = (student) -> System.out.print(student.getName()+":");
    static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());
    public static void printNames(){
        List<Student> list1 = StudentDataBase.getAllStudents();
        list1.forEach(c1);
    }
    public static void getNameAndActivities(){
        List<Student> list1 = StudentDataBase.getAllStudents();
        list1.forEach(c2.andThen(c3));
    }
    public static void getStudentsWithCondition(){
        List<Student> list1 = StudentDataBase.getAllStudents();
        list1.forEach((x -> { // we can take variable 'student' instead of 'x' for continuity...
            if(x.getGradeLevel()>=3){
                c2.andThen(c3).accept(x);
            }
        }));
    }
    public static void main(String[] args) {
        printNames();
        System.out.println("---------------------------------------");
        getNameAndActivities();
        System.out.println("---------------------------------------");
        getStudentsWithCondition();
    }
}
