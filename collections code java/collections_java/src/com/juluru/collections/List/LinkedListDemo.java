package com.juluru.collections.List;

import java.util.*;

public class LinkedListDemo {

        public static void main(String[] args) {
            LinkedList<String> linkedList=new LinkedList<>();
            // Adding elements to ArrayList
            //linkedList.descendingIterator();
            linkedList.add("raja");
            linkedList.add("juluru");

            // Here we are mentioning the index
            // at which it is to be added
            linkedList.add(0, "kumar");

            System.out.println(linkedList);
            //changing the element
            // Setting element at 1st index
            linkedList.set(0, "For");
            System.out.println("Updated ArrayList       "+linkedList);
            //Removing Elements
            //using index remove
            linkedList.remove(0);
            System.out.println("after using index remove       "+linkedList);
            linkedList.remove("juluru");
            System.out.println("after using object remove       "+linkedList);
            linkedList.add("juluru");
            linkedList.add("kumar");
            linkedList.add("hareesh");
            linkedList.add("yuvraj");
            //iteration
            System.out.println("tradition iteration for loop");
            for (int i = 0; i < linkedList.size(); i++) {

                System.out.println(linkedList.get(i) + " ");
            }

            System.out.println("iteration using for each");

            // Using the for each loop
            for (String str : linkedList)
                System.out.println(str + " ");
            System.out.println("iteration using iterator");
            Iterator<String> iterator = linkedList.iterator();

            while (iterator.hasNext())//retur true
            {
                System.out.println(iterator.next());
            }
            System.out.println("iteration using listIterator");
            ListIterator<String> stringListIterator = linkedList.listIterator(linkedList.size());
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

            // linkedList.addAll(words);
            linkedList.addAll(1,words);

            System.out.println(linkedList + " after addall method");
            System.out.println(linkedList.size() + " size of an linkedList");
            //to remove all

            linkedList.removeAll(words);
            System.out.println("after removing words collections ");
            System.out.println(linkedList);
            //linkedList.retainAll(words);
            System.out.println(linkedList.contains("raja")+"        check contains raja in linkedList or not");


        }
    }


