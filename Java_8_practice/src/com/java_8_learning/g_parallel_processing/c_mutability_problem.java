package com.java_8_learning.g_parallel_processing;

import java.util.stream.IntStream;

class Sum{
    int total; // mutable variable..
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public void addNumber(int number){
        total+=number;
    }
}
public class c_mutability_problem {
    public static void main(String[] args) {
        Sum s = new Sum();
        Sum s1 = new Sum();
        IntStream.rangeClosed(1,10000).
                forEach(s::addNumber);
        System.out.println(s.getTotal());
        IntStream.rangeClosed(1,10000).
                parallel().
                forEach(s1::addNumber);
        System.out.println(s1.getTotal()); // run parallel 2,3 times..each time we get different output
        // this is because- 'total' is mutable variable from 'sum' class which gets accessed
        // by many threads at same time.So for each thread 'total' value is different while performing
        // 'addNumber' method..
        // This is the problem of parallel processing with mutable variables..
    }
}
