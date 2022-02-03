package com.company;

/**
 * this class is used for organizing guests and doing their works
 * it holds the name of guest and the room that the guest reserved
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Guest {

    //the name of guest
    private String name;

    //the room that the guest reserved
    private Room room;

    /**
     * @param name set name of the guest
     */
    public void setName (String name)
    {
        this.name = name;
    }

    /**
     * get name of the guest
     * @return name field
     */
    public String getName ()
    {
        return name;
    }

    /**
     * reserving the room for the guest and filling the room field of the class
     * @param room set the rom field of this class
     */
    public void bookHotel (Room room)
    {
        this.room = new Room(room.getNumber(),room.getView(),room.getType(),room.getPrice());
        this.room.reserve(room.getDate());
    }

    /**
     * get the room that the guest reserved it
     * @return room field
     */
    public Room getRoom()
    {
        return room;
    }
}
