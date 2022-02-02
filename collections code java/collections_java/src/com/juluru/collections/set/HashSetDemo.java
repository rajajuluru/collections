package com.juluru.collections.set;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
       Set<String> hash_Set=new TreeSet<>();
       //Set<String> hash_Set=new LinkedHashSet<>();
       // Set<String> hash_Set=new HashSet<>();
//[Geeks, For, Example, Set]
        hash_Set.add("juluru");
        hash_Set.add("For");
        hash_Set.add("juluru");
        hash_Set.add("Example");
        hash_Set.add("Set");


        //printing elements
        System.out.println(hash_Set);
//        hash_Set.forEach(z->{
//
//        });


        // Creating an object of Set class
        // Declaring object of Integer type
        Set<Integer> a = new HashSet<Integer>();

        // Adding all elements to List
        a.addAll(Arrays.asList(
                new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

        // Again declaring object of Set class
        // with reference to HashSet
        Set<Integer> b = new HashSet<Integer>();

        b.addAll(Arrays.asList(
                new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));


        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);


        // Check if the above number exists in
        // the SortedSet or not
        // using contains() method
        System.out.println("Contains " + 2 + " "
                + difference.contains(2));
        difference.remove(2);

        System.out.println("after removing 2 "
                + difference);

        // Iterating through the Set
        // via for-each loop
        for (Integer value : b)

            // Printing all the values inside the object
            System.out.println(value + ", ");
        System.out.println( "iterating using iterator");
        Iterator<Integer> iterator = b.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next() + ", ");
        }
    }
}
