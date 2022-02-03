package com.company;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * this is Main class. in this class we manage the programme and run it
 * @author Mahdi Rahmain
 * @version 1.0
 * @since   2020-10-17
 */
public class Main {

    //creat an object from Hotel
    static Hotel pardis = new Hotel();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String myInput;
        //manage menu and process of programme in this part
        while (true)
        {
            printMenu();
            System.out.println("Choose one Item from menu.");
            myInput = input.nextLine();
            switch (myInput)
            {
                case "1":
                    checkIn();
                    break;
                case "2":
                    reservation();
                    break;
                case "3":
                    showRooms();
                    break;
                case "4":
                    showGuests();
                    break;
                case  "5":
                    checkOut();
                    break;
                case "6":
                    addRooms();
                    break;
                case "7":
                    return;
                default:
                    System.out.println("please enter the item number that you want");
            }
        }
    }

    /**
     * print the menu of items
     */
    public static void printMenu()
    {
        System.out.println("1)check in");
        System.out.println("2)Reservation");
        System.out.println("3)show rooms list");
        System.out.println("4)show guests list");
        System.out.println("5)check out");
        System.out.println("6)Adding room to hotel");
        System.out.println("7)Exit");
    }

    /**
     * if user choose first item (check in) we call this function
     * get the name of the guest and add it to list of guests in Hotel calss
     */
    public static void checkIn()
    {
        Scanner input = new Scanner(System.in);
        Guest guest = new Guest();

        System.out.println("please enter name of the guest:");
        String name = input.nextLine();
        guest.setName(name);
        pardis.checkIn(guest);
    }

    /**
     * if user choose second item (reservation) we call this function
     * get all the information we want for reserving a room
     * each guest should check in at first and then do the reservation
     */
    public static void reservation()
    {
        Scanner input = new Scanner(System.in);
        //filling first field
        System.out.println("please enter name of the guest:");
        Guest finallyGuest = new Guest();
        String name = input.nextLine();
        int flag = 0;
        for(Guest guest:pardis.getGuestList())
        {
            if(guest.getName().equals(name))
            {
                finallyGuest = guest;
                flag = 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("please check in at first:");
            return;
        }
        //filling second field
        Date date = new Date();
        System.out.println("please enter Booking interval:");
        System.out.println("start:");
        String start =input.nextLine();
        System.out.println("finish:");
        String finish =input.nextLine();
        System.out.println("Days to stay:");
        String daysToStay =input.nextLine();
        date.setStartDay(start);
        date.setFinishDay(finish);
        date.setDaysToStay(daysToStay);
        //filling third field
        System.out.println("please enter Type of room:");
        String type =input.nextLine();
        //filling forth field
        System.out.println("please enter View of room:");
        String view =input.nextLine();

        //we pass the information to reserve method of Hotel
        pardis.reserve(finallyGuest,date,Room.Type.valueOf(type),Room.View.valueOf(view));
    }

    /**
     * if user choose third item (show rooms list) we call this function
     * print all rooms that we have in this hotel
     */
    public static void showRooms()
    {
        ArrayList<Room> rooms = new ArrayList<Room>();
        rooms = pardis.getRoomList();
        for (Room room:rooms )
        {
            room.printInfo();
            System.out.println("---------------------------");
        }
    }

    /**
     * if user choose forth item (show guests list) we call this function
     * print all guests are in the hotel
     */
    public static void showGuests()
    {
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests = pardis.getGuestList();
        int index = 0;
        for (Guest guest:guests )
        {
            index++;
            System.out.println(index+")"+guest.getName());
            System.out.println("---------------------------");
        }
    }

    /**
     * if user choose fifth item (check out) we call this function
     * when a guest want to leave the hotel must be checked out
     * the guest remove from the list
     * show the payment of the guest
     */
    public static void checkOut()
    {
        Scanner input = new Scanner(System.in);
        Guest guest = new Guest();

        System.out.println("please enter name of the guest:");
        String name = input.nextLine();
        guest.setName(name);

        int totalCost = pardis.checkOut(guest);
        System.out.println("The total cost is:"+totalCost);
    }

    /**
     * if user choose sixth item (Adding room to hotel) we call this function
     * add new room to the hotel
     * get the features of the room
     */
    public static void addRooms()
    {
        Scanner input = new Scanner(System.in);
        int number;
        String type;
        String view;
        int price;

        System.out.println("please enter the room number:");
        number = input.nextInt();

        System.out.println("please enter View of room:");
        view = input.next();

        System.out.println("please enter Type of room:");
        type = input.next();

        System.out.println("please enter price of room:");
        price = input.nextInt();

        Room room = new Room(number,Room.View.valueOf(view),Room.Type.valueOf(type),price);
        pardis.setRooms(room);
    }

}
