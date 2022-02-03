package com.company;

/**
 * this class is used for creating the date of reservation
 * it holds daysToStay , start of reservation and finish of that
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Date {

    //the number of days that guest want to stay
    private String daysToStay;

    //the start date of reservation
    private String start;

    //the finish date of reservation
    private String finish;

    /**
     * @param start set the start field
     */
    public void setStartDay (String start)
    {
        this.start = start;
    }

    /**
     * get the start date of reservation
     * @return start field
     */
    public String getStartDate ()
    {
        return start;
    }

    /**
     * @param finish set the finish field
     */
    public void setFinishDay (String finish)
    {
        this.finish = finish;
    }

    /**
     * get the finish date of reservation
     * @return finish field
     */
    public String getFinishDate ()
    {
        return finish;
    }

    /**
     * @param daysToStay set the number of days that guest want to stay
     */
    public void setDaysToStay (String daysToStay)
    {
        this.daysToStay = daysToStay;
    }

    /**
     * get the number of days that guest want to stay
     * @return daysToStay field
     */
    public String getDaysToStay ()
    {
        return daysToStay;
    }
}
