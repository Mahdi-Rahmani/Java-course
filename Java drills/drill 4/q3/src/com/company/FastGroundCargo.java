package com.company;
/**
 * Acts on Fast Ground Cargoes
 * this class is the sub class of GroundCargo class
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since October 2020
 */
public class FastGroundCargo extends GroundCargo {

    /**
     * Create a new FastGroundCargo with given origin , destination , weight , insurance , type of transportation
     *
     * @param origin the origin of cargo as a code
     * @param destination the destination of cargo as a code
     * @param weight the weight of cargo
     * @param insurance cargo insurance
     * @param type type of transportation
     */
    public FastGroundCargo(int origin , int destination , double weight , boolean insurance,String type) {
        super(origin,destination,weight,insurance,type);
    }

    /**
     * Set the price of each FastGroundCargo
     */
    @Override
    public void setPrice() {
        price += calculatePrice();
    }

    /**
     * Calculate total price of FastGroundCargo
     */
    @Override
    public int calculatePrice() {
        int price = super.calculatePrice();
        price *= 2;

        return price;
    }
}
