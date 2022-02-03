package com.company;
import java.util.ArrayList;

/**
 * this class is used for managing the programme
 * the voting is built in this class and run.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class VotingSystem {
    // The list of constructed votes.
    private ArrayList<Voting> votingList;

    /**
     * this id the constructor of this class.
     * Create a new voting system.
     *
     */
    public VotingSystem() {
        votingList = new ArrayList<>();
    }

    /**
     * create a new Voting
     * @param question question of voting
     * @param type type of voting
     * @param choices choices of voting
     */
    public void createVoting(String question, int type, ArrayList<String> choices ) {
        Voting voting = new Voting(type, question);
        for (String choice : choices) {
            voting.creatPoll(choice);
        }
        votingList.add(voting);
        System.out.println("voting created.");
    }

    /**
     * print the question of each constructed voting
     */
    public void getVotingList()
    {
        for (Voting voting: votingList) {
            System.out.println(voting.getQuestion());
        }
    }

    /**
     * get the index of a voting and print its question and choices
     * @param index index of voting.
     */
    public void getVoting(int index) {
        int counter = 1;
        if (validIndex(index))
        {
            System.out.println(votingList.get(index).getQuestion());
            ArrayList<String> choices = new ArrayList<>();
            choices = votingList.get(index).getPolls();
            for (String choice : choices)
            {
                System.out.println(counter + ") "+choice);
                counter++;
            }
        }
    }

    /**
     * by given index of voting and person and the person`s votes do the voting operation
     * @param index the index of voting
     * @param person the person who votes
     * @param votes the votes of a person
     */
    public void vote(int index, Person person, ArrayList<String> votes) {
        if(validIndex(index)) {
            votingList.get(index).vote(person, votes);
        }
    }

    /**
     * Print the result of a voting.
     * @param index the index of voting.
     */
    public void getResult(int index) {
        if(validIndex(index)) {
            System.out.println("print result:");
            System.out.println("    " + "voters:");
            votingList.get(index).getVoters();
            System.out.println("    " + "result:");
            votingList.get(index).printVotes();
        }
    }

    /**
     * remove the voting.
     * @param index index of voting for delete.
     */
    public void deleteVoting (int index) {
        if(validIndex(index)) {
            votingList.remove(index);
            System.out.println("removed successfully.");
        }
    }

    /**
     * Vote Random
     * @param index index of voting.
     * @param person voter.
     */
    public void voteRandom(int index,Person person)
    {
        if (validIndex(index) && votingList.get(index).getType() == 0)
        {
            votingList.get(index).RandomChoice(person);
        }
    }

    /**
     * Determine whether the given index is valid for the collection or not
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        if(index >= 0 && index < votingList.size()) {
            return true;
        }
        else {
            System.out.println("Index isn't valid.");
            return false;
        }
    }

    /**
     * get wanted voting
     * @param index index of voting
     * @return voting that user want
     */
    public Voting getVoting2(int index)
    {
        if (validIndex(index))
            return votingList.get(index);
        return null;
    }
}
