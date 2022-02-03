package com.company;
import java.util.ArrayList;
/**
 * The College class represents a college in a college adminstration system
 * It holds the college details relavent in our context.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class College {

    //the college`s name
    private String collegeName;

    //the college`s educational groups
    private ArrayList<EducationalGroup> groups;

    /**
     * Create a new college with a given name .
     *
     * @param name the educational group`s name
     */
    public College(String name)
    {
        collegeName = name;
        groups = new ArrayList<>();
    }

    /**
     * Enroll educational group to the college.
     * @param group set groups of college
     */
    public void enrollGroup(EducationalGroup group)
    {
        groups.add(group);
    }
}
