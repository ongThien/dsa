package chapter_01.reinforcement.r_1_05;

/*
Write a short Java method that takes an integer n and returns the sum of all
positive integers less than or equal to n.
 */

public class Solution {

    public int sumAll(int n) {
        if (n <= 0) {
            return 0;
        }

        int sum = 0;

        for (int i = 1; i <= n; ++i) {
            sum += i;
        }

        return sum;
    }
}
