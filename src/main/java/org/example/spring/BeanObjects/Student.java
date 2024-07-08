package org.example.spring.BeanObjects;

public class Student {
    String name;
    int rollNum;
    Address address;

    public Student(String name, int rollNum, Address address) {
        this.name = name;
        this.rollNum = rollNum;
        this.address = address;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
