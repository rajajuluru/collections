package com.juluru.collections.List;

import java.util.ArrayList;

public class CloneArrayList {

    public static void main(String args[])
    {

        // Creating an empty ArrayList
        ArrayList<Integer> list
                = new ArrayList<Integer>();

        // Use add() method
        // to add elements in the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Displaying the list


        // Creating another linked list and copying
        ArrayList sec_list = new ArrayList();
        sec_list = (ArrayList)list.clone();
        sec_list.add(100);
        // Displaying the other linked list
        System.out.println("First ArrayList: "
                + list);
        System.out.println("Second ArrayList is: "
                + sec_list);
    }
}
