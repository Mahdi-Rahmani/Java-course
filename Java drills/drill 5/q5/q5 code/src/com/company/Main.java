package com.company;

/**
 * This is main class
 * we mange and run the program with this class
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since 2020-11-1
 */
public class Main {

    public static void main(String[] args) {
        // creat new Hospital
        Hospital hospital = new Hospital("Milad");

        // creat new parts for hospital
        Part part1 = new Part("ICU");
        Part part2 = new Part("CCU");
        Part part3 = new Part("Ordinary");
        // adding this parts to the hospital
        hospital.addPart(part1);
        hospital.addPart(part2);
        hospital.addPart(part3);

        // creat new objects from Doctor class
        Doctor doctor1 = new Doctor("Ali","Ramezani",11234,"Maghz va asab");
        Doctor doctor2 = new Doctor("Mosen","Afshar",12345,"Atfal");
        Doctor doctor3 = new Doctor("Mahdi","Rahmani",34234,"Ghalb");
        // adding doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addDoctor(doctor3);

        // creat new objects from Personnel class
        Personnel personnel1 = new Personnel("Shayan Mohammadi","Parastar",12000000);
        Personnel personnel2 = new Personnel("Sara Alian","Paziresh",10000000);
        // adding Personnel to the hospital
        hospital.addPersonnel(personnel1);
        hospital.addPersonnel(personnel2);

        // creat new objects from Patient class
        Patient patient1 = new Patient("Hasan" , "Zare");
        Patient patient2 = new Patient("Ahmad" , "Ghahremani");
        Patient patient3 = new Patient("sajad" , "Bagheri");
        // adding patients to the hospital
        hospital.addPatient(patient1,"ICU",doctor1,"SocialSecurity");
        hospital.addPatient(patient2,"Ordinary",doctor2,"Farhangian");
        hospital.addPatient(patient3,"ICU",doctor1,"GovernmentEmployeesServices");

        //print the patients in onr part
        hospital.printPatient("ICU");

        //print the patients of a doctor
        hospital.patientsOfDoctor(doctor1);

        //removing
        hospital.removePatient("Hasan Zare","ICU",120000);
        hospital.removeDoctor(11234);
        hospital.removeDoctor(34234);
    }
}
