package com.company;

import java.util.ArrayList;

/**
 * This class is used for saving Medical files
 * It has some information such as kind of disease,doctor of patient and ..
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class MedicalFile {
    // The situation and state of patient
    private String situation;
    // The type of disease of patient
    private Disease disease;
    // diagnosing the doctor
    private String docDiagnose;
    // Date of the start of File
    private String date;
    //list of the drugs
    private ArrayList<String> drugs;
    // Doctor of the patient
    private Doctor doctor;
    // The disease level of patient
    private DiseaseLevel diseaseLevel;

    /**
     * creat new Medical file by a given disease,doctor,date,diseaseLevel
     * @param disease The type of disease of patient
     * @param doctor Doctor of the patient
     * @param date date of start
     * @param diseaseLevel The disease level of patient
     */
    public MedicalFile(Disease disease,Doctor doctor,String date,DiseaseLevel diseaseLevel)
    {
        this.disease = disease;
        this.date = date;
        this.doctor = doctor;
        this.diseaseLevel = diseaseLevel;
    }

    /**
     * set the drug
     * @param drug drug of patient
     */
    public void setDrugs(String drug)
    {
        drugs.add(drug);
    }

    /**
     * get the drugs of patient
     * @return drugs
     */
     public ArrayList<String> getDrugs()
     {
         return drugs;
     }

}
