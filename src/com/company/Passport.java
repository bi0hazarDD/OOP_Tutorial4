package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public  class Passport extends Card {
    private String birthLocation;
    private int expirationYear;

    public Passport(String name, String birthLocation, int expirationYear) {
        super(name);
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }

    public boolean isExpired() {
        GregorianCalendar calendar = new GregorianCalendar();
        int current_year = calendar.get(Calendar.YEAR);
        return current_year > expirationYear ? true : false;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public String format() {
        String name = super.format();
        return "name: " + name + "Birth location:" + birthLocation + "\nExpiration date: " + Integer.toString(expirationYear);
    }
}
