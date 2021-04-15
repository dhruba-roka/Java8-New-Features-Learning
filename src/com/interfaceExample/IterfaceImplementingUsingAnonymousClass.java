package com.interfaceExample;
//Anonymous class
//not required to write implements


interface Multiplyable{
    int multiply(int a, int b);
}

public class IterfaceImplementingUsingAnonymousClass{
//    @Override
//    public int multiply(int a, int b) {
//        return a*b;
//    }

    public static void main(String[] args) {
        Multiplyable multiplyable = new Multiplyable() {
            @Override
            public int multiply(int a, int b) {
                return a*b;
            }
        };
        int multiply = multiplyable.multiply(5, 6);
        System.out.println(multiply);
    }
}
