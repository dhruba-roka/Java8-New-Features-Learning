package com.anonymousInnerClass;

abstract class Person{
    abstract void eat();
}

public class AnonymousClassUsingClassExample {
    public static void main(String[] args) {
        Person person = new Person() {

            @Override
            void eat() {
                System.out.println("anonymous class example using class");

            }
        };
        person.eat();
    }
}
