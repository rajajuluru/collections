package com.juluru.collections.List;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackDemoClass {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push( 20);
        stack.push(13);
        stack.push( 89);
        stack.push( 90);
        stack.push( 11);
        stack.push( 45);
        stack.push( 18);

        System.out.println("elements in stack are       "+stack);
        System.out.println("pop of elements in stack        "+stack.pop());
        System.out.println("after using pop elements in stack are       "+stack);
        System.out.println("peek elements       "+stack.peek());
        System.out.println("after using peek elements in stack are       "+stack);
        System.out.println("searching elements in stack are       "+stack.search(45));
        System.out.println("Is the stack empty? = " +stack.isEmpty());
        //Clear the Vector
        System.out.println("iterator " );
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext())//retur true
        {
            System.out.println(iterator.next());
        }
        stack.clear();
        System.out.println("after clear method Is the stack empty? = " +stack.isEmpty());

    }
}
