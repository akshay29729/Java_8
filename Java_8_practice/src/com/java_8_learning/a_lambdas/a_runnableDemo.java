package com.java_8_learning.a_lambdas;

public class a_runnableDemo {
    public static void main(String[] args) {
        // 1
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 1");
            }
        };
        new Thread(r1).start();

        // 2
        Runnable r2 = () -> {System.out.println("runnable 2");};
        new Thread(r2).start();

        // 3
        Runnable r3 = () -> System.out.println("runnable 3");
        new Thread(r3).start();

        // 4
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable 4");
            }
        }).start();

        // 5
        new Thread(() -> System.out.println("runnable 5")).start();
    }
}
