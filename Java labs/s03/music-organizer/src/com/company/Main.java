package com.company;

import java.util.Scanner;

/**
 * this is main class
 * in this class we creat objects from MusicCollection
 * communicate with user to make decision what to do
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since 2020-10-19
 */
public class Main {
    //creat a music collection for pop musics
    static MusicCollection pop = new MusicCollection();

    //creat a music collection for jazz musics
    static MusicCollection jazz = new MusicCollection();

    //creat a music collection for rock musics
    static MusicCollection rock = new MusicCollection();

    //creat a music collection for country musics
    static MusicCollection country = new MusicCollection();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String myInput;

        //in this section we control the programme
        while (true)
        {
            printMenu();
            myInput = input.nextLine();
            switch (myInput)
            {
                case "1":
                    addMusic();
                    break;
                case "2":
                    play();
                    break;
                case "3":
                    stop();
                    break;
                case "4":
                    addToFavorite();
                    break;
                case "5":
                    removeFromFavorite();
                    break;
                case "6":
                    showMusic();
                    break;
                case "7":
                    showMusics();
                    break;
                case  "8":
                    search();
                    break;
                case "9":
                    return;
                default:
                    System.out.println("please enter the number of an item of menu");
            }

        }
    }

    /**
     * print the menu of items
     */
    public static void printMenu()
    {
        System.out.println("please enter an item from list:");
        System.out.println("1)add a music");
        System.out.println("2)play");
        System.out.println("3)stop");
        System.out.println("4)add to favorite");
        System.out.println("5)remove from favorite");
        System.out.println("6)show file of a music");
        System.out.println("7)show the list of musics");
        System.out.println("8)search");
        System.out.println("9)exit");
    }

    /**
     * if user choose (add music) we call this function
     * get the information of a music and add it to the related category collection
     */
    public static void addMusic()
    {
        Scanner input = new Scanner(System.in);
        String myInput;
        System.out.println("please enter this information:");
        System.out.print("address: ");
        String address = input.nextLine();

        System.out.print("name: ");
        String name = input.nextLine();

        System.out.print("Year of publication: ");
        String year = input.nextLine();

        System.out.println("please enter the category:");
        myInput = input.nextLine();

        Music music = new Music(address,name,Integer.parseInt(year));

        switch (myInput)
        {
            case "pop":
                pop.addFile(music);
                break;
            case "jazz":
                jazz.addFile(music);
                break;
            case "rock":
                rock.addFile(music);
                break;
            case "country":
                country.addFile(music);
                break;
            default:
                System.out.println("your category isn`t valid.");
        }
    }

    /**
     * if user choose (play) we call this function
     * get the category and index of a music and play it
     */
    public static void play()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the category");
        String category = input.nextLine();
        System.out.println("enter the index of music that you want to play");
        int index = input.nextInt();
        switch (category)
        {
            case "pop":
                pop.startPlaying(index);
                break;
            case "jazz":
                jazz.startPlaying(index);
                break;
            case "rock":
                rock.startPlaying(index);
                break;
            case "country":
                country.startPlaying(index);
                break;
            default:
                System.out.println("your category isn`t valid.");
        }
    }

    /**
     * if user choose (stop) we call this function
     * get the category and index of a music and stop it
     */
    public static void stop()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the category of music that you want to stop");
        String category = input.nextLine();
        switch (category)
        {
            case "pop":
                pop.stopPlaying();
                break;
            case "jazz":
                jazz.stopPlaying();
                break;
            case "rock":
                rock.stopPlaying();
                break;
            case "country":
                country.stopPlaying();
                break;
            default:
                System.out.println("your category isn`t valid.");
        }
    }

    /**
     * if user choose (add to favorite) we call this function
     * get the category and index of a music and add it to favorite list
     */
    public static void addToFavorite()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the category");
        String category = input.nextLine();
        System.out.println("enter the index of music that you want to add to favorite");
        int index = input.nextInt();
        switch (category)
        {
            case "pop":
                pop.addFavorite(index);
                break;
            case "jazz":
                jazz.addFavorite(index);
                break;
            case "rock":
                rock.addFavorite(index);
                break;
            case "country":
                country.addFavorite(index);
                break;
            default:
                System.out.println("your category isn`t valid.");
        }
    }

    /**
     * if user choose (remove from favorite) we call this function
     * get the category and index of a music and remove it from favorite list
     */
    public static void removeFromFavorite()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the category");
        String category = input.nextLine();
        System.out.println("enter the index of music that you want to remove from favorite");
        int index = input.nextInt();
        switch (category)
        {
            case "pop":
                pop.removeFavorite(index);
                break;
            case "jazz":
                jazz.removeFavorite(index);
                break;
            case "rock":
                rock.removeFavorite(index);
                break;
            case "country":
                country.removeFavorite(index);
                break;
            default:
                System.out.println("your category isn`t valid.");
        }
    }

    /**
     * if user choose (show file of a music) we call this function
     * get the category and index of a music and show its details
     */
    public static void showMusic()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the category");
        String category = input.nextLine();
        System.out.println("enter the index of music that you want to remove from favorite");
        int index = input.nextInt();
        switch (category)
        {
            case "pop":
                pop.listFile(index);
                break;
            case "jazz":
                jazz.listFile(index);
                break;
            case "rock":
                rock.listFile(index);
                break;
            case "country":
                country.listFile(index);
                break;
            default:
                System.out.println("your category isn`t valid.");
        }
    }

    /**
     * if user choose (show the list of musics) we call this function
     * show all musics indifferent categories
     */
    public static void showMusics()
    {
        System.out.println("pop musics:");
        pop.listAllFiles();

        System.out.println("jazz musics:");
        jazz.listAllFiles();

        System.out.println("rock musics:");
        rock.listAllFiles();

        System.out.println("country musics:");
        country.listAllFiles();
    }

    /**
     * if user choose (search) we call this function
     * get a string from user and search it among all files
     */
    public static void search()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the string that you want to search");
        String st = input.nextLine();
        pop.search(st);
        jazz.search(st);
        rock.search(st);
        country.search(st);
    }

}
