package com.company;

public class Shape {
    private int counter=0;

    public void drawSquare(int length)
    {
        for(int i = 0;i < length;i++)
        {
            for(int j = 0;j < length; j++)
            {
                counter++;
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print(counter);
    }
    public void drawRectangle (int length, int width)
    {
        for (int i = 0; i < length;i++)
        {
            for (int j = 0; j < width;j++)
            {
                counter++;
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print(counter);
    }
    public void drawTriangle (int height)
    {
        for(int i = 0;i < height;i++)
        {
            for(int j = 0;j < i+1;j++)
            {
                counter++;
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print(counter);
    }
    public void drawCross(int length, int width)
    {
        for (int i=0;i<length;i++)
        {
            if(i==(length-1)/2)
            {
                for(int j=0; j<width;j++)
                {
                    counter++;
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                for(int j=0;j < (width-1)/2;j++)
                    System.out.print(" ");
                System.out.println("*");
                counter++;
            }
        }
        System.out.print(counter);
    }

}
