package com.interfaceExample;

//MULTIPLE INHERITANCE ISNOT SUPPORTED THROUGH CLASS IN JAVA BUT IT IS POSSIBLE BY AN INTERFACE. WHY?
//MULTIPLE INHERITANCE ISNOT SUPPPORTED IN THE CASE OF CLASS BECAUSE OF AMBIGUITY.
//HOWEVER, IT IS SUPPOTED IN CASE OF AN INTERFACE BECAUSE THERE IS NO AMBUGUITY.
//IT IS BECAUSE ITS IMPLEMENTATION IS PROVIDED BY THE IMPLEMENTATION CLASS.


interface Printable{
    void print();
}

interface Showable{
    void show();
}

public class MultipleInheritanceUsingInterface implements Printable,Showable{

    @Override
    public void print() {
        System.out.println("This is printable interface");
    }

    @Override
    public void show() {
        System.out.println("this is showable interface");
    }

    public static void main(String[] args) {
        MultipleInheritanceUsingInterface multipleInheritanceUsingInterface = new MultipleInheritanceUsingInterface();
        multipleInheritanceUsingInterface.print();
        multipleInheritanceUsingInterface.show();

    }
}
