package com.company;

import java.util.ArrayList;

/**
 * This class holds the information related to the Board of game
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Board {
    //the size of board in x axis
    private int xAxisSize;

    //the size of board in y axis
    private int yAxisSize;

    //thw elements of the game
    private ArrayList<Element> elements;

    /**
     * creat new board with a given xAxisSize and yAxisSize
     * @param xAxisSize size of board in x axis
     * @param yAxisSize size of board in y axis
     */
    public Board(int xAxisSize , int yAxisSize)
    {
        this.xAxisSize = xAxisSize;
        this.yAxisSize = yAxisSize;
        elements = new ArrayList<>();
    }

    /**
     * show the board for user
     */
    public void showBoard()
    {

    }

    /**
     * add an element on the board
     * @param element element object
     */
    public void addElement(Element element)
    {

    }
}
