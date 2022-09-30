package org.JavaSourceCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Student implements Person {

    @Value("#{12}")
    private int id;
    @Value("#{'Liam McCabe'}")
    private String name;

    private List<Phone> ph;

   // @Value("#{T(org.JavaSourceCode.Address).this('Atlanta','GA','USA','30305')}")
    @Value("#{new org.JavaSourceCode.Address('Atlanta','GA','USA','30305')}")
    private Address add;
    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

    public Student() {

    }


    public void setAddress(Address add) {
        this.add = add;
    }

    @Override
    public void getID() {
        System.out.println("Student ID: "+ id);
    }

    @Override
    public void getName() {
        System.out.println("Student Name: " + name);
    }

    @Override
    public void getPhone() {
        System.out.println("Student Phone Numbers: ");
    for(int i = 0; i < ph.size(); i++){
        System.out.println(ph.get(i).getPhone() + ", ");};
    }

    @Override
    public void getAddress() {
        System.out.println(add.toString());
    }



}
