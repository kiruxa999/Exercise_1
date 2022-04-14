package org.lessons6.ex1and2;

public class BankHuman extends Human{

    public String bank;




    public BankHuman(String name, String sename, String bank) {
        super(name, sename);
        this.bank = bank;
    }


    @Override
    public String nameHuman() {
        super.nameHuman();
        return name;
    }

    @Override
    public String senameHuman() {
        super.senameHuman();
        return sename;
    }

    public String BankHuman() {
        this.bank = bank;
        return bank;

    }


    @Override
    public String allInfo() {
        System.out.println(bank + " " + name + " " + sename);
        return null;
    }
}
