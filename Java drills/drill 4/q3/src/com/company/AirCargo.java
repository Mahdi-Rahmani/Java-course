package com.company;
/**
 * Acts on Air Cargoes
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since October 2020
 */
public class AirCargo extends Cargo {

    /**
     * Create a new AirCargo with given origin , destination , weight , insurance , type of transportation
     * also we add the code of cities that have airport
     *
     * @param origin the origin of cargo as a code
     * @param destination the destination of cargo as a code
     * @param weight the weight of cargo
     * @param insurance cargo insurance
     * @param type type of transportation
     */
    public AirCargo(int origin , int destination , double weight , boolean insurance,String type) {
        super(origin,destination,weight,insurance,type);
        codeOfCity.add(10);
        codeOfCity.add(11);
        codeOfCity.add(12);
        codeOfCity.add(13);
        codeOfCity.add(20);
        codeOfCity.add(21);
    }

    /**
     * Set the price of each AirCargo
     */
    @Override
    public void setPrice() {
        price += calculatePrice();

    }

    /**
     * Calculate total price of AirCargo
     */
    @Override
    public int calculatePrice() {
         int price =super.calculatePrice();
        if (hasInsurance())
            price += 7000;
        return price;
    }

}
