package com.company;

public class Uzivatel {

    private String name;
    private boolean gender;
    private int birthNumber;

    public Uzivatel (String name, boolean gender, int birthNumber) {

            this.gender = gender;
                this.name = name;
                    this.birthNumber = birthNumber;
    }

    public void createAccount(Bank bank) {

        bank.createNewAccount(this);
    }
    public void depositpenizky(BankUcet account, int penizky){

        account.depositpenizky(penizky);
    }
    public void withDrawpenizky(BankUcet account, int penizky){

        account.byeByepenizky(penizky);
    }

    public String getName() {

        return name;
    }
}