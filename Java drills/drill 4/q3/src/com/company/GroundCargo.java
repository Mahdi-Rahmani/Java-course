package com.company;

/**
 * Acts on Ground Cargoes
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since October 2020
 */
public class GroundCargo extends Cargo {

    /**
     * Create a new GroundCargo with given origin , destination , weight , insurance , type of transportation
     * also we add the code of cities that have this kind of transportation
     *
     * @param origin the origin of cargo as a code
     * @param destination the destination of cargo as a code
     * @param weight the weight of cargo
     * @param insurance cargo insurance
     * @param type type of transportation
     */
    public GroundCargo(int origin , int destination , double weight , boolean insurance,String type) {
        super(origin,destination,weight,insurance,type);
        codeOfCity.add(10);
        codeOfCity.add(11);
        codeOfCity.add(12);
        codeOfCity.add(13);
        codeOfCity.add(14);
        codeOfCity.add(15);
        codeOfCity.add(16);
        codeOfCity.add(17);
    }

    /**
     * Set the price of each GroundCargo
     */
    @Override
    public void setPrice() {
        price += calculatePrice() ;
    }

    /**
     * Calculate total price of FastGroundCargo
     */
    @Override
    public int calculatePrice() {
        int price = super.calculatePrice();
        if (hasInsurance())
            price += 1000;
        return price;
    }
}
