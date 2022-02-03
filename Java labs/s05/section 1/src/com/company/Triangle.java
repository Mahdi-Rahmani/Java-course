package com.company;
import java.util.ArrayList;
import static java.lang.Math.sqrt;

/**
 * This class hold the triangle details.
 * There are some methods for calculation and drawing.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Triangle {
    // An ArrayList for storing the sides.
    private ArrayList<Double> sides;

    /**
     * Create a new Triangle with a given sides.
     *
     * @param firstSide the first side of triangle.
     * @param secondSide the second side of triangle.
     * @param thirdSide the third side of triangle.
     */
    public Triangle(double firstSide , double secondSide , double thirdSide) {
        sides = new ArrayList<>();
        sides.add(firstSide);
        sides.add(secondSide);
        sides.add(thirdSide);
    }

    /**
     * get the sides of triangle as a list.
     * @return sides field.
     */
    public ArrayList<Double> getSides() {
        return sides;
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

    /**
     * calculate perimeter of triangle.
     * @return perimeter
     */
    public double calculatePerimeter() {
        return  (sides.get(0) + sides.get(1) + sides.get(2));
    }

    /**
     * calculate area of triangle with Heron`s formula.
     * @return area
     */
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return (sqrt(p*(p - sides.get(0))*(p - sides.get(1))*(p - sides.get(2))));
    }

    /**
     * draw the shape.
     * show the perimeter and area of triangle.
     */
    public void draw() {
        System.out.println("This shape is Triangle:");
        System.out.println("Perimeter: " + calculatePerimeter() + " Area: " + calculateArea());
    }

    /**
     * check equality of the given object and this object.
     * @param o the triangle to be checked.
     * @return boolean value (true if two objects are equal)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;

        Triangle triangle = (Triangle) o;

        return sides.equals(triangle.getSides());
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
        return "Triangle\n" +
                "first side : " + sides.get(0) + "  second side : " + sides.get(1) + "  third side : " + sides.get(2);
    }
}