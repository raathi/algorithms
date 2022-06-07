package com.raathi.learning;

import java.util.Arrays;

public class MergeSort {

    private MergeSort(){}

    public static int[] sort(int[] array) {
        divide(array, 0, array.length - 1);
        return array;
    }

    private static void divide(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        // calculate middle
        int middle = start + (end - start) / 2;
        // left part - divide further recursively
        divide(array, start, middle);
        // right part - divide further recursively
        divide(array, middle + 1, end);
        // merge
        merge(array, start, middle, end);
    }

    private static int[] merge(int[] array, int start, int middle, int end) {
        // fill left array
        int[] left = Arrays.copyOfRange(array, start, middle+1 /*exclusive*/);
        // fill right array
        int[] right = Arrays.copyOfRange(array, middle+1, end+1 /*exclusive*/);

        int i = 0;
        int j = 0;
        int index = start;
        // compare and fill main array
        while ((i < left.length
                && j < right.length)
                && index < array.length) {
            if (left[i] < right[j]) {
                array[index] = left[i];
                i++; 
            } else {
                array[index] = right[j];
                j++;
            }
            index++;
        }

        //copy leftover
        while(i < left.length){
            array[index] = left[i];
            i++;
        }
        while(j < right.length){
            array[index] = right[j];
            j++;
        }
        return array;
    }
}
