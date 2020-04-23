package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. From Another Class (with constructor)\n" +
                "2. Another Another Class (constructor with parameter)\n" +
                "\nExit: 0");


        Scanner userChoice = new Scanner(System.in);
        int choice = 101;

        while (choice!=0){
            System.out.print("\nEnter a choice: ");
            choice = userChoice.nextInt();

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
                    if (choice==0){
                        System.out.println("\nExit!");
                    }else {
                        System.out.println("Wrong input!");
                    }
            }
        }
    }
}
