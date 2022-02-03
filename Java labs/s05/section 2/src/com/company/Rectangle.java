package com.company;
/**
 * This class hold the rectangle details.
 * There are some methods for calculation and drawing.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Rectangle extends Polygon{

    /**
     * Create a new Rectangle with a given sides.
     *
     * @param sides the sides of rectangle
     */
    public Rectangle(double... sides) {
        super(sides);
    }

    /**
     * check if our rectangle is a square or not.
     * if two sides of the rectangle are equal so this rectangle is a square.
     * @return boolean value (true if the rectangle is square)
     */
    public boolean isSquare() {
        if(sides.get(0).equals(sides.get(1)) && sides.get(0).equals(sides.get(2)) && sides.get(0).equals(sides.get(3)) ) {
            return true;
        }
        return false;
    }
}