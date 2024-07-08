package org.example.spring.BeanObjects;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("250003", "meerut");
        Student student = new Student("abhay", 1, address);

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("factoryBean.xml");

        Student s1 = (Student) applicationContext.getBean("student");
        System.out.println("s1: " + s1);
    }
}
