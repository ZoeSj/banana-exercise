package Employ;

import java.io.*;

/**
 * @Auther shengjia
 * @Create 2019/7/18
 * @description:
 **/
public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesign) {
        designation = empDesign;
    }

    public void emSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("designation:" + designation);
        System.out.println("salary:" + salary);
    }

}
