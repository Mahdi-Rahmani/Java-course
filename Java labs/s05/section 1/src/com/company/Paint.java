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

    // ArrayList for storing the circles.
    private ArrayList<Circle> circles;

    // ArrayList for storing the triangles.
    private ArrayList<Triangle> triangles;

    // ArrayList for storing the rectangles.
    private ArrayList<Rectangle> rectangles;

    /**
     * This is the constructor of the paint class
     * create a Paint
     */
    public Paint() {
        circles = new ArrayList<>();
        triangles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }

    /**
     * Add a circle to the list of circles.
     * @param circle the circle object
     */
    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    /**
     * Add a rectangle to the list of rectangles.
     * @param rectangle the rectangle object
     */
    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    /**
     * Add a triangle to the list of triangles.
     * @param triangle the triangle object
     */
    public void addTriangle(Triangle triangle) {
        triangles.add(triangle);
    }

    /**
     * print the type of shape and its area and perimeter.
     * in this method we call the draw method of each shape.
     */
    public void drawAll() {
        for(Rectangle rectangle: rectangles) {
            rectangle.draw();
        }
        for(Triangle triangle: triangles) {
            triangle.draw();
        }
        for(Circle circle: circles) {
            circle.draw();
        }
    }

    /**
     * print the type of each shape and its radius or sides
     * in this method we call the toString method of each shape
     */
    public void printAll() {
        for(Rectangle rectangle: rectangles) {
            System.out.println(rectangle.toString());
        }
        for(Triangle triangle: triangles) {
            System.out.println(triangle.toString());
        }
        for(Circle circle: circles) {
            System.out.println(circle.toString());
        }
    }
}

