package com.raathi.learning;

/*
* rotation
*  [1|2|3|4|5|6|7|8|9|10] 
* --3-rotations--> [4|5|6|7|8|9|10|1|2|3] 
* --9-rotations--> [10|1|2|3|4|5|6|7|8|9]
*/
public class FindAnElementInSortedArrayAfterNRotation {

    private FindAnElementInSortedArrayAfterNRotation() {
    }

    public static int find(int[] array, int element) {
        return find(array, element, 0, array.length - 1);
    }

    // find middle
    // check if middle == element
    // if middle < start
    // search in left array
    // if middle > start
    // search in left array
    private static int find(int[] array, int element, int start, int end) {
        System.out.println("start = " + start + " end= " + end);
        // one element array
        if (start == end) {
            if (array[start] == element) {
                return array[start];
            }
            return -1;
        }

        int middle = (start + end) / 2;
        int middleValue = array[middle];

        if (element == middleValue) {
            return middleValue;
        }

        // check middle's location
        // middle is in left part

        if (array[start] <= middleValue) {
            if ((array[start] <= element && element < middleValue)) {
                return find(array, element, start, middle - 1);
            }
            return find(array, element, middle + 1, end);
        }
        if(array[middle] <= element && element < array[end]){
            return find(array, element, middle + 1, end);
        }
        return find(array, element, start, middle -1);
    }

}