package com.company;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * this class is the main class.
 * we control and run the programme with this classs
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since 2020-10-23
 */
public class Main {
    //create a voting system
    static VotingSystem votingSystem = new VotingSystem();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter one item from menu:");
            menu();
            int item = input.nextInt();
            switch (item)
            {
                case 1:
                    creatVote();
                    break;
                case 2:
                    vote();
                    break;
                case 3:
                    showListOfVoting();
                    break;
                case 4:
                    showWantedVoting();
                    break;
                case 5:
                    showResult();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("please enter valid item!");
            }
        }
    }

    /**
     * printing the menu
     */
    public static void menu()
    {
        System.out.println("1)creat voting");
        System.out.println("2)vote");
        System.out.println("3)show list of voting");
        System.out.println("4)show the voting that you want");
        System.out.println("5)show result");
        System.out.println("6)exit");
    }

    /**
     * if user choose first item(creat voting) we call this function
     * creat new voting
     */
    public static void creatVote()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the question:");
        String question = input.nextLine();
        System.out.println("please enter the type of voting:");
        int type = input.nextInt();
        input.nextLine();
        System.out.println("please write the choices or press enter to exit: ");
        int index =1;
        ArrayList<String> choices = new ArrayList<>();
        while (true)
        {
            System.out.println(index + ")");
            String choice = input.nextLine();
            if (choice.isBlank() && index > 2)
            {
                break;
            }else if (choice.isBlank()&& index < 3)
            {
                System.out.println("please enter two choices at least:");
                index--;
            }
            else
                choices.add(choice);
            index++;
        }
        votingSystem.createVoting(question,type,choices);
    }

    /**
     * if user choose second item(vote) we call this function
     * voter can vote
     */
    public static void vote()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the voting index that you want to vote:");
        int index = input.nextInt();
        input.nextLine();
        System.out.println("enter your first name:");
        String fname = input.nextLine();
        System.out.println("enter your last name:");
        String lname = input.nextLine();

        Person person = new Person(fname,lname);
        ArrayList<String> choices = new ArrayList<>();
        if(votingSystem.getVoting2(index-1).getType() == 0)
        {
            System.out.println("choose one Item:");
            System.out.println("1)voting by yourself");
            System.out.println("2)Random voting");

            int item = input.nextInt();
            input.nextLine();
            switch (item)
            {
                case 1 :
                {
                    while (true)
                    {
                        System.out.println("please enter your choice");
                        System.out.print("1)");
                        String choice = input.nextLine();
                        if (!choice.isBlank())
                        {
                            choices.add(choice);
                            break;
                        }else if (choice.isBlank() )
                        {
                            System.out.println("please enter one choice at least:");
                        }
                    }
                    votingSystem.vote(index-1,person,choices);
                }
                break;
                case 2 :
                {
                    votingSystem.voteRandom(index-1, person);
                    return;
                }

                default:
                    System.out.println("the item number isn`t valid");
            }
        }
        else
        {
            int counter =1;
            while (true)
            {
                System.out.println("please enter your choices");
                System.out.println(counter + ")");
                String choice = input.nextLine();
                if (choice.isBlank() && counter > 2)
                {
                    break;
                }else if (choice.isBlank() && counter < 2)
                {
                    System.out.println("please enter one choice at least:");
                    counter--;
                }
                counter++;
                choices.add(choice);
            }
            votingSystem.vote(index-1,person,choices);
        }
    }

    /**
     * if user choose third item(show list of voting) we call this function
     * show the list of all voting
     */
    public static void showListOfVoting()
    {
        votingSystem.getVotingList();
    }

    /**
     * if user choose forth item(show the voting that you want) we call this function
     * get an index and show the voting details
     */
    public static void showWantedVoting()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the voting index that you want to see:");
        int index = input.nextInt();
        votingSystem.getVoting(index-1);
    }

    /**
     * if user choose fifth item(show result) we call this function
     * show the result of voting
     */
    public static void showResult()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the voting index that you want to see the result:");
        int index = input.nextInt();
        votingSystem.getResult(index-1);
    }
}