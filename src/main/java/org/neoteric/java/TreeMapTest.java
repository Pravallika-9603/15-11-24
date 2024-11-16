package org.neoteric.java;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {




//
//                Employee employee=new Employee("1","sai");
//                Employee employee1=new Employee("2","churi");
//                Employee employee2=new Employee("2","hari");
////String and obj combination
//                Map<String,Employee> employeeMap=new TreeMap<>();
//
//                employeeMap.put(employee.getEmpid(),employee);
//                employeeMap.put(employee1.getEmpid(),employee1);
//                employeeMap.put(employee2.getEmpid(),employee2);
//
//                System.out.println(employeeMap);
//                System.out.println(employeeMap.get("1").getName());
//                System.out.println(employeeMap.get("2").getName());
//                System.out.println(employeeMap.get("2").getName());
//                System.out.println(employeeMap.size());

//                Employee emp=new Employee("1","sai");
//                Employee emp1=new Employee("2","churi");
//                Employee emp2=new Employee("2","hari");
////obj and obj combination
//                Map<Employee,Employee> employeeMap1=new TreeMap<>();
//
//                employeeMap1.put(emp,emp);
//                employeeMap1.put(emp1,emp1);
//                employeeMap1.put(emp2,emp2);
//
//                System.out.println(employeeMap1);
//                System.out.println(employeeMap1.get(emp).getName());
//                System.out.println(employeeMap1.get(emp1).getName());
//                System.out.println(employeeMap1.get(emp2).getName());
//                System.out.println(employeeMap1.size());



        Employee emp = new Employee("1", "sai");
        Employee emp1 = new Employee("2", "churi");
        Employee emp2 = new Employee("2", "hari");

        Map<Employee, Employee> employeeMap1 = new TreeMap<>();

        employeeMap1.put(emp, emp);
        employeeMap1.put(emp1, emp1);
        employeeMap1.put(emp2, emp2);

        System.out.println(employeeMap1);
        System.out.println(employeeMap1.get(emp).getName());
        System.out.println(employeeMap1.get(emp1).getName());
        System.out.println(employeeMap1.get(emp2).getName());
        System.out.println(employeeMap1.size());





//                Employee akhi=new Employee("22","akhi");
//                Employee lekhya=new Employee("11","lekhya");
//               Employee mahi=new Employee("22","mahi");
////String and String combination
//                Map<String,String> employeeMap2=new TreeMap<>();
//
//                employeeMap2.put(akhi.getEmpid(), akhi.getName());
//                employeeMap2.put(lekhya.getEmpid(), lekhya.getName());
//                employeeMap2.put(mahi.getEmpid(), mahi.getName());
//
//                System.out.println(employeeMap2);
//                System.out.println(employeeMap2.get("11"));
//                System.out.println(employeeMap2.get("22"));
//                System.out.println(employeeMap2.get("22"));
//                System.out.println(employeeMap2.size());




            }

        }




