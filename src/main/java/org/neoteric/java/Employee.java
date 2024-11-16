package org.neoteric.java;

public class Employee //implements Comparable<Employee>
 {


//    @Override
//    public int compareTo(Employee o) {
//        return 0;
//    }

    private String empid;

    private String name;

    public Employee(String empid,String name){
        this.empid=empid;
        this.name=name;
    }

    public String getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }
}
