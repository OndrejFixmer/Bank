package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank1 = new Bank("IndiBininging");
        Uzivatel Roman = new Uzivatel("Roman", false, 1234);
        Roman.createAccount(bank1);

        Bank bank2 = new Bank("SUSBank");
            Uzivatel Daniel = new Uzivatel("Daniel", false, 5678);
                Daniel.createAccount(bank2);

        Roman.depositpenizky(bank1.getAccountByName(Roman), 1000);

        System.out.println("Roman vložil "
                + bank1.getAccountByName(Roman).getpenizky() + " CZK.");
                System.out.println();

        bank1.getAccountByName(Roman).transferpenizky(bank2.getAccountByName(Daniel), 500);

        System.out.println("Roman poslal Daniel 500 a zbývá mu "+ bank1.getAccountByName(Roman).getpenizky() + " CZK.");
            System.out.println("Daniel přijal od Roman "
                    + bank2.getAccountByName(Daniel).getpenizky() + " CZK.");
                System.out.println();

        Daniel.withDrawpenizky(bank2.getAccountByName(Daniel), 300);

        System.out.println("Daniel vybral 300 CZK.");
            System.out.println("Daniel má nyní na účtě "
                    + bank2.getAccountByName(Daniel).getpenizky() + " CZK.");
                System.out.println();

        Daniel.withDrawpenizky(bank2.getAccountByName(Daniel), 90000);

        System.out.println("Daniel se pokusil vybrat 90000CZK, ale nemá peníze (LMAO CHUDEJ)");
            System.out.println("Daniel má zůstatek "
                    + bank2.getAccountByName(Daniel).getpenizky() + " CZK.");
                System.out.println();
    }
}