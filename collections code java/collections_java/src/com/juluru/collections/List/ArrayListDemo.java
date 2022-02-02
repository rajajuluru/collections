package com.juluru.collections.List;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arraylist=new ArrayList<>();
        // Adding elements to ArrayList

        arraylist.add("raja");
        arraylist.add("juluru");

        // Here we are mentioning the index
        // at which it is to be added
        arraylist.add(0, "kumar");

        System.out.println(arraylist);
         //changing the element
        // Setting element at 1st index
        arraylist.set(0, "For");
        System.out.println("Updated ArrayList       "+arraylist);
        //Removing Elements
        //using index remove
        arraylist.remove(0);
        System.out.println("after using index remove       "+arraylist);
        arraylist.remove("juluru");
        System.out.println("after using object remove       "+arraylist);
        arraylist.add("juluru");
        arraylist.add("kumar");
        arraylist.add("hareesh");
        arraylist.add("yuvraj");
        //iteration
        System.out.println("tradition iteration for loop");
        for (int i = 0; i < arraylist.size(); i++) {

            System.out.println(arraylist.get(i) + " ");
        }

        System.out.println("iteration using for each");

        // Using the for each loop
        for (String str : arraylist)
            System.out.println(str + " ");
        System.out.println("iteration using iterator");
        Iterator<String> iterator = arraylist.iterator();

        while (iterator.hasNext())//retur true
        {
            System.out.println(iterator.next());
        }
        System.out.println("iteration using listIterator");

        ListIterator<String> stringListIterator = arraylist.listIterator(arraylist.size());
     while (stringListIterator.hasPrevious())
     {
        // System.out.println("in previos loop");
         System.out.println(stringListIterator.previous());
     }

     //reverse
       // Collections.reverse();


        //addAll
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Ball");
        words.add("Cat");

         //arraylist.addAll(words);
        arraylist.addAll(1,words);

        System.out.println(arraylist + " after addall method");
        System.out.println(arraylist.size() + " size of an arraylist");
        //to remove all

        arraylist.removeAll(words);
        System.out.println("after removing words collections ");
        System.out.println(arraylist);
        //arraylist.retainAll(words);
        System.out.println(arraylist.contains("raja")+"        check contains raja in arraylist or not");



    }
}
