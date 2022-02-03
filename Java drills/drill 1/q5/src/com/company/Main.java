package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String my_str = input.nextLine();
        int number = atoi(my_str);
        System.out.println(number);
    }
    //define a function for converting number in string form to integer
    public static int atoi(String my_str)
    {
        String str_deleted_space = "";
        int starting_point = 0;
        int number = 0;
        int sign = 0;

        //first we delete the spaces of the string
        char[] ch = my_str.toCharArray();
        for(int i = 0;i < ch.length;i++)
        {
            if(ch[i] != ' ')
            {
                str_deleted_space += ch[i];
            }
        }

        //we want to get the sign of the number
        char[] ch_new = str_deleted_space.toCharArray();
        if (ch_new[0] == '+')
        {
            sign = 1;
            starting_point = 1;
        }
        if (ch_new[0] == '-')
        {
            sign = -1;
            starting_point = 1;
        }

        //now we want to find the number in the start of the string that we creat recently
        for(int i = starting_point;i < ch_new.length;i++)
        {
            if(!((int)ch_new[i] >= (int)'0' && (int)ch_new[i] <= (int)'9'))
                break;
            number = number * 10 + (int)ch_new[i] - 48;
        }
        //affect the sign on number
        if(starting_point == 1)
            number *= sign;
        return number;
    }
}
