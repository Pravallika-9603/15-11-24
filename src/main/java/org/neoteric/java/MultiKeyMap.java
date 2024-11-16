package org.neoteric.java;

import java.util.*;

public class MultiKeyMap {
    public static void main(String[] args) {

        Employee employee=new Employee("1","sai");
        Employee employee1=new Employee("2","churi");

        Map<List<String>,Employee> multiKeyMap=new HashMap<>();
        multiKeyMap.put(Arrays.asList("a","b"),employee);
        multiKeyMap.put(Arrays.asList("c","d"),employee1);
        multiKeyMap.put(Arrays.asList("c","d"),employee);

        System.out.println(multiKeyMap);
        System.out.println(multiKeyMap.size());
        System.out.println(multiKeyMap.get(Arrays.asList("a","b")).getName());
        System.out.println(multiKeyMap.get(Arrays.asList("c","d")).getName());


    }
}
