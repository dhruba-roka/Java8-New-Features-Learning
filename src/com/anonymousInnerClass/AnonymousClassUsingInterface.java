package com.anonymousInnerClass;

interface Eatable{
    void eat();
}

public class AnonymousClassUsingInterface {
    public static void main(String[] args) {
        Eatable eatable = new Eatable() {
            @Override
            public void eat() {
                System.out.println("Anonymous inner class using the interface example");

            }
        };

        eatable.eat();
    }
}
