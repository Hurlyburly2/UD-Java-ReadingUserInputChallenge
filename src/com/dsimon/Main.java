package com.dsimon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCounter = 1;
        int sum = 0;

        while (numberCounter <= 10) {
            System.out.println("Enter number #" + numberCounter);

            int currentNumber = 0;
            boolean hasNextInt = scanner.hasNextInt();

            while (!hasNextInt) {
                System.out.println("Invalid Number!");
                scanner.nextLine();
                hasNextInt = scanner.hasNextInt();
            }
            sum += scanner.nextInt();
            scanner.nextLine();

            numberCounter++;
        }
        System.out.println("Your sum is: " + sum);

        scanner.close();
    }
}
