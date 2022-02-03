package com.company;

import javax.print.Doc;
import java.util.ArrayList;

/**
 * This class is used for saving Patient information
 * Information such as gender, type of insurance , job and...
 * َAlso we can choose the first doctor of patient in this class
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Patient {
    //The date of birth of patient
    private String dateOfBirth;

    //The gender of patient
    private String gender;

    //The kind of base insurance
    private String baseInsurance;

    //The kind of Supplementary insurance
    private String supplementaryInsurance;

    //The degree of education
    private String degree;

    //The job of patient
    private String job;

    //The residence of patient
    private String residence;

    //The location of patient
    private String location;

    //The list of medical files
    private ArrayList<MedicalFile> medicalFiles;

    //The list of doctors
    private ArrayList<Doctor> doctors;

    /**
     * This is the constructor of class
     * creat new Patient by a given first doctor
     * @param doctor the first doctor of patient
     */
    public Patient(Doctor doctor)
    {
        doctors = new ArrayList<>();
        doctors.add(doctor);
    }

    /**
     * get the medical files of patient
     * @return medical files
     */
    public ArrayList<MedicalFile> getMedicalFiles()
    {
        return medicalFiles;
    }

    /**
     * get the doctors of patient
     * @return doctor
     */
    public ArrayList<Doctor> getDoctors()
    {
        return doctors;
    }

    /**
     * show the medical files
     */
    public void showMedicalFiles()
    {

    }

    /**
     * adding medical file by its doctor
     * @param medicalFile medical file
     */
    public void addMedicalFile(MedicalFile medicalFile)
    {
        medicalFiles.add(medicalFile);
    }
}
