package com.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithoutUsingStreamApi {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9);

        //without using stream
        List<Integer> listEven = new ArrayList<>();
        for(Integer i : list1){
            if(i%2==0){
                listEven.add(i);
            }

        }
        System.out.println("List of all elements:  "+list1);
        System.out.println("List of only even elements without using STREAM:  "+listEven);

        //USING STREAM:
        Stream<Integer> stream = list1.stream();
        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("List of even elements using STREAM:  "+newList);

        //USING STREAM SHORTCUTS:
        List<Integer> newList1 = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("shortcuts to list even elements using STREAM:  "+newList1);

    }

}
