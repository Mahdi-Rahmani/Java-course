package com.company;
/**
 * Acts on Normal Ground Cargoes
 * this class is the sub class of GroundCargo class
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since October 2020
 */
public class NormalGroundCargo extends GroundCargo {

    /**
     * Create a new NormalGroundCargo with given origin , destination , weight , insurance , type of transportation
     *
     * @param origin the origin of cargo as a code
     * @param destination the destination of cargo as a code
     * @param weight the weight of cargo
     * @param insurance cargo insurance
     * @param type type of transportation
     */
    public NormalGroundCargo(int origin , int destination , double weight , boolean insurance , String type) {
        super(origin,destination,weight,insurance,type);
    }

    /**
     * Set the price of each NormalGroundCargo
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
        price *= 1;
        return price;
    }
}
