package chapter_01.creativity.c_1_20;

import java.util.Arrays;

/*
Write a Java method that takes an array of float values and determines if all the
numbers are different from each other (that is, they are distinct).
 */
public class Solution {

    public boolean isDistinct(float[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
