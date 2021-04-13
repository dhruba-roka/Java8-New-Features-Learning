package com.lambdaExpression;
interface Readable{
    public void read(int num);
}

public class LambdaWithSingleParameter {
    public static void main(String[] args) {

        //without lambda
        Readable readable = new Readable() {
            @Override
            public void read(int num) {
                System.out.println("without lambda and single parameter: " + num);
            }
        };
        readable.read(10);


        //with lambda
        Readable readable1 = (int num) -> {
            System.out.println("with lambda and single parameter: " + num);
        };
        readable1.read(12);


        //with lambda and omiting parenthesis
        Readable readable2 = num -> {
            System.out.println("with lambda and single parameter omitting parenthesis: " + num);
        };
        readable2.read(22);

    }
}
