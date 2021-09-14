/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("What is the length in feet? ");
            int length = input.nextInt();
            System.out.print("What is the width in feet? ");
            int width = input.nextInt();

            int total = length * width;
            double perBucket = 350.00;
            double buckets = total/perBucket;

            System.out.print("You will need to purchase " + Math.ceil(buckets) + " gallons of paint to cover " + total + " square feet.");
        }
    }