package com.company;
import java.util.Scanner;

/**
 * this is the Main class
 * run the programme with this class.
 * creat a phone book inside it.
 * with functions of this class we can modify our phonebook
 * @author Mahdi Rahmani
 * @version 1.0
 * @since 2020-10-17
 */
public class Main {

    //creat a new object from phone book and the form of that is static
    static PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String myInput;
        //the menu and decisions are happened in this section
        while (true)
        {
            myInput =input.nextLine();
            if(myInput.startsWith("contacts -a "))
                contactsAdd(myInput.substring(12));

            else if(myInput.startsWith("contacts -r "))
                contactRemove(myInput.substring(12));

            else if(myInput.startsWith("show -g "))
                showGroup(myInput.substring(8));

            else if(myInput.startsWith("show -c "))
                showContact(myInput.substring(8));

            else if(myInput.equals("show"))
                showAll();

            else if(myInput.equals("exit"))
                break;

            else
                System.out.println("please type in standard format");
        }
    }

    /**
     * if the user choose (contacts -a contact name) then we call this function
     * get the name of contact and after calling get the information of that contact
     * mostly we use the methods of Info class in this function
     * @param name name of contact
     */
    public static void contactsAdd(String name)
    {
        Scanner input = new Scanner(System.in);
        Info info = new Info();
        String myInput ;
        int index = 0;

        //get work information of contact from user
        System.out.println("Please enter work info: ");
        myInput = input.nextLine();
        info.setWorkInfo(myInput);

        //get group`s name that the contact is inside it
        do{
            index ++;
            System.out.println("Please enter group " + index + " or enter to finish: ");
            myInput = input.nextLine();
            if(!myInput.isBlank())
                info.setGroups(myInput);
        }while (!myInput.isBlank());

        //get emails of contact
        index = 0;
        do {
            index ++;
            System.out.println("Please enter email " + index + " or enter to finish: ");
            myInput = input.nextLine();
            if(!myInput.isBlank())
                info.setEmails(myInput);
        }while (!myInput.isBlank());

        //get phone numbers of contact
        index = 0;
        while (true)
        {
            index ++;
            System.out.println("Please enter phone number " + index + " or enter to finish: ");
            myInput = input.nextLine();
            if(!myInput.isBlank())
            {
                if (myInput.length() != 12)
                    index--;
                info.setPhones(myInput);
            }
            else if(index == 1)
            {
               System.out.println("contact must have one phone number at least");
               index--;
            }
            else
                break;
        }
        //after filling the fields are related to contact`s info finally we add it to phone book
        phoneBook.addContact(name,info);
        System.out.println("Contact saved!");
    }

    /**
     * if the user choose (contacts -r contact name) then we call this function
     * get the name of contact and if the contact exists we remove it from phone book
     * @param name name of contact
     */
    public static void contactRemove(String name)
    {
        if(phoneBook.deleteContact(name))
            System.out.println("Ok");
        else
            System.out.println("Not found");
    }

    /**
     * if the user choose (show -g group name) then we call this function
     * get the name of group and print name and information of contacts that inside in that group
     * @param groupName the group name
     */
    public static void showGroup(String groupName)
    {
        phoneBook.printContacts(groupName);
    }

    /**
     * if the user choose (show -c contact name) then we call this function
     * get the name of contact and if the contact exists we show the information of that contact
     * @param name name of contact
     */
    public static void showContact(String name)
    {
        Info info = new Info();
        info = phoneBook.findContact(name);
        if(info != null)
            info.printInfo();
        else
            System.out.println("Not found");
    }

    /**
     * if the user choose (show) then we call this function
     * print the list of contacts
     */
    public static void showAll()
    {
        phoneBook.printContacts();
    }
}
