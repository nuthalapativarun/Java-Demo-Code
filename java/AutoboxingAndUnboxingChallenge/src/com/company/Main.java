package com.company;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Chase");
        if(bank.addBranch("San Jose")){
            System.out.println("San Jose branch created");
        }

        bank.addCustomer("San Jose", "Varun", 20.56);
        bank.addCustomer("San Jose", "Jason", 95.32);
        bank.addCustomer("San Jose", "Mark", 542.21);

        bank.addBranch("Oakland");
        bank.addCustomer("Oakland", "Pike", 220.96);

        bank.addCustomerTransaction("San Jose", "Varun", 12.90);
        bank.addCustomerTransaction("San Jose", "Jason", 1.50);
        bank.addCustomerTransaction("San Jose", "Mark", 39.10);

        bank.listCustomers("San Jose", true);
        bank.listCustomers("Oakland", true);

        bank.addBranch("Dublin");
        if(!bank.addCustomer("Dublin", "Brian", 5.53)){
            System.out.println("Dublin branch doesnt exist");
        }

        if(!bank.addBranch("Dublin")){
            System.out.println("Dublin branch already exists");
        }

        if(!bank.addCustomerTransaction("San Jose", "Jim", 2.99)){
            System.out.println("Customer doesn't exist at branch");
        }

        if(!bank.addCustomer("San Jose", "Varun", 1.29)){
            System.out.println("Customer Varun already exists");
        }


    }
}
