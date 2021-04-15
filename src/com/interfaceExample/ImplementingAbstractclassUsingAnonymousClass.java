package com.interfaceExample;

abstract class Divisible{
    abstract int divide(int a, int b);
}

public class ImplementingAbstractclassUsingAnonymousClass {


    public static void main(String[] args) {
        Divisible divisible = new Divisible() {
            @Override
            int divide(int a, int b) {
                return a/b;
            }
        };
        System.out.println(divisible.divide(10,5));

    }
}
