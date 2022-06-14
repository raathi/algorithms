package com.raathi.learning;

public class MaxValueInIncDecSortedArray {

    private MaxValueInIncDecSortedArray() {
    }

    // in a sorted aray or incrementing - decrementing array
    // finding a max value via binary search
    public static int findMaxValue(final int[] array) {
        return findMaxValue(array, 0, array.length-1);
    }

    private static int findMaxValue(final int[] array, final int start, final int end) {

        // array of lenght one
        if (start == end) {
            return array[start];
        }

        // two value arrays - final step in some cases
        if (end == (start + 1)) {
            if (array[start] >= array[end]) {
                return array[start];
            } else {
                return array[end];
            }
        }

        final int mid = (end - start) / 2 + start;
        int midValue = array[mid];

        // mid is max
        if (array[mid - 1] < midValue && array[mid + 1] < midValue) {
            return midValue;
        }

        // left has max
        if (array[mid - 1] > midValue && array[mid + 1] < midValue) {
            return findMaxValue(array, start, mid-1);
        } else {// right has max
            return findMaxValue(array, mid + 1, end);
        }
    }
}
