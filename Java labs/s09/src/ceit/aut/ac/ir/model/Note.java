package ceit.aut.ac.ir.model;

import java.io.Serializable;

/**
 * This is a model class for note.
 * This class holds the information related to Note.
 * It implements Serializable and we van save this class as an object in file
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Note implements Serializable {
    //The title of note
    private String title;
    //The content of note
    private String content;
    //The date of note
    private String date;

    /**
     * Create a new Note with given title and content and date.
     *
     * @param title title of Note.
     * @param content content  of Note.
     * @param date date of Note.
     */
    public Note(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    /**
     * an Override method
     * get a String for Note.
     * @return a String.
     */
    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    /**
     * get the date of the note
     * @return date as a String
     */
    public String getDate() {
        return date;
    }

    /**
     * get the title of note
     * @return title as a String
     */
    public String getTitle() {
        return title;
    }
}


