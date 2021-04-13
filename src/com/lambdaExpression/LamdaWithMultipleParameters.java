package com.lambdaExpression;

interface Addable{
    int add(int a, int b);
}

public class LamdaWithMultipleParameters {
    public static void main(String[] args) {

        //without lambda
        Addable addable = new Addable() {
            @Override
            public int add(int a, int b) {
                return (a+b);
                //System.out.println(a+b);
            }
        };
        System.out.println("withoutLambda: "+addable.add(5,3));

        //with lambda:
        Addable addable1=(int a, int b)->(a+b);
        System.out.println("Withlambda: "+ addable1.add(12,10));

        //or without datatype in lambda
        Addable addable2=(a,b)-> (a+b);
        System.out.println("withoutType: "+addable2.add(10,20));

    }
}
