package com.company;

public class Main {

    public static void main(String[] args) {
//	    Car toyota = new Car();
//	    Car honda = new Car();
//	    toyota.setModel("pamry");
////        System.out.println("Model is " + toyota.getModel());
//
//        Account bofa = new Account("12345", 0.00, "Varun", "varun@gmail.com", "7418529630");
//        System.out.println(bofa.getCustomerName());
//        bofa.withdrawl(100);
//
//        bofa.deposit(50);
//        bofa.withdrawl(100);
//
//        bofa.deposit(51);
//        bofa.withdrawl(100);
//
//        Account sofi = new Account("Sofi", "sofi@gmail.com", "12345");
//        System.out.println(sofi.getNumber() + " name " + sofi.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100, "tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
