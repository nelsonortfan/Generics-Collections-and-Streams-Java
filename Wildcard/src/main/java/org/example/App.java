package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void print(List<?> list){
        for(Object o : list){
            System.out.println(o.toString());
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,5,6,7);
        print(nums);
    }

}
