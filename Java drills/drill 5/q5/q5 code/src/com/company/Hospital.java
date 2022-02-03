package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class holds the information of a hospital
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Hospital {
    //name of the hospital
    private String name;

    //parts of the hospital
    private ArrayList<Part> parts;

    //list of personnel
    private ArrayList<Personnel> personnel;

    //list of doctors
    private ArrayList<Doctor> doctors;

    //the valid insurances
    enum insurance{
        SocialSecurity,
        ArmedForcesServices,
        GovernmentEmployeesServices
    }

    /**
     * This is the constructor of Hospital class
     * creat a new Hospital with a given name
     * @param name name of hospital
     */
    public Hospital(String name)
    {
        this.name = name;
        parts = new ArrayList<>();
        personnel = new ArrayList<>();
        doctors = new ArrayList<>();
    }

    /**
     * get the name of the hospital
     * @return name field
     */
    public String getName()
    {
        return name;
    }

    /**
     * add a new part to the hospital
     * @param part part of hospital
     */
    public void addPart(Part part)
    {
        parts.add(part);
    }

    /**
     * add a new personnel to the list of personnel
     * @param personnel the personnel object
     */
    public void addPersonnel(Personnel personnel)
    {
        this.personnel.add(personnel);
    }

    /**
     * add a doctor to the hospital
     * @param doctor doctor object
     */
    public void addDoctor(Doctor doctor)
    {
        doctors.add(doctor);
    }

    /**
     * add a patient to the hospital
     * @param patient patient object
     * @param partName name of the part
     * @param doctor doctor object
     * @param insurance the insurance of patient
     */
    public void addPatient(Patient patient,String partName, Doctor doctor , String insurance )
    {
        //check if the patient insurance is valid or not
        for (Hospital.insurance insurance1 : Hospital.insurance.values()) {
            if (insurance.equals(""+insurance1))
                patient.setInsured(true);
        }

        //adding patient to the patients list of doctor
        doctor.addPatient(patient);

        //adding patient to the suitable part
        for (Part part : parts)
        {
            if (part.getName().equals(partName))
            {
                part.addPatient(patient);
                return;
            }
        }
        System.out.println("We dont have this part in our hospital");
    }

    /**
     * remove the personnel with given name
     * @param name name of personnel
     */
    public void removePersonnel(String name)
    {
        Iterator<Personnel> it = personnel.iterator();
        while (it.hasNext())
        {
            Personnel personnel = it.next();
            if (personnel.getName().equals(name))
                it.remove();
        }
    }

    /**
     * remove the doctor with given medical number
     * @param medicalNumber medical number of doctor
     */
    public void removeDoctor(int medicalNumber)
    {

        Iterator<Doctor> it = doctors.iterator();
        while (it.hasNext())
        {
            Doctor doctor = it.next();
            if (doctor.getMedicalNumber() == medicalNumber)
            {
                // we check if doctor doesnt have any patient then we remove it
                if(doctor.getPatients().size() == 0 )
                {
                    it.remove();
                    System.out.println("Dr."+doctor.toString()+" is removed successfully");
                }
                else
                    System.out.println("Sorry!! this doctor has patients and we cant remove it.");
            }
        }
    }

    /**
     * remove the patient with given patient name and part name
     * @param patientName name of the patient
     * @param partName name of part
     * @param price cost of treatment without insurance
     */
    public void removePatient(String patientName , String partName , int price)
    {
        //remove patient from the patient list in the Part class
        for (Part part : parts)
        {
            if (part.getName().equals(partName))
            {
                part.removePatient(patientName, price);
            }
        }
        //remove patient from the patient list in the Doctor class
        for (Doctor doctor : doctors)
        {
            for (Patient patient : doctor.getPatients())
                if (patient.toString().equals(patientName))
                    doctor.removePatient(patientName);
        }
    }
    /**
     * get the name of each part and print its patient
     * in this method we call the
     * @param name name of the part
     */
    public void printPatient(String name)
    {
        for (Part part : parts)
        {
            if (part.getName().equals(name))
            {
                part.printPatients();
                return;
            }
        }
        System.out.println("We dont have this part in our hospital");
    }

    /**
     * print patients of a doctor with a given doctor
     * @param doctor doctor object
     */
    public void patientsOfDoctor(Doctor doctor)
    {
        System.out.println("the patients of Dr."+doctor.toString());
        for (Doctor doctor1: doctors)
        {
            if (doctor1.equals(doctor))
            {
                for (Patient patient : doctor1.getPatients())
                    System.out.println(patient.toString());
            }
        }
        System.out.println("  ----------  ");
    }

}
