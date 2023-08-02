package com.java_8_learning.g_parallel_processing;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class a_timeSaving {
    // Parallel processing follows:1-Divides data source in parts
    //                             2- Processes each part separately
    //                             3- Adds all results at end.
    private static long checkResults(Supplier<Integer> supplier,int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i=0;i<numberOfTimes;i++)
            supplier.get();
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }
    private static int sequentialProcessing(){
        return IntStream.rangeClosed(1,1000000).sum();
        // if range is small, sequential will be faster
    }
    private static int parallelProcessing(){
        return IntStream.rangeClosed(1,1000000).
                parallel().sum();
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential Time: "+checkResults(a_timeSaving::sequentialProcessing,20));
        System.out.println("Parallel Time: "+checkResults(a_timeSaving::parallelProcessing,20));
    }
}
