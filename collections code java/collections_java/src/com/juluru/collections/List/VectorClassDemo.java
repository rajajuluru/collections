package com.juluru.collections.List;

import java.util.*;

public class VectorClassDemo {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        // Adding elements to ArrayList
        //vector.descendingIterator();
        vector.add("raja");
        vector.add("juluru");

        // Here we are mentioning the index
        // at which it is to be added
        vector.add(0, "kumar");

        System.out.println(vector);
        //changing the element
        // Setting element at 1st index
        vector.set(0, "For");
        System.out.println("Updated ArrayList       "+vector);
        //Removing Elements
        //using index remove
        vector.remove(0);
        System.out.println("after using index remove       "+vector);
        vector.remove("juluru");
        System.out.println("after using object remove       "+vector);
        vector.add("juluru");
        vector.add("kumar");
        vector.add("hareesh");
        vector.add("yuvraj");
        //iteration
        System.out.println("tradition iteration for loop");
        for (int i = 0; i < vector.size(); i++) {

            System.out.println(vector.get(i) + " ");
        }

        System.out.println("iteration using for each");

        // Using the for each loop
        for (String str : vector)
            System.out.println(str + " ");
        System.out.println("iteration using iterator");
        Iterator<String> iterator = vector.iterator();

        while (iterator.hasNext())//retur true
        {
            System.out.println(iterator.next());
        }
        System.out.println("iteration using listIterator");
        ListIterator<String> stringListIterator = vector.listIterator(vector.size());
        while (stringListIterator.hasPrevious())
        {
            // System.out.println("in previos loop");
            System.out.println(stringListIterator.previous());
        }
        System.out.println("iteration using enumeration------------------------------");
        Enumeration<String> elements = vector.elements();
        while (elements.hasMoreElements())
        {
            System.out.println(elements.nextElement());
        }
        //reverse
        // Collections.reverse();


        //addAll
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Ball");
        words.add("Cat");

        // vector.addAll(words);
        vector.addAll(1,words);

        System.out.println(vector + " after addall method");
        System.out.println(vector.size() + " size of an vector");
        //to remove all

        vector.removeAll(words);
        System.out.println("after removing words collections ");
        System.out.println(vector);
        //vector.retainAll(words);
        System.out.println(vector.contains("raja")+"        check contains raja in vector or not");

        System.out.println(vector.firstElement()+"    first element in vector");


        List<String> sublist=new Vector<>();
        sublist=vector.subList(2,4);
        System.out.println(sublist+"    sublist");






    }
}
