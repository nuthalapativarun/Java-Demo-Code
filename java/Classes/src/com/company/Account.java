package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public Account(){
        this("3456", 3.0, "John Doe", "john@gmail.com", "5012931230");
        System.out.println("Empty constructor calleed");
    }

    public Account(String number, double balance, String customerName, String emailAddress, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String emailAddress, String phoneNumber) {
        this("9999", 100.55, customerName, emailAddress, phoneNumber);
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawl(double withdrawl){
        if(this.balance < withdrawl){
            System.out.println("Only " + this.balance + " available. Withdraw not processed");
        }else{
            this.balance -= withdrawl;
            System.out.println("Withdrawl of " + withdrawl + " processed. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
