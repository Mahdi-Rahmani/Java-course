package com.company;

/**
 * this class manages the process of playing a music
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class MusicPlayer {
    // The current player. It might be null.
    private boolean isPlaying;

    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer() {
        isPlaying = false;
    }


    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     *
     * @param music The file to be played.
     */
    public void startPlaying(Music music) {
        System.out.println(music.getAddress() + "-" + music.getArtist() + "-" + music.getYear() + " is playing...");
        isPlaying = true;
    }

    /**
     * stop playing the given audio file.
     */
    public void stop() {
        if (isPlaying) {
            System.out.println("player is stopped!");
            isPlaying = false;
        } else {
            System.out.println("player hasn't been played!");
        }

    }
}

