package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class holds the information related to each class
 * for each hospital we have different parts
 * we define this class to add each part that we want to our hospital
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Part {
    //name of the part
    private String name;

    //patients of each part
    private ArrayList<Patient> patients;

    /**
     * creat a new part for our hospital with a given name
     * @param name name of the Hospital part
     */
    public Part(String name)
    {
        this.name = name;
        patients = new ArrayList<>();
    }

    /**
     * print the name of the patients of this part
     */
    public void printPatients()
    {
        System.out.println("the patients of "+ name);
        for (Patient patient: patients)
            System.out.println(patient.toString());
        System.out.println("  ---------  ");
    }

    /**
     * get the name of part
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * add new patient to the patient list of this part
     * @param patient patient object
     */
    public void addPatient(Patient patient)
    {
        patients.add(patient);
    }

    /**
     * remove patient from the list
     * @param name name of patient
     * @param price cost of treatment with out insurance
     */
    public void removePatient(String name , int price)
    {
        Iterator<Patient> it = patients.iterator();
        while (it.hasNext())
        {
            Patient patient = it.next();
            if (patient.toString().equals(name)) {
                patient.setPrice(price);
                System.out.println(name + " is successfully removed");
                System.out.println("the payment of patient:" + patient.getPrice());
                it.remove();
            }
        }
    }
}
