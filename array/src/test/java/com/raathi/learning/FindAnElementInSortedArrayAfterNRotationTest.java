package com.raathi.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindAnElementInSortedArrayAfterNRotationTest {
    
    @Test
    void shouldFindAnElement_whenRotatedOnce_AndArrayIsEvenLengthed(){
        assertEquals(1, 
        FindAnElementInSortedArrayAfterNRotation.find(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 1}, 1));
    }

    @Test
    void shouldFindAnElement_whenRotatedOnce_AndArrayIsOddLengthed(){
        assertEquals(1, 
        FindAnElementInSortedArrayAfterNRotation.find(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 1}, 1));
    }

    @Test
    void shouldFindAnElement_whenRotatedNMinusOneTimes_AndArrayIsOddLengthed(){
        assertEquals(1, 
        FindAnElementInSortedArrayAfterNRotation.find(new int[]{9, 1, 2, 3, 4, 5, 6, 7, 8}, 1));
    }

    @Test
    void shouldFindFirstElement_whenRotatedNMinusOneTimes_AndArrayIsOddLengthed(){
        assertEquals(9, 
        FindAnElementInSortedArrayAfterNRotation.find(new int[]{9, 1, 2, 3, 4, 5, 6, 7, 8}, 9));
    }

    @Test
    void shouldFindFirstElement_whenRotatedNMinusOneTimes_AndArrayIsEvenLengthed(){
        assertEquals(10, 
        FindAnElementInSortedArrayAfterNRotation.find(new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 10));
    }

    @Test
    void shouldFindNonExistedElement_whenRotatedNMinusOneTimes_AndArrayIsEvenLengthed(){
        assertEquals(-1, 
        FindAnElementInSortedArrayAfterNRotation.find(new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 11));
    }

    @Test
    void shouldFindNonExistedElement_whenRotatedNMinusOneTimes_AndArrayIsOddLengthed(){
        assertEquals(-1, 
        FindAnElementInSortedArrayAfterNRotation.find(new int[]{9, 1, 2, 3, 4, 5, 6, 7, 8}, 11));
    }

    @Test
    void shouldFindElementInRightPart_whenRotatedNMinusOneTimes_AndArrayIsOddLengthed(){
        assertEquals(7, 
        FindAnElementInSortedArrayAfterNRotation.find(new int[]{9, 1, 2, 3, 4, 5, 6, 7, 8}, 7));
    }

    
}
