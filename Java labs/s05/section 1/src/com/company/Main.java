package com.company;

/**
 * this is the main class
 * we manage the program with this class
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since 2020-10-31
 */
public class Main {

    public static void main(String[] args) {
        //creat new circle objects
        Circle circle1 = new Circle(19);
        Circle circle2 = new Circle(3);

        //creat new rectangle objects
        Rectangle rect1 = new Rectangle(1,4,1,4);
        Rectangle rect2 = new Rectangle(8,5,8,5);
        Rectangle rect3 = new Rectangle(6,6,6,6);

        //creat new triangle objects
        Triangle tri1 = new Triangle(2,2,2);
        Triangle tri2 = new Triangle(4,4,6);

        //creat an object from paint class
        Paint paint = new Paint();

        //add the created shapes to related lists
        paint.addCircle(circle1);
        paint.addCircle(circle2);
        paint.addRectangle(rect1);
        paint.addRectangle(rect2);
        paint.addRectangle(rect3);
        paint.addTriangle(tri1);
        paint.addTriangle(tri2);

        //call the drawAll and printAll methods of paint class
        paint.drawAll();
        paint.printAll();


    }
}
