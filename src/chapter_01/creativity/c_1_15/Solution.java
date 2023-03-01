package chapter_01.creativity.c_1_15;


/*
-- Requirements:

        Write a pseudocode description of a method for finding the smallest and largest
        numbers in an array of integers and compare that to a Java method that would do
        the same thing.
 */

public class Solution {

    /*
    -- Pseudocode --
    findMinAndMax(int[] arr):
        { initializing min and max value }
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; ++i) do:
            if (min > arr[i]) then
                min = arr[i]

            if (max < arr[i]) then
                max = arr[i]

        return [min, max];

     -- Note --
     I'd not do this in practice, I think it'd be better to create a specific method to find min value,
     and another method to find max value as a separation of concern instead of finding both min and max
     in one method.
     */

    public int[] findMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; ++i) {
            if (min > arr[i]) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return new int[] {min, max};
    }
}
