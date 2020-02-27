package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = new int[] {1,2,3,4,5};
        System.out.println("Original array " + Arrays.toString(array));
	    reverse(array);
        System.out.println("Reverse array " + Arrays.toString(array));
    }

    public static void reverse(int[] array){
        int i=0, j=array.length-1;
        while(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
