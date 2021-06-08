package org.example;
import java.util.Scanner;
/*
 * UCF cop3330 Summer 2021 Assignment 1 solutions
 * Copyright 2021 Keondez Robinson
 */
public class Main
{
    public static void main(String[] args) {
        int i, n1, n2, n3, max;
        Scanner input;

        max = 0;
        input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        n1 = input.nextInt();
        max = Math.max(n1, max);
        System.out.print("Enter the second number: ");
        n2 = input.nextInt();
        max = Math.max(n2, max);
        System.out.print("Enter the third number: ");
        n3 = input.nextInt();
        max = Math.max(n3, max);

        if (n1 != n2 && n2 != n3) {
            System.out.println("The largest number is " + max + ".");
        } else {
            System.out.println("Two or more numbers are the same. Exiting.");
        }
    }
}
