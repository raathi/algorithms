package com.raathi.learning;

/*
 * Array consist of only 0's, 1's and 2's. 
 * Write an algorithm to sort  this array in O(n) time complexity 
 * and O(1) Space complexity with only one traversal 
 * 
 * We solving this problem with only one traversal.
 */
public class SortArrayOfZeroOneAndTwoWithOneTraversal {

    private SortArrayOfZeroOneAndTwoWithOneTraversal(){}

    /*
     * For example [2, 1, 1 , 0, 1, 2, 1, 2, 0, 0, 0, 1 ]
     */
    public static int[] sort(int[] array){
        //only works for 3 unique number examples
        int low = 0;
        int mid = 0;
        int high = array.length - 1;
        while (mid <= high) {
            if(array[mid] == 2){
                swap(array, mid, high);
                high--;
            }else if(array[mid] == 0){
                swap(array, mid, low);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
        return array;
    }

    private static void swap(int[] array, int startIndex, int endIndex){
        int tempValue = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = tempValue;
    }
}
