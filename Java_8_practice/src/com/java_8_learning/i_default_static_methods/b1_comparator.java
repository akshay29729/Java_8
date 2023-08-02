package com.java_8_learning.i_default_static_methods;

import com.java_8_learning.b_functional_Interfaces.Student;
import com.java_8_learning.b_functional_Interfaces.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class b1_comparator {
    static Consumer<Student> consumer = student -> System.out.println(student);
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);
    private static void sortByName(List<Student> studentList){
        studentList.sort(nameComparator);
        System.out.println("After Comparator");
        studentList.forEach(consumer);
    }
    private static void sortByGpa(List<Student> studentList){
        studentList.sort(gpaComparator);
        System.out.println("After Comparator");
        studentList.forEach(consumer);
    }
    private static void sortByGpaAndName(List<Student> studentList){
        studentList.sort(gpaComparator.thenComparing(nameComparator));
        System.out.println("After Comparator");
        studentList.forEach(consumer);
    }
    // add 'null' in the list that 'getAllStudents' method is going to return..(add any number of nulls)
    // above comparators will give 'null point exception..'
    private static void sortWithNull(List<Student> studentList){
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);// also try nullsLast
        studentList.sort(studentComparator);
        System.out.println("After Comparator");
        studentList.forEach(consumer);
    }
    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Before Comparator: ");
        studentList.forEach(consumer);
        // 1
//        sortByName(studentList);
//        sortByGpa(studentList);
//        sortByGpaAndName(studentList);
        sortWithNull(studentList);
    }
}
