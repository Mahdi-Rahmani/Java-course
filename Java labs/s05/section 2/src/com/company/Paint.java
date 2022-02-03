package com.company;
import java.util.ArrayList;

/**
 * This class hold the list of shapes.
 * There are some methods for adding shapes and drawing.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Paint {
    // An ArrayList for storing the shapes.
    private ArrayList<Shape> shapes;

    /**
     * This is the constructor of the paint class
     * create a Paint
     */
    public Paint() {
        shapes = new ArrayList<>();
    }

    /**
     * Add a shape to the list of shapes.
     * @param shape the shape object.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * print the type of shape and its area and perimeter.
     * in this method we call the draw method of Shape class.
     */
    public void drawAll() {
        for(Shape shape: shapes) {
            shape.draw();
        }
    }

    /**
     * print the type of each shape and its radius or sides
     * in this method we call the toString method of each shape
     */
    public void printAll() {
        for(Shape shape: shapes) {
            System.out.println(shape.toString());
        }
    }

    /**
     * recognize the sides of polygon are equal or not
     */
    public void describeEqualSides() {
        int index = 0;
        for(Shape shape : shapes) {
            if (shape instanceof Triangle)
                if (((Triangle) shape).isEquilateral()) {
                    System.out.println(shape.toString()+ "this triangle is a equilateral \n");
                    index++;
                }
            if(shape instanceof Rectangle)
                if(((Rectangle) shape).isSquare()) {
                    System.out.println(shape + "this rectangle is a square \n");
                    index++;
                }
        }
        if (index == 0)
            System.out.println("There isn`t any regular polygon");
    }
}
