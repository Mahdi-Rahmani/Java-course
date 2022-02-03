package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String MyInput1=input.nextLine();
        String MyInput2=input.nextLine();

        char[] ch1 = MyInput1.toCharArray();
        char[] ch2 = MyInput2.toCharArray();

        int flag = same_root(ch1,ch2);

        if(flag == 1)
            System.out.print("YES");
        else
            System.out.print("NO");

    }
    public static int same_root(char[]ch1,char[]ch2)
    {
        int count1,count2;
        if(ch1.length == ch2.length)
        {
            for(int i = 0;i < ch1.length;i++)
            {
                count1 = 0;
                count2 = 0;
                for(int j = 0;j < ch1.length;j++)
                {
                    if(ch1[i] == ch1[j])
                        count1++;
                    if(ch1[i] == ch2[j])
                        count2++;
                }
                if(count1 != count2)
                    return 0;
            }
        }
        else
            return 0;
        return 1;
    }
}
