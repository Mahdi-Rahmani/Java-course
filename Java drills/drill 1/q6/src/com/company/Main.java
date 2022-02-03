package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myinput = new Scanner(System.in);
        String input_str = myinput.nextLine();

        int length_str=input_str.length();
        char[] ch=input_str.toCharArray();
        int counter,verify,index=0;
        char[] repeated_ch=new char[length_str];

        //count the number of repeated character
        for(int i = 0;i < length_str;i++)
        {
            counter=0;

            for(int j = 0;j < length_str;j++)
            {
               if(ch[j] == ch[i])
                   counter++;
            }

            if(counter>=2)
            {
                verify = 0;//for cheking taht not to count one character more than one by cheking if is the repeated character in repeated_ch array or not.

                for(int j = 0;j<index;j++)
                {
                    if(ch[i] == repeated_ch[j])
                        verify++;
                }

                if(verify == 0)
                {
                    repeated_ch[index] = ch[i];
                    index++;
                }
            }
        }
        //print the repeated character
        for(int i = 0;i < index;i++)
            System.out.println(repeated_ch[i]);
    }
}
