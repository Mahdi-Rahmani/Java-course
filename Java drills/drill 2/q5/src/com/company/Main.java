package com.company;

public class Main {
    public static void main(String[] args)
    {
        Item FarmandChocalate = new Item("chocalate",20000,"Farmand");
        Item ChucklesPuff = new Item("Puff",50000,"Chuckles");

        FarmandChocalate.increment(5);
        FarmandChocalate.setDiscount(30);

        ChucklesPuff.increment(3);

        FarmandChocalate.print();
        ChucklesPuff.print();

    }
}
