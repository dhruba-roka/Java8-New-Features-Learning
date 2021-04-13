package com.lambdaExpression;
//Without Lamda Expression:


//funcational interface=>interface having only one method
interface Drawable{
    public void draw();
}


public class WithoutLambdaExpressionExample {
    public static void main(String[] args) {
        int width=10;

        //without lambda, Drawable implementaion using anonymous class
        Drawable drawable = new Drawable() {
            @Override
            public void draw() {
                 System.out.println("Drawing "+width);
            }
        };
        drawable.draw();
    }



}
