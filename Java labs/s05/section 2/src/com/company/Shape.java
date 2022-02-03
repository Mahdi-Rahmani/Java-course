package com.company;
/**
 * this class is the superclass for our project
 * in this class we hold some details and methods related to shapes
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public abstract class Shape {

    /**
     * calculate perimeter of shape.
     *
     * @return perimeter
     */
    public abstract double calculatePerimeter();

    /**
     * calculate area of shape.
     *
     * @return area
     */
    public abstract double calculateArea();

    /**
     * draw the shape.
     * show the perimeter and area of rectangle.
     */
    public void draw() {
        System.out.println("Shape is " + this.getClass().getName());
        System.out.println("Perimeter: " + calculatePerimeter() + " Area: " + calculateArea());
    }

    /**
     * check equality of the given object and this object.
     * @param o the shape to be checked.
     * @return boolean value (true if two objects are equal)
     */
    @Override
    public abstract boolean equals(Object o);

    /**
     * creat a string for each shape.
     * @return a String
     */
    @Override
    public abstract String toString();
}