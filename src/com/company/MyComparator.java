package com.company;

import java.util.Comparator;

public class MyComparator implements Comparator<BankAccount> {
    public int compare(BankAccount b1, BankAccount b2) {
        return b1.getBalance() > b2.getBalance() ? 1 : b1.getBalance() < b2.getBalance() ? -1 : 0;
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}
