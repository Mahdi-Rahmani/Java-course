package com.company;

/**
 * this class is used for collecting data on a person`s identity
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Person {
    // the person`s first name
    private String firstName;

    // the person`s last name
    private String lastName;

    /**
     * the constructor of this class
     * creat a new person with a given first name and last name
     * @param firstName person`s first name
     * @param lastName person`s last name
     */
    public Person(String firstName , String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * get the first name of the person
     * @return firstName field
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * get the last name of the person.
     * @return lastName field.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * get the person`s information
     * @return  a String that contains the person`s information
     */
    public String toString()
    {
        return "First name:" + firstName + "Last name:" + lastName;
    }
}
