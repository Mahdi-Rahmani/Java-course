package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner my_input = new Scanner( System.in );
        int num,enable;
        num=my_input.nextInt();
        enable=0;

        if(num%3==0)
        {
            System.out.print("Pthree");
            enable=1;
        }
        if(num%5==0)
        {
            System.out.print("Pfive");
            enable=1;
        }
        if(num%7==0)
        {
            System.out.print("Pseven");
            enable=1;
        }
        if(enable==0)
            System.out.print(num);

    }
}
