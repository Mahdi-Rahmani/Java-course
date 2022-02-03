package com.company;

import java.util.ArrayList;

/**
 * This class is used for mange the system of health
 * we can access to each patient and its doctor in this country
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class HealthManagementSystem {
    // the list of doctors
    private ArrayList<Doctor> doctors;
    // the list of patients
    private ArrayList<Patient> patients;

    /**
     * give permission to some universities to access to the information
     */
    public void giveInfoToUni()
    {
        //...
    }

    /**
     * give permission to pharmacies to access to the prescription
     */
    public void givePermissionToPharmacy()
    {
        //...
    }

    /**
     * adding new doctor to this system
     * @param doctor doctor
     */
    public void addDoctor(Doctor doctor)
    {
        doctors.add(doctor);
    }

    /**
     * get the list of all patients
     * @return patients
     */
    public ArrayList<Patient> getPatients()
    {
        return patients;
    }
}
