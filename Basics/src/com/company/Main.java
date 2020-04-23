package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Choices
        System.out.println("1. Basic Printing \n" +
                "2. Variables \n" +
                "3. If Else \n" +
                "4. Switch Case \n" +
                "5. For Loop \n" +
                "6. For Each \n" +
                "7. While Loop \n" +
                "8. Do While \n" +
                "9. Array\n" +
                "\nExit: 0");


        Scanner userChoice = new Scanner(System.in);
        int choice = 101;

        while (choice != 0) {
            System.out.print("\nEnter choice: ");
            choice = userChoice.nextInt();

            switch (choice) {
                case 1:
                    print();
                    break;
                case 2:
                    variables();
                    break;
                case 3:
                    ifElse();
                    break;
                case 4:
                    switchCase();
                    break;
                case 5:
                    forLoop();
                    break;
                case 6:
                    forEach();
                    break;
                case 7:
                    whileLoop();
                    break;
                case 8:
                    doWhileLoop();
                    break;
                case 9:
                    arrays();
                    break;
                default:
                    if (choice==0){
                        System.out.println("\nExit!");
                    }else {
                        System.out.println("Wrong input!");
                    }
            }
        }
    }

    static void print() {
        System.out.println("Summation of 2+2 is: " + (2 + 2));
    }

    static void variables() {
        byte myByte = 5;
        int myInt = 500;
        float myFloat = 50.0f;
        double myDouble = 5000.000;
        long myLong = 50000000;
        String myString = "Full Name";
        char myChar = 'A';
        boolean myBool = true;


        System.out.println("Byte: " + myByte);
        System.out.println("Integer: " + myInt);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("String: " + myString);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBool);

    }

    static void ifElse() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = userInput.nextInt();

        if (input % 2 == 0) {
            System.out.println("Number " + input + " is Even");
        } else {
            System.out.println("Number " + input + " is Odd");
        }
    }

    static void switchCase() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int input = userInput.nextInt();

        switch (input) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month!");
        }

    }

    static void forLoop() {

        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
        }
    }

    static void forEach() {
        String[] names = {"ABC", "DEF", "IGH", "KLM", "NOP"};
        for (String i : names) {
            System.out.println(i);
        }
    }

    static void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println(i + 1);
            i++;
        }
    }

    static void doWhileLoop() {
        int i = 0;
        do {
            System.out.println(i + 1);
            i++;
        } while (i < 5);
    }

    static void arrays() {
        //Method 1
        String[] names = {"ABC", "DEF", "IGH", "KLM", "NOP"};
        System.out.println("Method 1 \n");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //Method 2
        System.out.println("\nMethod 2 \n");

        for (String i : names) {
            System.out.println(i);
        }

    }
}
