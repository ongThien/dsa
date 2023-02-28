package chapter_01.reinforcement.r_1_03;

/*
Write a short Java method, isMultiple, that takes two long values, n and m, and
returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
 */

public class Solution {

    public boolean isMultiple(long n, long m) {
        if (n == m) {
            return true;
        }

        long remainder = n % m;

        return n != 0 && remainder == 0;
    }
}
