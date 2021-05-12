package com.company;

import java.util.ArrayList;

import java.util.Random;

public class Bank {
    private ArrayList<BankUcet> accounts;

        private String name;

    public Bank(String name) {

            this.accounts = new ArrayList<>();
                this.name = name;
    }

    public void createNewAccount(Uzivatel Uzivatel){
        accounts.add(new BankUcet(Uzivatel, randomID()));
    }

    private int randomID() {

                ArrayList<Integer> UzivatelIDs = new ArrayList<>();

            ArrayList<BankUcet> BankUcets = this.accounts;

        for (int i = 0; i < BankUcets.size(); i++) {


                BankUcet account = BankUcets.get(i);
                        UzivatelIDs.add(account.getId());
        }

            Random susnahoda = new Random();

        int randID = susnahoda.nextInt(50000) + 10000;

        while (UzivatelIDs.contains(randID)) {

                randID = susnahoda.nextInt(50000) + 10000;
        }
        return randID;
    }

    public BankUcet getAccountByName(Uzivatel Uzivatel){
            for (int i = 0; i < accounts.size(); i++) {

            if (accounts.get(i).getUzivatel().getName().equals(Uzivatel.getName())){
                        return accounts.get(i);
            }

        }
            return null;
    }
}