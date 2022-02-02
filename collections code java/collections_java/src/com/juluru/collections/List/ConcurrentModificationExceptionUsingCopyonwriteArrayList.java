package com.juluru.collections.List;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class ConcurrentModificationExceptionUsingCopyonwriteArrayList {
    public static void main(String[] args) {
       //CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

       CopyOnWriteArraySet<Integer> list = new CopyOnWriteArraySet<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            System.out.println("List Value:" + value);
            if (value.equals(3)) {
                list.add(10);
                list.remove(value);
            }
        }

        System.out.println("List Value after removing:" + list);



    }
}
