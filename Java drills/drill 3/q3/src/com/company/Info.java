package com.company;

import java.util.HashSet;

/**
 * The Info class represents the information of a contact
 * It holds some information like groups , emails , phones
 * and information that relevant to contact job
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Info {

    //the job information that stored in form of String
    private String workInfo;

    //the groups that a contact can be a member of them and we store them in form of String
    private HashSet<String> groups;

    //the emails of a contact
    private HashSet<String> emails;

    /*the phone numbers of a contact
    the phone numbers must be a string with exactly 12 characters
    each contact must has one phone number at list*/
    private HashSet<String> phones;

    /**
     * Create a new object to save information of a contact.
     * groups and emails and phones are collections
     * we define them in form of HashSet because we dont want to save same information in them
     */
    public Info()
    {
        groups = new HashSet<String>();
        emails = new HashSet<String>();
        phones = new HashSet<String>();
    }

    /**
     * print information of a contact.
     * print work information and phones and groups and emails that relevant to a contact
     */
    public void printInfo()
    {
        int index = 0;// for counting the number of items that save in each collection
        System.out.println("The contact information:");
        //first : show workInfo
        System.out.println("Work information:");
        System.out.println(workInfo);
        //second : show the phone numbers of a contact
        System.out.println("Phones");
        for (String phone: phones)
        {
            index++;
            System.out.println(index + " -> " + phone);
        }
        //third : show the groups of a contact
        index = 0;
        System.out.println("Groups:");
        for (String group: groups)
        {
            index++;
            System.out.println(index + " -> " + group);
        }
        //forth : show the Emails of a contact
        index = 0;
        System.out.println("Emails:");
        for (String email: emails)
        {
            index++;
            System.out.println(index + " -> " + email);
        }
        // print something as separator
        System.out.println("------------------------------------");
    }

    /**
     *  @param jobInfo  set the work information of a contact
     */
    public void setWorkInfo(String jobInfo)
    {
        workInfo = jobInfo;
    }

    /**
     * get the work information of a contact
     * @return workInfo field
     */
    public String getWorkInfo()
    {
        return workInfo;
    }

    /**
     *  @param groupName  set the group names which the contact insides it
     */
    public void setGroups(String groupName)
    {
        groups.add(groupName);
    }

    /**
     * get the group names which the contact insides it
     * output is in the form of HashSet
     * so if user wrote two similar name for groups we ignore one of them
     * @return groups field
     */
    public HashSet<String> getGroups()
    {
        return groups;
    }

    /**
     *  @param email  set the emails of a contact
     */
    public void setEmails(String email)
    {
        emails.add(email);
    }

    /**
     * get the emails of a contact
     * output is in the form of HashSet
     * so if user wrote two similar emails we ignore one of them
     * @return emails field
     */
    public HashSet<String> getEmails()
    {
        return emails;
    }

    /**
     * if the phone numbers length isn`t 12 exactly , we don`t set the entry in the field
     *  @param phoneNumber  set the phone numbers of a contact
     */
    public void setPhones(String phoneNumber)
    {
        if(phoneNumber.length() == 12)
            phones.add(phoneNumber);
        else
            System.out.println("the phone number length must be 12");
    }

    /**
     * get the phone numbers of a contact
     * output is in the form of HashSet
     * so if user wrote two similar phone numbers we ignore one of them
     * @return phones field
     */
    public HashSet<String> getPhones()
    {
        return phones;
    }
}
