package com.company;
import java.util.Iterator;
import java.util.ArrayList;
public class FinancialSystem {
    private ArrayList<ProductionLine> productionLines;
    private Store store;
    // constructor
    public FinancialSystem()
    {
        productionLines = new ArrayList<ProductionLine>();
        store = new Store();
    }
    //Methods
    public void printAllProductionLines()
    {
        for (ProductionLine productionLine : productionLines)
            productionLine.print();
    }

    public void addProductionLine(String productionLineName,String productName,int cost)
    {
        Product type = new Product(productName,cost);
        ProductionLine newProductionLine = new ProductionLine(productionLineName,type);
        productionLines.add(newProductionLine);
    }

    public void removeProductionLine(String productionLineName)
    {
        Iterator<ProductionLine> it = productionLines.iterator();
        while (it.hasNext())
        {
            ProductionLine productionLine = it.next();
            if(productionLine.name.contains(productionLineName))
                it.remove();
        }
    }

    public void printAllStorageProducts()
    {
        int index=0;
        for(Product product : store.products)
        {
            System.out.println("ProductName: "+product.name+" | Quantity: "+store.amounts.get(index));
            index++;
        }
    }

    public void addProductToStore(String productName,int cost,int amounts)
    {
        store.addProduct(productName,cost,amounts);
    }

    public void removeProductFromStore(String productName,int amounts)
    {
        store.RemoveProduct(productName,amounts);
    }

    public void printValueOfStore()
    {
        System.out.println(store.CalcValue());
    }
}
