package com.company;
/**
 * The TA class represents a TA in a TA adminstration system
 * It holds the TA details relavent in our context.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class TA {
    //the TA`s email
    private String email;

    //the TA`s first name
    private  String firstName;

    //the TA`s last name
    private String lastName;

    //the TA`s grade in this lesson
    private int grade;

    /**
     * Create a new TA with a given name and grade.
     *
     * @param email email of TA
     * @param fName first name of TA
     * @param lname last name of TA
     * @param grade TA`s grade
     */
    public TA(String email,String fName, String lname, int grade) {
        this.email = email;
        firstName = fName;
        lastName = lname;
        this.grade = grade;
    }
    /**
     * get the first name of TA
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * @param fName set first name of a TA
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * get the grade of TA
     * @return grade field
     */
    public int getGrade()
    {
        return grade;
    }

    /**
     *
     * @param stGrade set garde of a TA
     */
    public void setGrade(int stGrade)
    {
        grade = stGrade;
    }

    /**
     * get the id of  TA
     * @return id field
     */
    public String getId()
    {
        return email;
    }
    /**
     * Print the TA’s last name and grade and email to the
     output terminal.
     */
    public void print() {
        System.out.println("last name: "+lastName + ", grade: " + grade + ", email: " + email);
    }

}
