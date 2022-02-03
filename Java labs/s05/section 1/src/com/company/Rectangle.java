package com.company;
import java.util.ArrayList;

/**
 * This class hold the rectangle details.
 * There are some methods for calculation and drawing.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Rectangle {
    // list of sides
    private ArrayList<Double> sides;

    /**
     * Create a new Rectangle with  given sides .
     *
     * @param firstSide the firstSide of rectangle.
     * @param secondSide the secondSide  of rectangle.
     * @param thirdSide the thirdSide  of rectangle.
     * @param forthSide the forthSide  of rectangle.
     */
    public Rectangle(double firstSide , double secondSide , double thirdSide , double forthSide) {
        sides = new ArrayList<>();
        sides.add(firstSide);
        sides.add(secondSide);
        sides.add(thirdSide);
        sides.add(forthSide);
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

    /**
     * get the sides of rectangle as a list.
     * @return sides field
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * calculate perimeter of the rectangle.
     * @return perimeter
     */
    public double calculatePerimeter() {
        return (2*( sides.get(0) + sides.get(1)));
    }

    /**
     * calculate area of the rectangle.
     * @return area
     */
    public double calculateArea() {
        return (sides.get(0) * sides.get(1));
    }

    /**
     * draw the shape.
     * show the perimeter and area of rectangle.
     */
    public void draw() {
        System.out.println("This shape is Rectangle: ");
        System.out.println("Perimeter: " + calculatePerimeter() + " Area: " + calculateArea());
    }

    /**
     * check equality of the given object and this object.
     * @param o The rectangle to be checked.
     * @return boolean value (true if two objects are equal)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Rectangle))
            return false;

        Rectangle rectangle = (Rectangle) o;

        return sides.equals(rectangle.getSides());
    }

    /**
     * creat a hashCode depends on sides.
     * @return code
     */
    @Override
    public int hashCode() {
        int result = 17;
        result =  37 * result +  sides.hashCode();
        return result;
    }

    /**
     * creat a string for this class.
     * @return a String
     */
    @Override
    public String toString() {
        return "Rectangle\n" +
                "length:  " + sides.get(0) + "  width:  " + sides.get(1);
    }
}