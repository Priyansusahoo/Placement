package com.priyansu;
public class Account {
    private int number;
    private int balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;
    //constructor
    public Account(int number,int balance,String customerName,
                   String customerEmailAddress,String customerPhoneNumber){
        System.out.println("Constructor with parameter called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    //deposit funds
    public void depositFunds(int deposit){
        this.balance += deposit;
        System.out.println("current balance after deposit of "
                + deposit + "Rs is "
                + this.balance + "Rs");
    }
    //withdraw funds
    public void withdrawFunds(int withdraw){
        if (withdraw > this.balance){ //this.balance - withdraw < 0
            System.out.println("Insufficient balance, Available balance is "
                    + balance + "Rs");
        } else {
            this.balance -= withdraw;
            System.out.println("current balance after withdraw of "
                    + withdraw + "Rs is "
                    + this.balance + "Rs");
        }
    }
    //Getters And Setters
    public int getAccountNumber() {
        return number;
    }
    public void setAccountNumber(int number) {
        this.number = number;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return customerEmailAddress;
    }
    public void setEmail(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }
    public String getPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
