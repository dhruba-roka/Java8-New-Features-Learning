package com.lambdaExpression;

interface Sayable{
    public void say();
}

public class LambdaExpressionNoparameter {
    public static void main(String[] args) {
//        //without lambda
//        Sayable sayable = new Sayable() {
//            @Override
//            public void say() {
//                System.out.println("without lambda expression and No parameter");
//            }
//        };
//        sayable.say();


        //with lambda expression
        Sayable sayable=()-> {
            System.out.println("lambda expression with 0 parameter");
        };
        sayable.say();
    }
}
