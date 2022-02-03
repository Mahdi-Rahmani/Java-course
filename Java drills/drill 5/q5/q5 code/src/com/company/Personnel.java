package com.company;
/**
 * this class holds the information related to the personnel
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Personnel {
    //name of personnel
    private String name;

    //the job of personnel
    private String job;

    //the salary of personnel
    private int salary;

    /**
     * creat a new Personnel with a given name and job and salary
     * @param name name of personnel
     * @param job the job of personnel
     * @param salary the salary of personnel
     */
    public Personnel(String name, String job , int salary)
    {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    /**
     * get the name of personnel
     * @return name
     */
    public String getName()
    {
        return name;
    }
}
