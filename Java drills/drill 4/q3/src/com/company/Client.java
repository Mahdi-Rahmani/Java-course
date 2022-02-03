package com.company;

import java.util.ArrayList;

/**
 * Acts on Client information
 *
 *  @author Mahdi Rahmani
 *  @version 1.0
 *  @since October 2020
 */
public class Client {

    //first name of client
    private String firstName;

    //last name of client
    private String lastName;

    //list of client cargoes
    private ArrayList<Cargo> cargoes;

    /**
     * this is the constructor of this class
     * creat new client
     */
    public Client(){
        cargoes=new ArrayList<>();
    }

    /**
     * set the  first name of client
     * @param fName first name of client
     */
    public void setFirstName(String fName)
    {
        firstName = fName;
    }

    /**
     * set the last name of client
     * @param lName last name of client
     */
    public void setLastName(String lName)
    {
        lastName = lName;
    }

    /**
     * add new cargo to cargos list of this client
     * @param cargo new cargo
     */
    public void addCargo(Cargo cargo){
        int index = 1;
        for (Cargo cargo1 : cargoes)
            index++;
        cargoes.add(cargo);
        cargo.setName("cargo"+index);

    }

    /**
     * with this method we return the first name and last name of client as one String
     * @return a String contains the first name and alst name of client
     */
    public String toString()
    {
        return firstName + " " + lastName;
    }

    /**
     * get the list of cargos
     * @return cargos list
     */
    public ArrayList<Cargo> getCargoes()
    {
        return cargoes;
    }
}
