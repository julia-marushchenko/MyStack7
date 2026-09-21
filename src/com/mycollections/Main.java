/**
 *  Java program to use Stack instance.
 */

package com.mycollections;

import java.util.Stack;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an instance of Stack.
        Stack<Integer> mystack = new Stack<>();

        // Add.
        mystack.push(2);
        mystack.push(1);
        mystack.push(9);
        mystack.push(5);
        mystack.push(3);

        // Print.
        System.out.println(mystack); // Output: [2, 1, 9, 5, 3]

        // Return and delete.
        System.out.println(mystack.pop()); // Output: 3

        // Print.
        System.out.println(mystack); // Output: [2, 1, 9, 5]

        // Delete all.
        mystack.clear();

        // Print.
        System.out.println(mystack); // Output: []

    }
}
