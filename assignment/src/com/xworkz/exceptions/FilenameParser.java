package com.xworkz.exceptions;

public class FilenameParser {
    public static void main(String[] args) {
        String filename = "invalidfile";
        try {
            String extension = filename.substring(filename.lastIndexOf('.') + 1);
            System.out.println("File extension: " + extension);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Filename is malformed: " + e.getMessage());
        }
    }
}
