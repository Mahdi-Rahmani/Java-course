package com.company;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * this class is used for organization and interaction between the hotel and guests
 * it holds a list of rooms and a list of guests
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Hotel {

    // the list of rooms of the hotel
    private ArrayList<Room> rooms;

    //the list of guests
    private ArrayList<Guest> guests;

    /**
     * creat a new Hotel
     */
    public Hotel()
    {
        rooms = new ArrayList<Room>();
        guests = new ArrayList<Guest>();
    }

    /**
     * show the information of rooms
     */
    public void roomList()
    {
        for (Room room : rooms)
        {
            room.printInfo();
            System.out.println("-------------------------");
        }
    }

    /**
     * get the list of rooms
     * @return rooms field
     */
    public ArrayList<Room> getRoomList()
    {
        return rooms;
    }

    /**
     * get the list of guests
     * @return guests field
     */
    public ArrayList<Guest> getGuestList()
    {
        return guests;
    }

    /**
     * get some information such as guest , date , type of room and view of room
     * if we have suitable room with that information so reserve it.
     * @param guest guest information
     * @param date date of reservation
     * @param type type of room
     * @param view view of rrom
     */
    public void reserve(Guest guest, Date date, Room.Type type, Room.View view)
    {
        int flag = 0;//if we have suitable room with that information it comes to 1.
        //searching in rooms
        for(Room room : rooms)
        {
            if(room.getView().equals(view) && room.getType().equals(type))
            {
                flag = 1;
                if(!room.isReserved(date))
                {
                    room.reserve(date);
                    guest.bookHotel(room);
                    System.out.println("Reservation is succesfully done");
                }
                else
                    System.out.println("The room exists but it has been reserved.");
            }
        }
        if (flag == 0)
            System.out.println("We dont have any room with these features");
    }

    /**
     * get the guest as an entry and add it to guest list
     * @param guest the guest object
     */
    public void checkIn(Guest guest)
    {
        guests.add(guest);
    }

    /**
     * get the guest as an entry and if the guest exists then remove it and calculate his payment
     * @param guest the guest object
     * @return totalCost (the payment of the guest)
     */
    public int checkOut(Guest guest)
    {
        //checking existance
        Iterator<Guest> it = guests.iterator();
        while (it.hasNext())
        {
            Guest guest1 = it.next();
            if(guest1.getName().contains(guest.getName()))
            {
                //calculate output
                int totalCost;
                int daysToStay = Integer.parseInt(guest1.getRoom().getDate().getDaysToStay());
                int priceRoom =guest1.getRoom().getPrice();
                totalCost  =  priceRoom * daysToStay;
                //removing
                it.remove();
                System.out.println("Deleted!");
                return totalCost;
            }
        }
        System.out.println("Not found");
        return 0;
    }

    /**
     *adding new rooms to hotel
     * @param room the room object
     */
    public void setRooms(Room room)
    {
        rooms.add(room);
    }
}
