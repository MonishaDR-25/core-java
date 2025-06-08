package com.xworkz.exceptions;

public class IngredientParser {
    public static void main(String[] args) {
        String[] ingredients={"salt", "sugar", "Flour"};
        try{
            System.out.println("ingredients"+ingredients[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index"+e.getMessage());
        }
    }
}
