package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. From Another Class (with constructor)\n" +
                "2. Another Another Class (constructor with parameter)\n");

        System.out.println("Enter a choice: ");
        Scanner userChoice = new Scanner(System.in);
        int choice = userChoice.nextInt();

        switch (choice) {
            case 1:
                AnotherClass messageClass = new AnotherClass();
                messageClass.message();
                break;
            case 2:
                AnotherAnotherClass userInfo = new AnotherAnotherClass("ABCDE", 25);
                System.out.println("Name: " + userInfo.getName());
                System.out.println("Age: " + userInfo.getAge());
                break;
            default:
                System.out.println("Wrong input!");
        }
    }
}
