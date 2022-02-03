package com.company;

/**
 * Acts on Sea Cargoes
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since October 2020
 */
public class SeaCargo extends Cargo {
    /**
     * Create a new SeaCargo with given origin , destination , weight , insurance , type of transportation
     * also we add the code of cities that have this kind of transportation
     *
     * @param origin the origin of cargo as a code
     * @param destination the destination of cargo as a code
     * @param weight the weight of cargo
     * @param insurance cargo insurance
     * @param type type of transportation
     */
    public SeaCargo(int origin , int destination , double weight , boolean insurance,String type) {
        super(origin,destination,weight,insurance,type);
        codeOfCity.add(20);
        codeOfCity.add(21);
    }

    /**
     * Set the price of each SeaCargo
     */
    @Override
    public void setPrice() {
        price += calculatePrice();
    }

    /**
     * Calculate total price of SeaCargo
     */
    @Override
    public int calculatePrice() {
        int price = super.calculatePrice();
        if (hasInsurance())
            price += 12000;
        return price;
    }

}
