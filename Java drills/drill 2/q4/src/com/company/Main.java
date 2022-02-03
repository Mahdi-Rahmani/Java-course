package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int input1=input.nextInt();
        int input2,input3;
        Shape shapes = new Shape();
        switch (input1)
        {
            case 0:
                input2=input.nextInt();
                shapes.drawSquare(input2);
                break;
            case 1:
                input2=input.nextInt();
                input3=input.nextInt();
                shapes.drawRectangle(input2,input3);
                break;
            case 2:
                input2=input.nextInt();
                shapes.drawTriangle(input2);
                break;
            case 3:
                input2=input.nextInt();
                input3=input.nextInt();
                shapes.drawCross(input2,input3);
                break;
        }

    }

}
