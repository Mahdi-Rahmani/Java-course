package com.company;
/**
 * Acts on Breakable Ground Cargoes
 * this class is the sub class of GroundCargo class
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since October 2020
 */
public class BreakableGroundCargo extends GroundCargo {
    /**
     * Create a new BreakableGroundCargo with given origin , destination , weight , insurance , type of transportation
     *
     * @param origin the origin of cargo as a code
     * @param destination the destination of cargo as a code
     * @param weight the weight of cargo
     * @param insurance cargo insurance
     * @param type type of transportation
     */
    public BreakableGroundCargo(int origin , int destination , double weight , boolean insurance,String type)
    {
        super(origin,destination,weight,insurance,type);
    }

    /**
     * Set the price of each BreakableGroundCargo
     */
    @Override
    public void setPrice() {
        price += calculatePrice();
    }

    /**
     * Calculate total price of BreakableGroundCargo
     */
    @Override
    public int calculatePrice() {
        int price = super.calculatePrice();
        price *= 3;
        return price;
    }

}
