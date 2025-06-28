package com.xworkz.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMethods {

    public static void main(String[] args) {

    //1.sort
    int[] numbers = {5, 2, 9};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));

//2.binarySearch
        int index=Arrays.binarySearch(numbers,5);
        System.out.println("Index:"+index);

        //3.equals()
        int[] a={1,2,3};
        int[] b={1,2,3};
        System.out.println("Equal:"+Arrays.equals(a,b));

        //4.fill()
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 7);
        System.out.println("4. Fill: " + Arrays.toString(fillArray));

        //5.toString
        String[] names={"Monisha","Chandana"};
        System.out.println("ToString:"+Arrays.toString(names));

        //6.copyOf
        int[] copied=Arrays.copyOf(a,8);
        System.out.println("Copy Of:"+Arrays.toString(copied));

        //7.copyOfRange
        int[] rangeCopy = Arrays.copyOfRange(b, 0, 2);
        System.out.println("7. CopyOfRange: " + Arrays.toString(rangeCopy));

        // 8. asList()
        List<String> nameList = Arrays.asList("One", "Two", "Three");
        System.out.println("8. asList: " + nameList);

        // 9. deepEquals()
        String[][] deepA = {{"X", "Y"}};
        String[][] deepB = {{"X", "Y"}};
        System.out.println("9. DeepEquals: " + Arrays.deepEquals(deepA, deepB));

        // 10. deepToString()
        String[][] deepArray = {{"Apple", "Banana"}, {"Cat"}};
        System.out.println("10. DeepToString: " + Arrays.deepToString(deepArray));

        // 11. setAll()
        int[] squares = new int[5];
        Arrays.setAll(squares, i -> i * i);
        System.out.println("11. setAll (squares): " + Arrays.toString(squares));

        // 12. stream()
        System.out.print("12. stream (sorted): ");
        Arrays.stream(new int[]{6, 3, 8}).sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 13. parallelSort()
        int[] data = {9, 4, 2, 7};
        Arrays.parallelSort(data);
        System.out.println("13. parallelSort: " + Arrays.toString(data));

        // 14. hashCode()
        System.out.println("14. hashCode: " + Arrays.hashCode(new int[]{1, 2, 3}));

        // 15. compare()
        //int result;
       // result = Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 3, 2});
        //System.out.println("15. compare: " + result); // -1 if first is smaller
    }

}

