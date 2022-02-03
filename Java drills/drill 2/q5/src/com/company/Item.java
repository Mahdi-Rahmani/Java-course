package com.company;

public class Item {
    //Fields
    private String name;
    private String producer;
    private int price;
    private int discount;
    private int amount;
    //Constructor
    public Item(String stuffName,int cost,String producerName)
    {
        name = stuffName;
        producer = producerName;
        price = cost;
        discount = 0;
        amount = 0;
    }
    //Methods
    public void increment(int addedAmount)
    {
        amount = amount + addedAmount;
    }

    public void decrement(int decreasedAmount)
    {
        amount = amount - decreasedAmount;
    }

    public void setDiscount(int discountValue)
    {
        discount = discountValue;
    }

    public void print()
    {
        int newPrice = payment();
        System.out.printf("%15s | %15s | %15s | %15s | %15s| \n","name","producer","price","payment","amount");
        System.out.printf("%15s | %15s | %15d | %15d | %15d| \n\n",name,producer,price,newPrice,amount);
    }

    private int payment()
    {
        return price - (discount*price)/100;
    }
}
