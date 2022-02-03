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
        Triangle tri3 = new Triangle(4,4,6);

        //creat an object from paint class
        Paint paint = new Paint();

        //add the created shapes to related lists
        paint.addShape(circle1);
        paint.addShape(circle2);
        paint.addShape(rect1);
        paint.addShape(rect2);
        paint.addShape(rect3);
        paint.addShape(tri1);
        paint.addShape(tri2);

        //call the drawAll and printAll and describeEqualSides methods of paint class
        System.out.println("*** draw all ***");
        paint.drawAll();
        System.out.println("*** print all ***");
        paint.printAll();
        System.out.println("*** all equal sides are ***");
        paint.describeEqualSides();

        //checking equality
        System.out.println("Are tri2 and tri3  equal?  " + tri3.equals(tri2));
        System.out.println("Are rect1 and rect2  equal?  " + rect1.equals(rect2));

    }
}
