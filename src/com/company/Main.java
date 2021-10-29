package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(20000.0);
        BankAccount ba2 = new BankAccount(200.0);
        BankAccount ba3 = new BankAccount(550.0);

        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(ba1);
        list.add(ba2);
        list.add(ba3);
        Collections.sort(list, new MyComparator());

        for (BankAccount client : list)
            System.out.println(client.getBalance() + " ");

        CreditCard c1 = new CreditCard("johny",1234,11112222);




    }
}
