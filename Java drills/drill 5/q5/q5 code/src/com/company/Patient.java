package com.company;

/**
 * this class holds the information related to the patient
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Patient {
    //first name of patient
    private String firstName;

    //last name of patient
    private String lastName;

    /*the doctor of patient
    each patient has a doctor so we creat a doctor for that to access to the details
    of the patient`s doctor whenever we want
     */
    private Doctor doctor;

    //the insurance of patient
    private boolean isInsured;

    //the cost of treatment
    private int price;

    /**
     * creat a new patient with a given first name and last name
     * @param firstName first name of patient
     * @param lastName last name of patient
     */
    public Patient(String firstName, String lastName )
    {
        this.firstName = firstName;
        this.lastName = lastName;
        isInsured = false;
        price = 0;
    }

    /**
     * set the doctor
     * @param doctor doctor of the patient
     */
    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }

    /**
     * set the insurance of patient
     * @param insured the patient has valid insurance or not
     */
    public void setInsured(boolean insured)
    {
        isInsured = insured;
    }

    /**
     * get the insurance of patient
     * @return isInsured field
     */
    public boolean getInsured()
    {
        return isInsured;
    }

    /**
     * creat a string for this class
     * this string contains the patient`s name and last name
     * @return String
     */
    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }

    /**
     * set the cost of treatment
     * @param price cost of treatment
     */
    public void setPrice(int price)
    {
        if (isInsured)
            this.price = price/2;
        else
            this.price = price;
    }

    /**
     * get the price of treatment
     * @return price field
     */
    public int getPrice()
    {
        return price;
    }


}
