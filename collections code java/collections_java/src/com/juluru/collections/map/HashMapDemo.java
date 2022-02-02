package com.juluru.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // No need to mention the generic type twice
        Map<Integer, String> hm1
                = new TreeMap<>();

        // Initialization of a HashMap using Generics
        HashMap<Integer, String> hm2
                = new HashMap<Integer, String>();

        // Add Elements using put() method
        // Custom input elements
        hm1.put(10, "ten");
        hm1.put(1, "one");
        hm1.put(2, "two");
        hm1.put(3, "three");


        hm2.put(4, "four");
        hm2.put(5, "five");
        hm2.put(6, "six");

        System.out.println("Initial Map " + hm1);

        hm1.put(2, "For");
        hm1.remove(1);
        System.out.println("after changing " + hm1);

        for (Map.Entry<Integer, String> e : hm2.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());

        System.out.println("using for each loop");
        hm2.forEach((k, v) -> {
            System.out.println("Key: " + k
                    + " Value: " + v);

        });


        hm2.computeIfPresent(4,(key,val)->{
          return val=val+" fourty";
        });

        System.out.println("after compute for each loop");
        hm2.forEach((k, v) -> {
            System.out.println("Key: " + k
                    + " Value: " + v);

        });

        hm2.containsKey(4);
        hm2.clear();
        System.out.println(hm2.size()+"size");
    }
}







