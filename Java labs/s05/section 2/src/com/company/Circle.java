package com.company;

/**
 * This class hold the circle details.
 * There are some methods for calculation and drawing.
 * This class inherits from Shape class
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Circle extends Shape {

    //the radius of circle
    private double radius;

    /**
     * Create a new Circle with a given radius.
     *
     * @param radius radius of circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * get the radius of circle.
     * @return radius field.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * calculate the perimeter of circle.
     * @return perimeter
     */
    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }

    /**
     * calculate the area of circle.
     * @return area
     */
    @Override
    public double calculateArea() {
        return (Math.PI * Math.pow(radius , 2));
    }

    /**
     * check equality of the given object and this object.
     * @param o The circle to be checked.
     * @return boolean value (true if two objects are equal)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Circle))
            return false;

        Circle circle = (Circle) o;

        return (radius == circle.getRadius());
    }

    /**
     * creat a hashcode depends on radius.
     * @return hashCode
     */
    @Override
    public int hashCode() {
        int result = 7;
        result = 37 * result + (int) radius;
        return result;
    }

    /**
     * creat a string for this class.
     * @return a String
     */
    @Override
    public String toString() {
        return "Circle\n" +
                "radius: " + radius;
    }
}
