package com.raathi.learning;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * Unit test for MergeSort.
 */
public class MergeSortTest {  
    @Test
    void shouldSortArrayOfEvenLength() {
        int[] array = new int[]{4,2,5,3};
        int[] sortedArray = MergeSort.sort(array);
        System.out.println("Sorted Array: "+Arrays.toString(sortedArray));
        assertArrayEquals(new int[]{2,3,4,5}, sortedArray);
    }

    @Test
    void shouldSortArrayOfOddLength() {
        int[] array = new int[]{4,2,5};
        int[] sortedArray = MergeSort.sort(array);
        System.out.println("Sorted Array: "+Arrays.toString(sortedArray));
        assertArrayEquals(new int[]{2,4,5}, sortedArray);
    }

    @Test
    void shouldSortArrayOfZeroLength() {
        int[] array = new int[]{};
        int[] sortedArray = MergeSort.sort(array);
        System.out.println("Sorted Array: "+Arrays.toString(sortedArray));
        assertArrayEquals(new int[]{}, sortedArray);
    }
}
