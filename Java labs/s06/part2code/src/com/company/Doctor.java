package com.company;

import java.util.ArrayList;

/**
 * This class is used for saving Doctor information
 * Information such as name, specialty , patients and...
 * َDoctor can referred patient to a new doctor
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Doctor {
    //The name of doctor
    private String name;
    //The specialty of doctor
    private String specialty;
    //list of patients
    private ArrayList<Patient>patients;

    /**
     * creat new doctor by a given name and specialty
     * @param name name of the Doctor
     * @param specialty the specialty of doctor
     */
    public Doctor(String name , String specialty)
    {
        this.name = name;
        this.specialty = specialty;
    }

    /**
     * adding patient
     * @param patient the patient
     */
    public void addPatient(Patient patient)
    {
        patients.add(patient);
    }

    /**
     * get the patients
     * @return patients
     */
    public ArrayList<Patient> getPatients()
    {
        return patients;
    }

    /**
     * get the name of doctor
     * @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     * get specialty
     * @return specialty
     */
    public String getSpecialty()
    {
        return specialty;
    }

    /**
     * adding medical file
     * @param patient the patient
     * @param medicalFile the medical file
     */
    public void addMedicalFile(Patient patient, MedicalFile medicalFile)
    {
        patient.addMedicalFile(medicalFile);
    }
}
