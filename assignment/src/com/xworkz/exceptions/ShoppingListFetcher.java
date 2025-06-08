package com.xworkz.exceptions;

public class ShoppingListFetcher {
    public static void main(String[] args) {
        String[] shoppingList = {"Milk", "Eggs", "Bread"};
        try {
            System.out.println("Item: " + shoppingList[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid item index: " + e.getMessage());
        }
    }
}
