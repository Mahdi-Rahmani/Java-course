package com.company;

public class Main {
    public static void main(String[] args) {
        FinancialSystem financialSystem = new FinancialSystem();

        financialSystem.addProductionLine("TantakLine","TanTakShoes",24000);
        financialSystem.addProductionLine("AdidasLine","AdidasShoes",50000);
        financialSystem.addProductionLine("NikeLine","NikeShoes",40000);

        financialSystem.addProductToStore("TantakShoes",24000,25);
        financialSystem.addProductToStore("TantakShoes",24000,40);
        financialSystem.addProductToStore("AdidasShoes",50000,30);
        financialSystem.addProductToStore("NikeShoes",40000,40);

        financialSystem.printAllProductionLines();

        financialSystem.printAllStorageProducts();

        financialSystem.printValueOfStore();

        financialSystem.removeProductFromStore("TantakShoes",10);

        financialSystem.printAllStorageProducts();

        financialSystem.removeProductFromStore("AdidasShoes",30);

        financialSystem.printAllStorageProducts();

        financialSystem.removeProductionLine("NikeLine");

        financialSystem.printAllStorageProducts();
        financialSystem.printAllProductionLines();


    }
}
