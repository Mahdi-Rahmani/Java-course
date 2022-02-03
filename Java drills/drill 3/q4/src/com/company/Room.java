package com.company;

/**
 *this class is used for reserving rooms
 * it holds the characteristics of each room such as number , view , type , price and date that reserved
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Room {
    enum View{
        SEA,
        FOREST,
        BUILDING
    }
    enum Type{
        Single,
        Double,
        Triple,
        Quad,
        Queen,
        King
    }
    //the number of room
    private int number;

    /*the view of room(have three states)
    it can be SEA , FOREST , BUILDING
     */
    private View view;

    /*the type of room(have six states)
    it can be Single , Double , Triple , Quad , Queen and King
     */
    private Type type;

    //the date that room is reserved
    private Date date;

    //the price of room for each day
    private int price;

    /**
     * creat a new room with a given number , view , type and price
     * @param number the room number
     * @param view the view of room
     * @param type the type of room
     * @param price the daily price of room
     */
    public Room(int number,View view,Type type,int price)
    {
        date = new Date();
        this.number = number;
        this.view = view;
        this.type = type;
        this.price = price;
    }

    /**
     * print the room information
     */
    public void printInfo()
    {
        System.out.println("The room information: ");
        System.out.println("Room number: "+number);
        System.out.println("View: "+view);
        System.out.println("Type: "+type);
        System.out.println("Reservation start date:("+date.getStartDate()+") Reservation end date: ("+date.getFinishDate()+")");
        System.out.println("Price: "+price);
    }

    /**
     * get the date of reserve and set it in date field
     * @param date the date object
     */
    public void reserve(Date date)
    {
        this.date = date;
    }

    /**
     * get a date as an entry and if the room is reserved in taht date the function return true
     * @param date the date object
     * @return boolean value (true or false)
     */
    public boolean isReserved(Date date)
    {
        if(this.date.getStartDate() == null || this.date.getFinishDate() == null)
            return false;
        if (this.date.getStartDate().equals(date.getStartDate()) && this.date.getFinishDate().equals(date.getFinishDate()))
            return true;
        return false;
    }

    /**
     * get view of the room
     * @return view field
     */
    public View getView()
    {
        return view;
    }

    /**
     * get type of the room
     * @return type field
     */
    public Type getType()
    {
        return type;
    }

    /**
     * get number of the room
     * @return number field
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * get price of the room for one day
     * @return price field
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * get date in which the room is reserved
     * @return date field
     */
    public Date getDate()
    {
        return date;
    }
}
