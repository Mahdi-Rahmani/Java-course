package com.company;

import java.util.Scanner;

public class Main {
    //creat a new freightAgency to organize it
    static FreightAgency freightAgency = new FreightAgency();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuVisibility = 1;

        //the process of programme is doing here
        while (true) {
            if (menuVisibility == 1)
                menu();
            menuVisibility = 0;
            int myInput = input.nextInt();
            input.nextLine();

            switch (myInput) {
                case 0:
                    menuVisibility = 1;
                    break;
                case 1:
                    cargoList();
                    break;
                case 2:
                    clientsCargo();
                    break;
                case 3:
                    setCargo();
                    break;
                case 4:
                    addClient();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("please enter the number of menu items");
            }
        }
    }

    /**
     * the menu of items
     */
    public static void menu() {
        System.out.println("0.Return");
        System.out.println("1.Cargo list");
        System.out.println("2.Client list");
        System.out.println("3.Set a cargo");
        System.out.println("4.Add a client");
        System.out.println("5.Turn off");
    }

    /**
     * if user enter the item number one(Cargo list) we call this function
     * show the list of cargos
     */
    public static void cargoList() {
        freightAgency.showCargoList();
    }

    /**
     * show the list of clients
     */
    public static void clientList() {
        freightAgency.showClients();
    }

    /**
     * if user enter the item number two(Client list) we call this function
     * show the list of clients at first by calling clientList function
     * if user press 0 we return to menu else if enter a name from list
     * we show the cargos of that client and if the client doesnt have any cargo
     * we show a suitable message
     * next level if user press 0 return to client list else if enter a new name of clients
     * we show the cargos of that or if enter the name of cargo we show the detail of that
     */
    public static void clientsCargo() {


        //at first we call clientList function to show the list of clients
        clientList();

        /*after showing the list user can press 0 to return to menu
        or enter the the name of one client to see the client`s cargos
        */
        Scanner myinput = new Scanner(System.in);
        String firstInput = myinput.nextLine();

        Client thisClient = new Client();// for saving client for return action

        if (firstInput.equals("0"))
        {
            menu();

            return;
        }
        else {
            while (true) {
                int index = 1;
                int flag1 = 1;
                int flag2 = 1;
                for (Client client : freightAgency.getClients()) // we check the input name is in the list or not
                {
                    if (client.toString().equals(firstInput))
                    {
                        flag1 = 0;
                        thisClient = client;
                        if (client.getCargoes().size() != 0)
                        {
                            for (Cargo cargo : client.getCargoes())
                            {
                                System.out.println(index + ". " + cargo.getName());
                                index++;
                            }
                        }
                        else
                        {
                            System.out.println("No cargo set.");
                        }
                    }
                }
                if (flag1 == 1)
                {
                    System.out.println("the client isn`t available.");
                    clientsCargo();
                    break;
                }
                String secondInput = myinput.nextLine();
                if (secondInput.equals("0")) {
                    clientsCargo();
                    break;
                }
                else
                {
                    for (Cargo cargo : thisClient.getCargoes())
                    {
                        if (cargo.getName().equals(secondInput))
                        {
                            flag2=0;
                            cargo.showCargo();
                            while (true) {
                                String thirdInput = myinput.nextLine();
                                if (thirdInput.equals("0"))
                                    break;
                                else
                                    System.out.println("please enter 0 to return");
                            }
                        }
                    }
                    if (flag2 == 1)
                    {
                        firstInput = secondInput;
                    }
                }
            }
        }
    }

    /**
     * if user enter the item number three(Set a cargo) we call this function
     * this function get the detail of cargo from user and add it to cargo list
     * if the client is registered before now we add cargos tho client`s list only
     * finally show the total cost
     */
    public static void setCargo()
    {
        String fName , lName , insuredst , type , myType;
        int  origin , destination ;
        double weight;
        boolean insured;
        Scanner input = new Scanner(System.in);
        fName = input.next();
        lName = input.next();
        origin = input.nextInt();
        destination = input.nextInt();
        weight = input.nextDouble();
        insuredst = input.next();
        myType = input.nextLine();
        type = myType.trim();

        Client thisClient = new Client();
        String name = fName + " " + lName;
        boolean clientExistence = false;
        for (Client client : freightAgency.getClients())
        {
            if (name.equals(client.toString())) {
                clientExistence = true;
                thisClient = client;
            }
        }
        //change the insured in form of String in to boolean insured
        if (insuredst.equals("Yes"))
            insured = true;
        else if (insuredst.equals("No"))
            insured = false;
        else
        {
            System.out.println("Please enter Yes or No for insured");
            return;
        }
        //checking the type of transportation
        if (type.equals("Sea"))
        {
            SeaCargo seaCargo = new SeaCargo(origin,destination,weight,insured,type);
            if (seaCargo.isValidTranspose())
            {

                if (clientExistence)
                {
                    thisClient.addCargo(seaCargo);
                    System.out.println("The cargo is added to this client`s cargo list.");
                }
                else
                {
                    thisClient.setFirstName(fName);
                    thisClient.setLastName(lName);
                    thisClient.addCargo(seaCargo);
                    System.out.println("Client registered");
                    freightAgency.addClient(thisClient);
                }
                freightAgency.addCargo(seaCargo);
                seaCargo.setPrice();
                System.out.println("Total cost "+ seaCargo.getPrice());
            }
            else
                System.out.println("Transportation not available ");

        }else if (type.equals("Air"))
        {
            AirCargo airCargo = new AirCargo(origin,destination,weight,insured,type);
            if (airCargo.isValidTranspose())
            {

                if (clientExistence)
                {
                    thisClient.addCargo(airCargo);
                    System.out.println("The cargo is added to this client`s cargo list.");
                }
                else
                {
                    thisClient.setFirstName(fName);
                    thisClient.setLastName(lName);
                    thisClient.addCargo(airCargo);
                    System.out.println("Client registered");
                    freightAgency.addClient(thisClient);
                }
                freightAgency.addCargo(airCargo);
                airCargo.setPrice();
                System.out.println("Total cost "+ airCargo.getPrice());
            }
            else
                System.out.println("Transportation not available ");
        }else if (type.equals("Ground Breakable"))
        {
            BreakableGroundCargo breakableGroundCargo = new BreakableGroundCargo(origin,destination,weight,insured,type);
            if (breakableGroundCargo.isValidTranspose())
            {

                if (clientExistence)
                {
                    thisClient.addCargo(breakableGroundCargo);
                    System.out.println("The cargo is added to this client`s cargo list.");
                }
                else
                {
                    thisClient.setFirstName(fName);
                    thisClient.setLastName(lName);
                    thisClient.addCargo(breakableGroundCargo);
                    System.out.println("Client registered");
                    freightAgency.addClient(thisClient);
                }
                freightAgency.addCargo(breakableGroundCargo);
                breakableGroundCargo.setPrice();
                System.out.println("Total cost "+ breakableGroundCargo.getPrice());
            }
            else
                System.out.println("Transportation not available ");
        }else if (type.equals("Ground Fast"))
        {
            FastGroundCargo fastGroundCargo = new FastGroundCargo(origin,destination,weight,insured,type);
            if (fastGroundCargo.isValidTranspose())
            {

                if (clientExistence)
                {
                    thisClient.addCargo(fastGroundCargo);
                    System.out.println("The cargo is added to this client`s cargo list.");
                }
                else
                {
                    thisClient.setFirstName(fName);
                    thisClient.setLastName(lName);
                    thisClient.addCargo(fastGroundCargo);
                    System.out.println("Client registered");
                    freightAgency.addClient(thisClient);
                }
                freightAgency.addCargo(fastGroundCargo);
                fastGroundCargo.setPrice();
                System.out.println("Total cost "+ fastGroundCargo.getPrice());
            }
            else
                System.out.println("Transportation not available ");
        }else if (type.equals("Ground Normal"))
        {
            NormalGroundCargo normalGroundCargo = new NormalGroundCargo(origin,destination,weight,insured,type);
            if (normalGroundCargo.isValidTranspose())
            {

                if (clientExistence)
                {
                    thisClient.addCargo(normalGroundCargo);
                    System.out.println("The cargo is added to this client`s cargo list.");
                }
                else
                {
                    thisClient.setFirstName(fName);
                    thisClient.setLastName(lName);
                    thisClient.addCargo(normalGroundCargo);
                    System.out.println("Client registered");
                    freightAgency.addClient(thisClient);
                }
                freightAgency.addCargo(normalGroundCargo);
                normalGroundCargo.setPrice();
                System.out.println("Total cost "+ normalGroundCargo.getPrice());
            }
            else
                System.out.println("Transportation not available ");
        }

    }

    /**
     * if user enter the item number four(Add a client ) we call this function
     * with getting the name of clients register them
     */
    public static void addClient()
    {
        String fName , lName;
        Scanner input = new Scanner(System.in);
        fName = input.next();
        lName = input.next();
        String name = fName + " " + lName;
        for (Client client : freightAgency.getClients())
        {
            if (name.equals(client.toString())) {
                System.out.println("Client has already registered");
                return;
            }
        }
        Client newClient = new Client();
        newClient.setFirstName(fName);
        newClient.setLastName(lName);
        freightAgency.addClient(newClient);
        System.out.println("The client is added successfully.");
    }
}