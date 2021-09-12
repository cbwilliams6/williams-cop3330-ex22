package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christian Williams
 */

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        if(num1 == num2 || num1 == num3 || num2 == num3){
            System.out.print("Enter different numbers ok");
        }
        else{
            int largest = num1;
            if(largest < num2){
                largest = num2;
            }
            if(largest < num3){
                largest = num3;
            }

            System.out.print("The largest number is " + largest + ".");
        }
    }
}