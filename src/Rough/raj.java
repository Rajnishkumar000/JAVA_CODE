package Rough;
// Java Program to Illustrate Autoboxing

// Importing required classes


import java.io.*;
import java.util.*;

// Main class
class raj {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty ArrayList of integer type
        List<Integer> list = new ArrayList<Integer>();

        // Adding the int primitives type values by
        // converting them into Integer wrapper object
        for (int i = 0; i < 10; i++)

            System.out.println(list.add(Integer.valueOf(i)));

        System.out.println("ONE TWO");
        System.out.println(list.add(Integer.valueOf(6)));
    }
}


