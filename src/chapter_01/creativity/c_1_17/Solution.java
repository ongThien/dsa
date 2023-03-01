package chapter_01.creativity.c_1_17;

import java.util.Arrays;

/*
Write a short Java method that takes an array of int values and determines if there
is a pair of distinct elements of the array whose product is even.
 */
public class Solution {

    public boolean hasDistinctPairWithEvenProduct(int[] arr) {
        if (arr.length < 2) {
            return false;
        }

        if (arr.length == 2 && arr[0] != arr[1]) {
            int product = arr[0] * arr[1];
            return product % 2 == 0;
        }

        // we must find a pair of distinct element,
        // so lets create an array of unique element from the input
        int[] uniq = Arrays.stream(arr).distinct().toArray();

        // now we just have to loop through the uniq array to find a pair that has an even product
        int product;
        for (int i = 0; i < uniq.length - 1; ++i) {
            for (int j = i + 1; j < uniq.length; ++j) {
                product = uniq[i] * uniq[j];
                if (product % 2 == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
