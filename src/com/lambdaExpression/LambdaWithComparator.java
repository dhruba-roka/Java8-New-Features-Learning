package com.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product1{
    int id;
    String name;
    float price;

    public Product1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaWithComparator {
    public static void main(String[] args) {
        List<Product1> list = new ArrayList<>();
        list.add(new Product1(1,"HP laotop",20000));
        list.add(new Product1(2,"Dell laotop",25000));
        list.add(new Product1(3,"Apple laotop",30000));
        list.add(new Product1(4,"Acer laotop",40000));

        System.out.println("Sorting on the basis of name: ----");

        //implementing lambda expression:
        Collections.sort(list,(p1,p2) -> {
            return p1.name.compareTo(p2.name);
        });

        //traversing values:
        for(Product1 p:list){
            System.out.println(p.id+" "+p.name+" "+p.price);
        }
    }
}
