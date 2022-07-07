package com.raathi.learning;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SortArrayOfZeroOneAndTwoWithCountSortTest {

    @ParameterizedTest
    @MethodSource("inputProvider")
    void shouldSortArray_ForInput(int[] input, int[] output) {
        int[] sortedArray = SortArrayOfZeroOneAndTwoWithCountSort.sort(input);
        System.out.println("Array:"+Arrays.toString(sortedArray));
        assertArrayEquals(output,sortedArray);
    }

    private static Stream<Arguments> inputProvider() {
        return Stream.of(
                Arguments.of(new int[] { 1, 2, 0 }, 
                    new int[] { 0, 1, 2 }),
                Arguments.of(new int[] { 0, 2, 1, 2, 1, 0, 0 }, 
                    new int[] { 0, 0, 0, 1, 1, 2, 2 }),
                Arguments.of(new int[] { 2, 1 }, 
                    new int[] { 1, 2 }),
                Arguments.of(new int[] { 1, 2, 2, 2, 2, 2, 0, 0, 0, 0, 1, 1, 1, 1 },
                    new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}),
                Arguments.of(new int[] { 2, 1, 1 , 0, 1, 2, 1, 2, 0, 0, 0, 1 },
                    new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2})
            );
    }
}
