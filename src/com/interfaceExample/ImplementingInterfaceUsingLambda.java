package com.interfaceExample;

//implementing labda in interface implementation:

interface Subtractable{
    int subtract(int a, int b);
}

public class ImplementingInterfaceUsingLambda {

    public static void main(String[] args) {

        //USING ANONYMOUS METHOD:
//        Subtractable subtractable = new Subtractable() {
//            @Override
//            public int subtract(int a, int b) {
//                return a-b;
//            }
//        };
//
//        int subtractResult = subtractable.subtract(10, 5);
//        System.out.println(subtractResult);



        //USING LAMBDA METHOD:
//        Subtractable subtractable=(int a, int b) -> {
//            return a-b;
//        };
//
//        int result = subtractable.subtract(15, 90);
//        System.out.println(result);



        //USING LAMBDA METHOD, MORE SHORTER FORM:
        Subtractable subtractable =(a,b) -> a-b;

        int subtract = subtractable.subtract(68, 39);
        System.out.println(subtract);

    }
}
