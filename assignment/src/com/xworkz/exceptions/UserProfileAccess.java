package com.xworkz.exceptions;

public class UserProfileAccess {
    public static void main(String[] args) {
        String name="";
        try{
            System.out.println("user name length"+name.length());
        }catch (NullPointerException e){
            System.out.println("name is null"+e.getMessage());
        }
    }
}
