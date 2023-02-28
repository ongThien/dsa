package chapter_01.reinforcement.r_1_07;

/*
Write a short Java method that takes an integer n and returns the sum of the
squares of all positive integers less than or equal to n.
 */

public class Solution {

    public int sumSqrt(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return n;
        }

        int sum = 0;

        for (int i = 1; i <= n; ++i) {
            sum += Math.sqrt(i);
        }

        return sum;
    }
}
