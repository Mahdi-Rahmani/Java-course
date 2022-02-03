package com.company;
/**
 * this class holds information of a music file
 * such as: address,artis,year
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */

public class Music {

    // the music’s address
    private String address;

    // the name of music`s artist
    private String artist;

    // the music’s year of publication
    private int publicationYear;

    // Indicates the situation of favorite
    private boolean isFavorite;

    /**
     * Create a new Music with a given address and artist and year.
     *
     * @param address address of Music
     * @param artist artist of Music
     * @param year year of Music*
     */
    public Music(String address, String artist, int year) {
        this.address = address;
        this.artist = artist;
        this.publicationYear = year;
        isFavorite = false;
    }

    /**
     * get the address of a music
     * @return name field
     */
    public String getAddress() {
        return address;
    }

    /**
     * get the artist`s name of a Music
     * @return artist field
     */
    public String getArtist() {
        return artist;
    }

    /**
     * get the year of a Music
     * @return year field
     */
    public int getYear() {
        return publicationYear;
    }

    /**
     * represents a music is user favorite or not
     * @return isFavorite field
     */
    public boolean getIsFavorite()
    {
        return isFavorite;
    }

    /**
     * @param isFavorite set situation of favorite
     */
    public void setIsFavorite(boolean isFavorite)
    {
        this.isFavorite = isFavorite;
    }

}
