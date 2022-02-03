package com.company;
/**
 * The task of this class is runnig the programm
 *in this class we creat new object from other classes
 * @author Mahdi Rahmani
 * @version 1.0
 * @since 2020-10-09
 */

public class Run {
    /**
     * This is the main method which makes use of Student class.
     * @param args Unused.
     * @see Run
     */
    public static void main(String[] args) {
        //creat new objects from Student class
        Student std1 = new Student("Ehsan","Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        Student std4 = new Student("Mohsen", "Hamidi", "9531059");
        Student std5 = new Student("Mahdi", "Rahmani", "9731701");
        Student std6 = new Student("Ali", "Ramezani", "9726032");


        std1.print();
        std1.setGrade(15);
        std1.print();

        std2.print();
        std2.setGrade(11);
        std2.print();

        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();

        std3.setGrade(12);
        std4.setGrade(20);
        std5.setGrade(19);
        std6.setGrade(17);
        //creat new objects from TA class
        TA ta1 = new TA("mah.rah79@yahoo.com","Mahdi","Rahmani",18);
        TA ta2 = new TA("fatemeh@yahoo.com","Fatemeh","Hoseini",19);
        TA ta3 = new TA("ali@gmail.com","Ali","Ansari",20);
        //creat new object from Lab class
        //then we enroll students to this lab and print the result
        Lab APlab1 = new Lab(30, "saturday",ta1);
        APlab1.enrollStudent(std1);
        APlab1.enrollStudent(std2);
        APlab1.enrollStudent(std3);
        APlab1.calculateAvg();
        APlab1.print();

        Student std[] = {std1,std4};
        APlab1.setStudents(std);
        APlab1.calculateAvg();
        APlab1.print();

        //creat new objects from Lab class and enroll students
        Lab APlab2 = new Lab(20, "sunday",ta2);
        APlab2.enrollStudent(std5);
        APlab2.enrollStudent(std6);

        Lab ComputerArchitecture1 = new Lab(25, "Monday",ta3);
        ComputerArchitecture1.enrollStudent(std3);
        ComputerArchitecture1.enrollStudent(std6);

        //creat new objects from EducationalGroup class and add labs to them
        EducationalGroup software= new EducationalGroup("Software",2);
        software.enrollLab(APlab1);
        software.enrollLab(APlab2);

        EducationalGroup hardware = new EducationalGroup("hardware",2);
        hardware.enrollLab(ComputerArchitecture1);
        //creat new object from College class and add educational groups to it
        College computer = new College("ComputerEngineering");
        computer.enrollGroup(software);
        computer.enrollGroup(hardware);

    }
}
