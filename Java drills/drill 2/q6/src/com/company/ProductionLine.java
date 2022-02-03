package com.company;

public class ProductionLine {
    public String name;
    private Product type;
    //construction
    public ProductionLine(String lineName,Product Type)
    {
        name=lineName;
        type = new Product(Type.name, Type.price);
    }
    public void print()
    {
        System.out.println("Name: "+name+" | Product: "+type.name);
    }

}
