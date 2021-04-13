package com.lambdaExpression;

interface Playable{
    String play(String message);
}

public class LambdaWithMultipleStatements {
    public static void main(String[] args) {

        //you can pass multiple statements in lambda expression:
        Playable playable = message -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(playable.play("Time is precious."));

    }
}
