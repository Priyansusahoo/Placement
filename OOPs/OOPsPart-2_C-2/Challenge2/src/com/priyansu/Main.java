package com.priyansu;

public class Main {
    public static void main(String[] args) {
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getEmailAddress());

        VipCustomer person2 = new VipCustomer("priyansu", 5000);
        System.out.println(person2.getName());
        System.out.println(person2.getEmailAddress());

        VipCustomer person3 = new VipCustomer("Priya", 50000, "priya@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}