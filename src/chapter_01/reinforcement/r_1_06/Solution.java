package chapter_01.reinforcement.r_1_06;

/*
Write a short Java method that takes an integer n and returns the sum of all the
odd positive integers less than or equal to n.
 */
public class Solution {

    public int sumAllOdds(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n == 1) {
            return n;
        }

        int sum = 0;

        for (int i = 1; i <= n ; ++i) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        return sum;
    }
}
