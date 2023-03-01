package chapter_01.creativity.c_1_21;

import java.util.Arrays;
import java.util.Random;

/*
Write a Java method that takes an array containing the set of all integers in the
range 1 to 52 and shuffles it into random order. Your method should output each
possible order with equal probability.
 */

public class Solution {

    public void solution() {
        System.out.println(Arrays.toString(shuffleArr(createArr())));
    }

    // we can achieve the equal possibility by using Random class
    // with bound on the nextInt() method
    // or by using Collections.shuffle()
    private int[] shuffleArr(int[] arr) {
        Random rand = new Random();
        int[] tmpArr = arr.clone();
        int tmpIdx;
        int tmpVal;

        for (int i = 1; i < tmpArr.length; ++i) {
            tmpIdx = rand.nextInt(i);

            tmpVal = tmpArr[i];
            tmpArr[i] = tmpArr[tmpIdx];
            tmpArr[tmpIdx] = tmpVal;
        }

        return tmpArr;
    }

    private int[] createArr() {
        int[] arr = new int[52];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i + 1;
        }

        return arr;
    }
}
