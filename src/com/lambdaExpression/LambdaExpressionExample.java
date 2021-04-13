package com.lambdaExpression;

@FunctionalInterface
interface Drawable1{
    public void draw();
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width=10;

        //with lambda
        Drawable1 drawable1=()->{
            System.out.println("lambda Expression example");
        };
        drawable1.draw();
    }
}
