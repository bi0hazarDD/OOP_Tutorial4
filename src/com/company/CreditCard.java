package com.company;

public  class CreditCard extends Card {
    private int pinNumber;
    private int number;

    //Note that the super() call invokes the constructor of the parent class. Thus, super(n)
    //in the code below, calls the constructor Card(String) of class Card, and passes n as an
    //argument to it.

    public CreditCard(String n, int pin, int num) {
        super(n);
        pinNumber = pin;
        number = num;
    }

    public boolean isExpired() {
        // assume credit cards never expire
        return false;
    }

    public CreditCard(String name) {
        super(name);
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public int getNumber() {
        return number;
    }

    public String format() {
        super.format();
        return "Pin number:" + pinNumber + "\nNumber: " + number;
    }
}
