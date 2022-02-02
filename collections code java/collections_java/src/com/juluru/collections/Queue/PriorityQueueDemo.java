package com.juluru.collections.Queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("raja");
        pq.add("For");
        pq.add("raja");

        System.out.println("Initial PriorityQueue " + pq);


        // Using the peek() method
        String element = pq.peek();
        System.out.println("Accessed Element: " + element);
        System.out.println("iterator ");


        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }

        pq.offer("The");
        pq.offer("Priority");
        pq.offer("Class");
        // Displaying th final Queue
        System.out.println("Priority queue after Insertion: " + pq);
        pq.remove("Priority");

        System.out.println("After Remove - " + pq);

        System.out.println("Poll Method - " + pq.poll());

        System.out.println("Final PriorityQueue - " + pq);



    }
}
