package com.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LamdaForeachLoop {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ram");
        list.add("shyam");
        list.add("hari");
        list.add("gita");
        list.add("manil");

        for (String name:list){
            System.out.println(name);
        }

        System.out.println("foreach loop------------");
        list.forEach(name->{
            System.out.println(name);
        });

        System.out.println("foreach loop with lambda and omitiming parentheis");
        list.forEach(n-> System.out.println(n));


    }
}
