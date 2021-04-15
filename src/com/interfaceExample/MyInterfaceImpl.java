package com.interfaceExample;

public class MyInterfaceImpl implements MyInterface {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterfaceImpl();
        int sum = myInterface.sum(4, 6);
        System.out.println(sum);

    }

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}
