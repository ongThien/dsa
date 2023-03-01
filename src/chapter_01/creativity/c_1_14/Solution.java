package chapter_01.creativity.c_1_14;

/*
-- Requirements:

        Write a pseudocode description of a method that reverses an array of n integers,
        so that the numbers are listed in the opposite order than they were before, and
        compare this method to an equivalent Java method for doing the same thing.
 */

public class Solution {

    /*
    There are a few ways to reverse an array in Java:
        - Using a temp array
        - Using swapping

        - Using a temp array:
        Inside the function, a new array (with the array size of the first array, arr)
        is initialized. The array arr[] is iterated from the first element, and each element of array arr[]
        is placed in the new array from the back, i.e., the new array is iterated from its last element.

        int[] reverse(int[] arr):
            int n = arr.length;
            int[] tmp = new int[n];
            int tmpIdx = n - 1;
            for (int i = 0; i < n; ++i) do:
                tmp[tmpIdx] = arr[i];
                --tmpIdx;

            return tmp;


        - Using swapping:
        The second method uses a similar code for the inputting and printing of the array. However, we don’t
        create a new array like the above method. Instead, we reverse the original array itself.
        In this method, we swap the elements of the array. The first element is swapped with the last element.
        The second element is swapped with the last but one element and so on. For instance, consider array
        [1, 2, 3, …., n-2, n-1, n]. We swap 1 with n, 2 with n-1, 3 with n-2 and further.

        void reverse(int[] arr):
            int n = arr.length;
            int tmp;
            for (int i = 0; i < n / 2; ++i) do:
                tmp = arr[i];
                arr[i] = arr[n - i - 1];
                arr[n - i - 1] = tmp;

     I don't think there is a native solution to reverse an array of primitives in Java
     (there are libraries for this e.g: Commons Lang and alike). However, if it was an array
     of objects, or reference types, there's a solution that is to use Collections.reverse().
     java.util.Collections.reverse() can reverse java.util.Lists and java.util.Arrays.asList()
     then returns a list that wraps the specific array you pass to it.
     */

    public void reverse(int[] arr) {
        int n = arr.length;
        int tmp;
        for (int i = 0; i < n / 2; ++i) {
            tmp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = tmp;
        }
    }
}
