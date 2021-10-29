package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public  class DriverLicense extends Card {
    private int expirationYear;

    public DriverLicense(String name, int expirationYear) {
        super(name);
        this.expirationYear = expirationYear;
    }

    public boolean isExpired() {
        GregorianCalendar calendar = new GregorianCalendar();
        int current_year = calendar.get(Calendar.YEAR);
        return current_year > expirationYear ? true : false;

    }


    public String format() {
        String name = super.format();
        return "name: " + name + ", Expires: " + expirationYear;
    }
}
