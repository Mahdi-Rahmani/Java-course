package com.company;
import java.util.ArrayList;
import java.util.Iterator;
public class Store {
    public ArrayList<Product> products;
    public ArrayList<Integer> amounts;
    public Store()
    {
        products = new ArrayList<>();
        amounts = new ArrayList<>();
    }

    public void addProduct(String Name,int cost,int number)
    {
        boolean found=false;
        int index = 0;

        // searching in the products ArrayList
        while(index < products.size())
        {
            Product product = products.get(index);
            if(product.name.contains(Name))
            {
                found = true;
                amounts.set(index,amounts.get(index) + number);
                break;
            }
            else
            {
                found = false;
                index++;
            }
        }
        // if we dont have that product so we add it
        if(!found )
        {
            Product newProduct = new Product(Name,cost);
            products.add(newProduct);
            amounts.add(number);
        }
    }

    public void RemoveProduct(String Name,int number)
    {
        int index=0;
        Iterator<Product> it1 =products.iterator();
        Iterator<Integer> it2 = amounts.iterator();
        while (it1.hasNext())
        {
            Product product = it1.next();
            it2.next();
            if(product.name.contains(Name))
            {
                if(amounts.get(index) <= number)
                {
                    it1.remove();
                    it2.remove();
                }
                else
                    amounts.set(index,amounts.get(index) - number);
            }
            index++;
        }
    }

    public int CalcValue()
    {
        int value = 0;
        int index = 0;
        for(Product product : products)
        {
            value += (product.price *amounts.get(index));
            index++;
        }
        return value;
    }
}
