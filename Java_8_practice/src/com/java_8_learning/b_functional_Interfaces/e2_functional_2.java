package com.java_8_learning.b_functional_Interfaces;
// use of function created...
public class e2_functional_2 {
    public String addString2(String s){
        return e1_functional.addString.apply(s);
    }
    public static void main(String[] args) {
        System.out.println("Add:"+new e2_functional_2().addString2("akshay"));

    }
}
