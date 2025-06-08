package com.xworkz.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RatingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter rating (1 to 5): ");
            int rating = scanner.nextInt();
            System.out.println("You rated: " + rating);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
        scanner.close();
    }
}
