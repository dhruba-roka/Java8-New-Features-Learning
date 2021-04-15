package com.interfaceExample;

//MULTIPLE INHERITANCE ISNOT SUPPORTED THROUGH CLASS IN JAVA BUT IT IS POSSIBLE BY AN INTERFACE. WHY?
//MULTIPLE INHERITANCE ISNOT SUPPPORTED IN THE CASE OF CLASS BECAUSE OF AMBIGUITY.
//HOWEVER, IT IS SUPPOTED IN CASE OF AN INTERFACE BECAUSE THERE IS NO AMBUGUITY.
//IT IS BECAUSE ITS IMPLEMENTATION IS PROVIDED BY THE IMPLEMENTATION CLASS.

interface Printable1{
    void print();
}

interface Showable1{
    void print();
}

public class MultipleInheritanceInInterface implements Printable1,Showable1{
    @Override
    public void print() {
        System.out.println("In case of interface, there's no chance of ambiguity.");
    }

    public static void main(String[] args) {
        MultipleInheritanceUsingInterface m = new MultipleInheritanceUsingInterface();
        m.print();

    }


}

//PRINTABLE1 AND SHOWABLE1 INTERFACE HAVE SAME METHODS BUT ITS IMPLEMENTATIONS IS PROVIDED BY CLASS
// MULTIPLEINHERITANCEININTERFACE, SO THERES NO ANY AMBIGUITY.