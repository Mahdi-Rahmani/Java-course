package com.company;
/**
 * The EducationalGroup class represents a group in a educational group adminstration system
 * It holds the EducationalGrou details relavent in our context.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class EducationalGroup {

    // the educational group`s name
    private String groupName;

    // the number of lab in this educational group
    private int numberOfLabs;

    // the educational group`s labs
    private Lab[] labs;

    // the educational group`s current size
    private int currentSize;
    /**
     * Create a new educational group with a given name and number.
     *
     * @param name the educational group`s name
     * @param number the number of lab in this educational group
     */
    public EducationalGroup(String name, int number) {
        groupName = name;
        numberOfLabs = number;
        labs = new Lab[numberOfLabs];
        currentSize = 0;
    }

    /**
     * Enroll lab to the educational group.
     * @param lab set labs of educational group
     */
    public void enrollLab(Lab lab)
    {
        if (currentSize < numberOfLabs)
        {
            labs[currentSize] = lab;
            currentSize++;
        } else {
            System.out.println("We dont need more labs");
        }
    }
}
