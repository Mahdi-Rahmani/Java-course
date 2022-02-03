package ceit.aut.ac.ir.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This class contains the frame of GUI
 * We control and design the GUI of this programme here
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class CFrame extends JFrame implements ActionListener {
    //The mainPanel
    private CMainPanel mainPanel;
    //The new Item in menuBar
    private JMenuItem newItem;
    //The save Item in menuBar
    private JMenuItem saveItem;
    //The save Date Item in menuBar
    private JMenuItem saveDateItem;
    //The exit Item in menuBar
    private JMenuItem exitItem;

    /**
     * Create a new CFrame.
     *
     * @param title title of frame.
     */
    public CFrame(String title) {
        super(title);

        setIcon();//set an Icon

        initMenuBar(); //create menuBar

        initMainPanel(); //create main panel
    }

    /**
     * set the application icon.
     * The method set an icon for Note.
     */
    private void setIcon() {
        ImageIcon iconCalculator = new ImageIcon("./images/note.png");
        setIconImage(iconCalculator.getImage());
    }

    /**
     * make MenuBar.
     * The method makes MenuBar for Note.
     */
    private void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu jmenu = new JMenu("File");

        newItem = new JMenuItem("New");
        saveItem = new JMenuItem("Save");
        saveDateItem = new JMenuItem("Save Date");
        exitItem = new JMenuItem("Exit");

        newItem.addActionListener(this);
        saveItem.addActionListener(this);
        saveDateItem.addActionListener(this);
        exitItem.addActionListener(this);

        jmenu.add(newItem);
        jmenu.add(saveItem);
        jmenu.add(saveDateItem);
        jmenu.add(exitItem);

        menuBar.add(jmenu);
        setJMenuBar(menuBar);
    }

    /**
     * make main panel.
     * The method makes mainPanel for Note.
     */
    private void initMainPanel() {
        mainPanel = new CMainPanel();
        add(mainPanel);
    }

    /**
     * an Override method
     * Handel action performed for MenuBar.
     * @param e action event.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            mainPanel.addNewTab();
        } else if (e.getSource() == saveItem) {
            mainPanel.saveNote();
        } else if (e.getSource() == saveDateItem) {
            mainPanel.saveObjectNote();
        } else if (e.getSource() == exitItem) {
            //TODO: Phase1: check all tabs saved ...
            mainPanel.saveAllNotes();
            System.exit(0);
        } else {
            System.out.println("Nothing detected...");
        }
    }
}
