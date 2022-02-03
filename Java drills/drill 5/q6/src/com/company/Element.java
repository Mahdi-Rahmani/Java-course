package com.company;

/**
 * this class is Super class for each element
 * it holds some features of each element and behaviour of them
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Element {
    //the color of element
    private String color;

    //the coordinates of each element
    private int[] coordinates;

    //the aliveness of element
    private boolean aliveness;

    /**
     * This is the constructor of Element class
     * creat new element
     */
    public Element()
    {
        coordinates = new int[2];
    }

    /**
     * set the color of each element
     * @param color color of element
     */
    public void setColor(String color)
    {
        this.color = color;
    }

    /**
     * get the color of each element
     * @return color
     */
    public String getColor()
    {
        return color;
    }

    /**
     * set the coordinate of each element
     * @param coordinates coordinates of element
     */
    public void setCoordinates(int[] coordinates)
    {
        this.coordinates = coordinates;
    }

    /**
     * get the coordinates of each element
     * @return coordinates
     */
    public int[] getCoordinates()
    {
        return coordinates;
    }
    /**
     * check the element is alive or not
     * @param aliveness the aliveness of element
     */
    public void isAlive(boolean aliveness){
        this.aliveness = aliveness;
    }

}
