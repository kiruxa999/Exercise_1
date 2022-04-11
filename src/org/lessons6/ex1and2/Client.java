package org.lessons6.ex1and2;

public class Client extends Human{
    public String bank;

    public Client(String name, String sename, String bank) {
        this.name = name;
        this.sename = sename;
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

    public String bankName(){
        this.bank = bank;
        return bank;
    }

    @Override
    public String allInfo() {
        System.out.println(bank + " " + name + " " + sename);
        return null;
    }




}
