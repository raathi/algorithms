package com.raathi.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxValueInIncDecSortedArrayTest {
   
    @Test
    public void shouldFindMaxValueInIncDecArrayOfOddLength(){
        int[] array = new int[]{1,2,3,4,1};
        assertEquals(4, MaxValueInIncDecSortedArray.findMaxValue(array));
    }

    @Test
    public void shouldFindMaxValueInIncDecArrayOfEvenLength(){
        int[] array = new int[]{1,2,3,4,5,3};
        assertEquals(5, MaxValueInIncDecSortedArray.findMaxValue(array));
    }

    @Test
    public void shouldFindMaxValueInIncArrayOfOddLength(){
        int[] array = new int[]{1,2,3,4,5};
        assertEquals(5, MaxValueInIncDecSortedArray.findMaxValue(array));
    }

    @Test
    public void shouldFindMaxValueInIncArrayOfEvenLength(){
        int[] array = new int[]{1,2,3,4};
        assertEquals(4, MaxValueInIncDecSortedArray.findMaxValue(array));
    }

    @Test
    public void shouldFindMaxValueInDecArrayOfOddLength(){
        int[] array = new int[]{5,4,3,2,1};
        assertEquals(5  , MaxValueInIncDecSortedArray.findMaxValue(array));
    }

    @Test
    public void shouldFindMaxValueInDecArrayOfEvenLength(){
        int[] array = new int[]{4,3,2,1};
        assertEquals(4, MaxValueInIncDecSortedArray.findMaxValue(array));
    }

    @Test
    public void shouldFindMaxValueInArrayOfLengthOne(){
        int[] array = new int[]{4};
        assertEquals(4, MaxValueInIncDecSortedArray.findMaxValue(array));
    }
}
