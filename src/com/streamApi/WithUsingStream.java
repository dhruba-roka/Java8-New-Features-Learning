package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WithUsingStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(integerList);

        //WITHOUT STREAM:
//        ArrayList<Integer> oddList = new ArrayList<>();
//        for(Integer j : integerList){
//            if(j%2!=0){
//                oddList.add(j);
//            }
//        }
//        System.out.println(oddList);

        //WITH STREAM: SHORTCUTS
        List<Integer> collect = integerList.stream().filter(j -> j % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);


        //WITH STREAM: LONGCUTS
        Stream<Integer> stream = integerList.stream();
        List<Integer> collect1 = stream.filter(i -> i % 2 == 1).collect(Collectors.toList());
        System.out.println(collect1);

    }
}
