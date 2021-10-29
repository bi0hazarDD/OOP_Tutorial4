package com.company;

//Question 5
public abstract class Card {
    private String name;

    public Card() {
        name = "";
    }

    public Card(String name) {
        this.name = name;
    }


    public abstract boolean isExpired();

    public String format() {
        return "Card holder: " + name;
    }
}
