package com.company;

public class Main {

    public static void main(String[] args) {
        //selection sort into increasing order
        int[] arr = {-4, 11, 7, -12, 6, 1};
        for (int i = 0; i < arr.length - 1; i++) //we are searching for the first element first by assigning that i = 0, then increases. i is the index of the element to be chosen
        {

            int indSmallest = 1; //executed n - 1 times
            for (int j = i + 1; j < arr.length; j++) //j equals to i because it is the value after the initial (first) elements is found; since i++, it now calculates the second element (1), thus j = 1. j = 1 because if the i is the first element (0) then you have to check the remaining elements
                if (arr[j] < arr[indSmallest]) //accessing the elements in the array
                    indSmallest = j;
                swap(arr, i, indSmallest);
        }
        for (int a : arr)
            System.out.print(a + " ");


    }
    static void swap (int[] array, int ind1, int ind2)
    {
        int tmp = array [ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;

    }
}
