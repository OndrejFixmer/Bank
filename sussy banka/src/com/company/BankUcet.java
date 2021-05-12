package com.company;


public class BankUcet {
    private Uzivatel Uzivatel;
    private int penizky;
    private int id;


    public BankUcet(Uzivatel Uzivatel, int id) {
        this.penizky = 0;
        this.Uzivatel = Uzivatel;
        this.id = id;
    }

    public void depositpenizky(int penizky2) {
        this.penizky += penizky2;
    }

    public void transferpenizky(BankUcet account, int amount) {
        if (byeByepenizky(amount)) {
            account.depositpenizky(amount);
        }
    }

    public boolean byeByepenizky(int penizky2) {
        if
            (this.penizky - penizky2 >= 0) {
                this.penizky -= penizky2;

            return true;
        }
        return false;
    }



    public Uzivatel getUzivatel() {

        return Uzivatel;
    }

    public int getpenizky() {

            return penizky;
    }
    public int getId() {

        return id;
    }

}