package org.XML;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Student implements Person {



    private int id;
    private String name;
    private ArrayList<Phone> ph;
    private Address add;
    public Student(int id, String name, ArrayList<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
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
