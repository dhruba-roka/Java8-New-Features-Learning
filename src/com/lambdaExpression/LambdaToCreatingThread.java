package com.lambdaExpression;

public class LambdaToCreatingThread {
    public static void main(String[] args) {
        //thread without lambda
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is running....");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        //Thread with lambda
        Runnable runnable1=()->{
            System.out.println("Thread2 is running...");
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
