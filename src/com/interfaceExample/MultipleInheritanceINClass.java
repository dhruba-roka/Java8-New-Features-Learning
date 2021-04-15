package com.interfaceExample;

//MUTIPLE INHERITANCE IS NOT VALID IN CASE OF JAVA CLASS BUT IT IS IMPLEMENTED THROUGH THE INTERFACE.

class Print{
    void print(){
        System.out.println("print1");
    }
}

class Show{
    void print(){
        System.out.println("print2");
    }
}

public class MultipleInheritanceINClass extends Print{
    public static void main(String[] args) {
        MultipleInheritanceINClass m1 = new MultipleInheritanceINClass();
        m1.print();
    }
}

class AnotherClass extends Show{
    public static void main(String[] args) {
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.print();
    }

}
