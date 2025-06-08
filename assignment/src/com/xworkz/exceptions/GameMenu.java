package com.xworkz.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameMenu {
    public static void main(String[] args) {
        System.out.println("1. Start Game\n2. Load Game\n3. Exit");
        Scanner scanner = new Scanner(System.in);
        try {
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> System.out.println("Game Started");
                case 2 -> System.out.println("Game Loaded");
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number.");
        }
        scanner.close();
    }
}
