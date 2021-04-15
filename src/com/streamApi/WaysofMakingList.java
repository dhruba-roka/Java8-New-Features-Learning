package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WaysofMakingList {
    public static void main(String[] args) {


        //method1: using of()
        //of() of List is immutable==>means that new data members cannot be added.
        List<Integer> list = List.of(2, 4, 6, 8, 10);
        //list.add(11);
        System.out.println(list);

        //Method2: using add()
        //its mutable. ie. new memebers can be added dyanmically
        List<String> list1 = new ArrayList<>();
        list1.add("ram");
        list1.add("shyaam");
        list1.add("hari");
        list1.add("sunita");

        System.out.println(list1);


        //method3: using Arrays.asList()
        //its also immutable. I.e. new memebers cant be added dynamically
        List<Integer> list2 = Arrays.asList(1, 2, 4, 5, 6, 7);
        //list2.add(100);
        System.out.println(list2);
    }
}
