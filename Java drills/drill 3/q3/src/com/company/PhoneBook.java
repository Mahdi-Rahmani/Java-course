package com.company;

import java.util.HashMap;

/**
 * The PhoneBook class represents all of our contacts
 * It holds the contacts with information that related to them
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class PhoneBook {
    /**
     * we save our contacts in form of HashMap
     * the name of contacts is the key of our HashMap
     * the information of a contact is the value of our HashMap
     */
    private HashMap<String,Info> contacts;

    /**
     * Create a new object from PhoneBook to save contacts.
     * contacts are collections and in form of HashMap.
     */
    public PhoneBook()
    {
        contacts = new HashMap<String, Info>();
    }

    /**
     * add contacts to Phone Book
     * if the contact exists from before we just update the information
     * @param name name of contact
     * @param info the information of contact
     * @return boolean value.(true or false)
     */
    public boolean addContact(String name,Info info)
    {
        if(contacts.containsKey(name))
        {
            contacts.replace(name,contacts.get(name),info);
            return true;
        }
        else
            contacts.put(name,info);
        return true;
    }

    /**
     * get the name of contact from user and find contact`s information
     * if the contact isn`t available return null value
     * @param name name of contact
     * @return Info if contact is available
     */
    public Info findContact(String name)
    {
        if(contacts.containsKey(name))
            return contacts.get(name);
        return null;
    }

    /**
     * get the name of contact from user and delete it
     * @param name name of contact
     * @return boolean value(true or false)
     */
    public boolean deleteContact(String name)
    {
        if(contacts.remove(name) == null )
            return false;
        else
            return true;
    }

    /**
     * get the name of group and return the name and information of contacts which inside that group az a HashMap
     * @param group the group name
     * @return sameGroupContacts as a HashMap
     */
    public HashMap<String, Info> findContacts(String group)
    {
        HashMap<String,Info> sameGroupsContacts = new HashMap<String, Info>();
        for(String name : contacts.keySet())
            if(contacts.get(name).getGroups().contains(group))
                sameGroupsContacts.put(name,contacts.get(name));
        return sameGroupsContacts;
    }

    /**
     * print the name of all contacts in our Phone Book
     */
    public void printContacts()
    {
        int index = 0;
        for(String name : contacts.keySet())
        {
            index++;
            System.out.println(index+")Contact name: " + name);
            System.out.println("----------------------");
        }
    }

    /**
     * get the name of group and print the name of all contacts and their information that inside in that group
     * @param group the group name
     */
    public void printContacts(String group)
    {
        HashMap<String,Info> sameGroupsContacts = new HashMap<String, Info>();
        sameGroupsContacts = findContacts(group);
        for(String name : sameGroupsContacts.keySet())
        {
            Info info = new Info();
            System.out.println("Contact name: " + name);
            info = sameGroupsContacts.get(name);
            info.printInfo();
        }
    }


}
