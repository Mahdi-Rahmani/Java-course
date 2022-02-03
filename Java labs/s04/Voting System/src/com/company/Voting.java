package com.company;

import ir.huri.jcal.JalaliCalendar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
/**
 * this class is used for voting.
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Voting {
    // The type of voting
    private int type;

    // The question of voting
    private String question;

    // The list of people
    private ArrayList<Person> voters;

    // The HashMap for saving votes to each choice
    private HashMap<String, HashSet<Vote>> polls;

    /**
     * The constructor of this class.
     * Create a new voting with a given type and question.
     * also create a object from ArrayList to save voters and from HashMap to save polls.
     *
     * @param type type of voting.
     * @param question question of voting.
     */
    public Voting(int type , String question)
    {
        this.type = type;
        this.question = question;
        voters = new ArrayList<>();
        polls = new HashMap<>();
    }

    /**
     * get the question of voting
     * @return question field.
     */
    public String getQuestion()
    {
        return question;
    }

    /**
     * creat a poll with a given poll subject
     * @param pollSubject the subject of choice or poll
     */
    public void creatPoll(String pollSubject)
    {
        polls.put(pollSubject,new HashSet<>());
    }

    /**
     * in this method we implement the vote operation
     *
     * @param person person of vote.
     * @param choices choices of vote.
     */
    public void vote(Person person, ArrayList<String>choices)
    {
        JalaliCalendar date = new JalaliCalendar();
        Vote vote = new Vote(person,date.toString());
        if(!voters.contains(person)) {
            voters.add(person);
            if (type == 0)
            {
                voters.add(person);
                polls.get(choices.get(0)).add(vote);
                System.out.println(" the vote is submitted in " + vote.getDate());
            }else if (type == 1)
            {
                voters.add(person);
                for (String choice : choices) {
                    if (polls.containsKey(choice)) {
                        polls.get(choice).add(vote);
                    }
                    System.out.println("the votes are submitted in " + vote.getDate() );
                }
            }
            else
                System.out.println("the type isn`t valid.");
        }
        else
            System.out.println("This person voted later.");
    }

    /**
     * Print voters list.
     */
    public void getVoters()
    {
        for(Person person : voters)
            System.out.println(person.toString());

    }

    /**
     * print each poll and the people vote that
     * show the result of voting
     */
    public void printVotes()
    {
        int index = 0;
        for ( String pollSubject : polls.keySet()) {
            System.out.println("poll " + index + ") " + pollSubject );
            System.out.println("The number of votes:" + polls.get(pollSubject).size());
            for(Vote vote : polls.get(pollSubject)) {
                System.out.println("   " + vote.getPerson().toString());
            }
            System.out.println("--------------------------");
            index++;
        }
    }

    /**
     * get the polls as a list
     * @return pollsList contains all polls of a voting
     */
    public ArrayList<String> getPolls()
    {
        ArrayList<String> pollsList = new ArrayList<>();
        for (String poll : polls.keySet())
            pollsList.add(poll);
        return pollsList;
    }

    /**
     * get the type of voting.
     * @return type field.
     */
    public int getType() {
        return type;
    }

    /**
     * random voting
     * @param person person
     */
    public void RandomChoice(Person person)
    {
        Random random = new Random();
        String randChoice = getPolls().get(random.nextInt(getPolls().size()));
        ArrayList<String>Choice = new ArrayList<>();
        Choice.add(randChoice);
        vote(person,Choice);
    }

}
