package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("1. Basic Method\n" +
                "2. Method With parameter\n" +
                "3. Method With Return Value\n" +
                "4. Validation With Age\n " +
                "\nExit: 0");

        Scanner userChoice = new Scanner(System.in);
        int choice = 101;

        while (choice!=0){
            System.out.print("\nEnter a choice: ");
            choice = userChoice.nextInt();

            switch (choice) {
                case 1:
                    method1();
                    break;
                case 2:
                    method2("ABCDE", 25);
                    break;
                case 3:
                    int summation = method3(5, 5);
                    System.out.println(summation);
                    break;
                case 4:
                    System.out.print("Enter your age: ");
                    Scanner userAge = new Scanner(System.in);
                    int age = userAge.nextInt();

                    validationWithAge(age);
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

    static void method1() {
        int a = 2;
        int b = 4;
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    static void method2(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    static int method3(int a, int b) {
        return a + b;
    }

    static void validationWithAge(int age) {
        if (age < 18) {
            System.out.println("Access denied! You are not old enough!");
        } else {
            System.out.println("Access granted!");
        }
    }

}
