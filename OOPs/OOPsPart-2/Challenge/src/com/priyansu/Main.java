package com.priyansu;

public class Main {
    public static void main(String[] args) {
        Account Priyansu = new Account(
                12234324,
                7000,
                "priyansuSahoo",
                "priyansusahpp1@gmail.com",
                "8787353936");
        Priyansu.depositFunds(6000);
        Priyansu.withdrawFunds(5050);
    }
}