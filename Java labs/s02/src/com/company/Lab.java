package com.company;

/**
 * The Lab class represents a lab in a lab adminstration system
 * It holds the lab details relavent in our context.
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Lab {
    // the lab’s TA
    private TA ta;

    // the lab’s students
    private Student[] students;

    // the average of lab’s students’ grade
    private int avg;

    // the lab’s day
    private String day;

    // the lab’s capacity
    private int capacity;

    // the lab’s currentSize that tell us how many students are in the class now
    private int currentSize;

    /**
     * Create a new lab with a given capacity and day.
     *
     * @param cap the capacity of lab
     * @param d day when students have class
     * @param ta ta of class
     */
    public Lab(int cap, String d , TA ta) {
        this.ta = ta;
        capacity = cap;
        day = d;
        students = new Student[capacity];
        avg = 0;
        currentSize = 0;
    }

    /**
     * Enroll student to the lab.
     * @param std set students of lab
     */
    public void enrollStudent(Student std)
    {
        if (currentSize < capacity)
        {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    /**
     * Print the student’s first name and ID number and average of lab to the output terminal.
     */
    public void print()
    {
        for (int i = 0; i <currentSize; i++) {
            System.out.println("student`s first name: (" + students[i].getFirstName()
                    + ") | student`s id:(" + students[i].getId()
                    + ") | student`s grade:"+ students[i].getGrade());
        }
        System.out.println("Lab average:" + avg);
    }

    /**
     * get the students of lab
     * @return students field
     */
    public Student[] getStudents()
    {
        return students;
    }

    /**
     * set new students in lab and calculate current size again
     * @param students set students of lab
     */
    public void setStudents(Student[] students)
    {
        this.students = students;
        int index = 0;
        for(Student student:students)
        {
            if(student == null)
                break;
            index++;
        }
        currentSize = index;
    }

    /**
     * get the average of lab
     * @return avg field
     */
    public int getAvg()
    {
        return avg;
    }

    /**
     * Calculate average of lab.
     */
    public void calculateAvg()
    {
        int total = 0;

        for (int i = 0; i < currentSize; i++)
        {
            total += students[i].getGrade();
        }
        avg = total/currentSize;
    }

    /**
     * get the day of lab
     * @return  day field
     */
    public String getDay()
    {
        return day;
    }

    /**
     * @param day set day of lab
     */
    public void setDay(String day)
    {
        this.day = day;
    }

    /**
     * get the capacity of lab
     * @return capacity field
     */
    public int getCapacity()
    {
        return capacity;
    }

    /**
     * @param capacity set capacity of lab
     */
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
}
