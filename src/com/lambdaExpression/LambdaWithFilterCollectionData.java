package com.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product{
    int id;
    String name;
    float price;
    public Product(int id,String name,float price){
     super();
     this.id=id;
     this.name=name;
     this.price=price;
    }
}

public class LambdaWithFilterCollectionData {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1,"samsung A5",15000));
        list.add(new Product(2,"iphone7+",50000));
        list.add(new Product(3,"sony",20000));
        list.add(new Product(4,"micromax",30000));
        list.add(new Product(5,"redmi",25000));

        //using lambda to filter data:
        Stream<Product> filteredData = list.stream().filter(p -> p.price>20000);

        Stream<Product> productStream = list.stream().filter(product -> product.price > 22000);

        //using lambda to iterate through collection:
        filteredData.forEach(product -> System.out.println(product.name+ " "+product.price));

        productStream.forEach(product -> System.out.println(product.id+" " + product.name+" "+ product.price));


    }
}
