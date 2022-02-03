package com.company;
import java.util.ArrayList;
import static java.lang.Math.sqrt;

/**
 * This class hold the Polygon details.
 * There are some methods for calculation and drawing.
 * Each polygon that we want to add to this project must inherit from this class.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Polygon extends Shape{

    // ArrayList for storing the sides of polygon
    protected ArrayList<Double> sides;

    /**
     * Create a new Polygon with a given sides.
     *
     * @param sides the sides of polygon.
     */
    public Polygon(double... sides) {
        this.sides = new ArrayList<>();
        for (double side : sides) {
            this.sides.add(side);
        }
    }

    /**
     * get the sides of polygon as a list.
     * @return sides field.
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * calculate perimeter of polygon.
     * @return perimeter
     */
    @Override
    public double calculatePerimeter() {
        double perimeter = 0;
        for(double side : sides)
            perimeter += side;

        return perimeter;
    }

    /**
     * calculate area of polygon.
     * @return area
     */
    @Override
    public double calculateArea() {
        if(sides.size() == 3) {
            double p = calculatePerimeter() / 2;
            return (sqrt(p*(p - sides.get(0))*(p - sides.get(1))*(p - sides.get(2))));
        }
        else {
            return (sides.get(0) * sides.get(1));
        }
    }

    /**
     * check equality of the given object and this object.
     * @param o the polygon to be checked.
     * @return boolean value (true if two objects are equal)
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polygon)) return false;

        Polygon polygon = (Polygon) o;

        return sides.equals(polygon.getSides());
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
     * get a String for polygon and sides.
     * @return a String.
     */
    @Override
    public String toString() {
        int index = 1;
        String myString = "Shape is " + this.getClass().getName()+"\n";
        for(double side : sides)
        {
            myString += "side" + index +":" +side + "\n";
            index++;
        }
        return myString;
    }
}