package org.neoteric.java;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapTest {
    public static void main(String[] args) {

        Employee employee=new Employee("1","sai11");
        Employee employee1=new Employee("2","sai");

        Map<EnumMapType,Employee> enumMapEmployee=new EnumMap<>(EnumMapType.class);
        enumMapEmployee.put(EnumMapType.fulltime,employee);
        enumMapEmployee.put(EnumMapType.parttime,employee1);
        enumMapEmployee.put(EnumMapType.intern,employee);

        System.out.println(enumMapEmployee);
        System.out.println(enumMapEmployee.get(EnumMapType.parttime).getName());
        System.out.println(enumMapEmployee.get(EnumMapType.intern).getName());
        System.out.println(enumMapEmployee.get(EnumMapType.fulltime).getName());
        System.out.println(enumMapEmployee.size());


//        Employee employee2=new Employee("1","sai");
//        Employee employee3=new Employee("1","sai");
//
//        Map<String,EnumMapType> enumMapEmployee1=new EnumMap<>(EnumMapType.class);
//        enumMapEmployee1.put(EnumMapType.fulltime,EnumMapType.fulltime);
//        enumMapEmployee1.put("",EnumMapType.parttime);
//        enumMapEmployee1.put("",EnumMapType.intern);
//
//        System.out.println(enumMapEmployee1);
//        System.out.println(enumMapEmployee1.get(EnumMapType.intern));
//        System.out.println(enumMapEmployee1.get(EnumMapType.fulltime));
//        System.out.println(enumMapEmployee1.size());

    }
}
