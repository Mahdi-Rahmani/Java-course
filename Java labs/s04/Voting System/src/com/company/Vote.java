package com.company;

/**
 * this class is used for saving the information related to a vote
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Vote {
    //the person as an object
    private Person person;

    //the date of voting
    private String date;

    /**
     * Create a new vote with a given person and date.
     *
     * @param person the person as an object.
     * @param date  the date of voting.
     */
    public Vote(Person person,String date)
    {
        this.person = person;
        this.date = date;
    }

    /**
     * get the person as a voter.
     * @return person field.
     */
    public Person getPerson()
    {
        return person;
    }

    /**
     * get the date of voting
     * @return date field
     */
    public String getDate()
    {
        return date;
    }

    /**
     * Determine whether the given object equals a vote
     * @param myObject vote
     * @return boolean value (true or false)
     */
    public boolean equals(Object myObject)
    {
        // If the object is compared with itself then return true
        if (myObject == this) {
            return true;
        }

        /* Check if myObject is an instance of Vote or not
          "null instanceof [type]" also returns false */
        if (!(myObject instanceof Vote)) {
            return false;
        }

        Vote vote = (Vote) myObject;
        // Compare the data members and return accordingly
        return person.equals(vote.getPerson()) && date.equals(vote.getDate());
    }

    /**
     * @return a integer
     */
    public int hashCode()
    {
        int result = 17;
        result = 31 * result + person.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }
}
