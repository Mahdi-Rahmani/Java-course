package com.company;

/**
 * This class hold the triangle details.
 * There are some methods for calculation and drawing.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Triangle extends Polygon{

    /**
     * Create a new Triangle with a given sides.
     *
     * @param sides the sides of triangle
     */
    public Triangle(double... sides) {
        super(sides);
    }

    /**
     * check if the triangle is equilateral or not.
     * @return boolean value (true if the triangle is equilateral)
     */
    public boolean isEquilateral() {
        if(sides.get(0).equals(sides.get(1)) && sides.get(1).equals(sides.get(2))) {
            return true;
        }
        return false;
    }
}