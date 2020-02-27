package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array. \r");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        int min = findMin(array);
        System.out.println("Minimum element in the array is " + min);
    }


    public static int[] readIntegers(int count){
        int[] array = new int[count];
        System.out.println("Enter " + count + " values.");
        for(int i=0; i<count; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
