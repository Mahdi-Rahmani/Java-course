package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * this class holds the information related to the doctor
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Doctor {
    //first name of doctor
    private String firstName;

    //last name of doctor
    private String lastName;

    //medical system number of doctor
    private int medicalNumber;

    /*proficiency of doctor
    because its possible to add new parts and any proficiency
    to our hospital so we cant save this item in form of enum
    so I prefer to use String
     */
    private String proficiency;

    //the list of doctor`s patient
    private ArrayList<Patient> patients;

    /**
     * creat new doctor with given first name, last name , medical number and proficiency
     *
     * @param firstName first name of doctor
     * @param lastName last name of doctor
     * @param medicalNumber medical system number of doctor
     * @param proficiency proficiency of doctor
     */
    public Doctor(String firstName,String lastName, int medicalNumber, String proficiency)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.medicalNumber = medicalNumber;
        this.proficiency = proficiency;
        patients = new ArrayList<>();
    }

    /**
     * get the medical number of doctor
     * @return medicalNumber
     */
    public int getMedicalNumber()
    {
        return medicalNumber;
    }

    /**
     * add the patient to the list of doctor`s patients
     * @param patient patient object
     */
    public void addPatient(Patient patient)
    {
        patients.add(patient);
    }

    /**
     * get the patients
     * @return patients field
     */
    public ArrayList<Patient> getPatients()
    {
        return patients;
    }

    /**
     * remove patient from the list
     * @param name name of patient
     */
    public void removePatient(String name)
    {
        Iterator<Patient> it = patients.iterator();
        while (it.hasNext())
        {
            Patient patient = it.next();
            if (patient.toString().equals(name)) {
                it.remove();
            }
        }
    }

    /**
     * check the objects from this class are equal or not
     * @param obj the doctor to be checked
     * @return boolean value(true if the objects are equal)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Doctor))
            return false;
        Doctor doctor = (Doctor) obj;
        return (medicalNumber == doctor.medicalNumber);
    }

    /**
     * creat a hashCode for this object with medicalNumber
     * @return hashCode
     */
    @Override
    public int hashCode()
    {
        int result = 17;
        result = 37 * result + medicalNumber;
        return result;
    }

    /**
     * creat a string for this class
     * this string contains the doctor`s name and last name
     * @return String
     */
    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }

}
