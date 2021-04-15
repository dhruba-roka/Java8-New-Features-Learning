package com.interfaceExample;

//Implementing interface using the class

interface Addable{
    void add();
}

public class InterfaceImpl1 implements Addable{
    @Override
    public void add() {
        System.out.println("additon result is: 10");
    }

    public static void main(String[] args) {
        Addable addable = new InterfaceImpl1();
        addable.add();
    }
}
