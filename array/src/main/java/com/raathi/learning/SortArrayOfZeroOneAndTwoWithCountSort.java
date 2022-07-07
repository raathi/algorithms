package com.raathi.learning;

import java.util.Arrays;

/*
 * Array consist of only 0's, 1's and 2's. 
 * Write an algorithm to sort  this array in O(n) time complexity 
 * and O(1) Space complexity. 
 * 
 * we have been using count sort for this problem.
 */
public class SortArrayOfZeroOneAndTwoWithCountSort {

    /*
     * For example [2, 1, 1 , 0, 1, 2, 1, 2, 0, 0, 0, 1 ]
     */
    public static int[] sort(int[] array){
        //System.out.println("Input:"+Arrays.toString(array));
        //find max
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if(number > max){
                max = number;
            }
        }

        //fill the array with count of numbers by index position
        // say for number 2 @ index 2 the count set as 3
        int[] countArray = new int[max+1];
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            countArray[number] = countArray[number]+1;
        }
        //System.out.println("Count:"+Arrays.toString(countArray));
        //do a cumulative sum of the count and update the count array
        int previousCount = 0;
        for(int i = 0; i < countArray.length; i++){
            countArray[i] = countArray[i]+previousCount;
            previousCount = countArray[i];
        }
        //System.out.println("Count[cumulative sum]:"+Arrays.toString(countArray));
        /* fill the output array with sorted values:
         * get the count for input array from count array
         * decrement the count and put the index of the result value of the decrement of the
         * also update the count with decremented value
        */
        int[] outputArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            int count = countArray[array[i]];
            count = count-1;
            outputArray[count] = array[i];
            countArray[array[i]] = count;
        }
        return outputArray;
    }
}
