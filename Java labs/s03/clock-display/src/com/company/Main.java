package com.company;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * this is main class
 * in this class we design our clock and use other classes for running our clock
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since 2020-10-19
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        // creat new object from our ClockDisplay class
        ClockDisplay clock = new ClockDisplay();
        // define variables of second and minute and hour for set the  starting state of clock
        final int[] second = {0};
        final int[] minute = {0};
        final int[] hour = {0};
        //first page that user see it
        JFrame frame = new JFrame("Digital Clock");
        JButton set = new JButton("Set time");
        set.setBounds(70,180, 100,60);
        set.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //second page that user see it if push (set time) button
                JFrame frame2 = new JFrame("settings");
                JLabel label1 = new JLabel("seconds:");
                label1.setBounds(20,130,70,50);

                JLabel label2 = new JLabel("minutes:");
                label2.setBounds(20,200,70,50);

                JLabel label3 = new JLabel("hour:");
                label3.setBounds(20,270,70,50);

                String [] seconds = new String[60];
                for (int i =0 ; i<60 ; i++)
                    seconds [i]= ""+i;
                JComboBox box1 = new JComboBox(seconds);
                box1.setBounds(100,130,60,35);

                String [] minutes = new String[60];
                for (int i =0 ; i<60 ; i++)
                    minutes [i]= ""+i;
                JComboBox box2 = new JComboBox(minutes);
                box2.setBounds(100,200,60,35);

                String [] hours = new String[24];
                for (int i =0 ; i<24 ; i++)
                    hours [i]= ""+i;
                JComboBox box3 = new JComboBox(hours);
                box3.setBounds(100,270,60,35);

                JButton but = new JButton("SET");
                but.setBounds(100,350,70,40);
                but.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        second[0] = box1.getSelectedIndex();
                        minute[0] = box2.getSelectedIndex();
                        hour[0] = box3.getSelectedIndex();
                        clock.setTime(hour[0], minute[0], second[0]);
                        frame2.setVisible(false);
                    }
                });
                frame2.add(label1);
                frame2.add(label2);
                frame2.add(label3);
                frame2.add(box1);
                frame2.add(box2);
                frame2.add(box3);
                frame2.add(but);
                frame2.setSize(250,500);
                frame2.setLayout(null);
                frame2.setVisible(true);
                frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
            }
        });

        frame.add(set);
        frame.setSize(250,300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        //run the clock in this section
        clock.setTime(hour[0], minute[0], second[0]);
        JLabel j1 = new JLabel(clock.getTime());
        j1.setBounds(90,20,200,200);
        j1.setForeground(Color.RED);
        frame.add(j1);
        while (true)
        {
            clock.timeTick();
            j1.setText(clock.getTime());
            Thread.sleep(1000);
        }

    }
}
