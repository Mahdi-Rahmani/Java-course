package com.company;

import java.util.ArrayList;

/**
 * Acts on each Cargo
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since October 2020
 */

public class Cargo {

    //Total cost of each cargo transportation
    protected int price;

    //Distance of origin and destination of cargo transportation
    protected int distance;

    //check cargo insurance
    protected boolean insurance;

    //keeps destination of cargo as a code
    protected int destination;

    //keeps origin of cargo as a code
    protected int origin;

    //keeps overload value
    protected double overload;

    //keeps weight of cargo
    protected double weight;

    //name of the cargo
    protected String name;

    //code of city
    protected ArrayList<Integer> codeOfCity;

    //type of transportation
    protected String type;

    /**
     * Create a new Cargo with given origin , destination , weight , insurance , type of transportation
     *
     * @param origin the origin of cargo as a code
     * @param destination the destination of cargo as a code
     * @param weight the weight of cargo
     * @param insurance cargo insurance
     * @param type type of transportation
     */
    public Cargo(int origin , int destination , double weight , boolean insurance, String type) {

        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
        this.insurance = insurance;
        this.type = type;
        codeOfCity = new ArrayList<>();
        price = 0;
    }

    /**
     * Set Price  of cargo
     */
    public void setPrice() {
        price = calculatePrice();
    }

    /**
     * Get price of Cargo
     *
     * @return Price of cargo
     */
    public int getPrice() {
        return price;
    }

    /**
     * Calculate the Total cost of each cargo
     *
     * @return totalCost
     */
    public int calculatePrice() {
        int totalCost = 0;
        int basePrice = calculateDistance() * 5000;
        totalCost += (basePrice + calculateWeightPrice() + calculateOverload()*3000);

        return totalCost;
    }

    /**
     * Calculate the distance of origin and destination
     * @return distance
     */
    public int calculateDistance() {

        distance = destination - origin;
        return distance;
    }

    /**
     * Calculate cost of cargo weight
     * @return weightPrice the cost related to the cargo weight
     */
    public int calculateWeightPrice() {
        int weightPrice;
        if (weight-(int) weight == 0)
            weightPrice = (int)weight * 2500;
        else
            weightPrice = ((int)weight +1) * 2500;
        return weightPrice;
    }

    /**
     * Check if the cargo insured or not
     *
     * @return true or false
     */
    public boolean hasInsurance() {
        return insurance;
    }


    /**
     * Calculate overload of each Cargo
     * @return overload the extra weight
     */
    public double calculateOverload() {
        if (weight > 20)
            overload = weight - 20;
        return overload;
    }

    /**
     * get the name of cargo
     *
     * @return name field
     */
    public String getName()
    {
        return name;
    }

    /**
     * set the name of cargo
     * @param cargoName the name of cargo
     */
    public void setName(String cargoName)
    {
        name = cargoName;
    }

    /**
     * this method show cargo details
     */
    public void showCargo()
    {
        if(hasInsurance())
            System.out.println(getPrice() +" insured " + origin +"  "+ destination +" "+type );
        else
            System.out.println(getPrice() +" notInsured " + origin +" "+ destination + " "+ type);
    }

    /**
     * check the code of transportation is valid or not
     * @return boolean value
     */
    public boolean isValidTranspose()
    {
        if (codeOfCity.contains(origin) && codeOfCity.contains(destination))
            return true;
        return false;
    }
}


