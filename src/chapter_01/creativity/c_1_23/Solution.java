package chapter_01.creativity.c_1_23;

/*
Write a short Java program that takes two arrays a and b of length n storing int
values, and returns the dot product of a and b. That is, it returns an array c of
length n such that c[i] = a[i] · b[i], for i = 0, . . . , n − 1.
 */
public class Solution {

    public int[] dotProduct(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Invalid arguments - a & b must be the same size");
        }

        int[] c = new int[a.length];

        for (int i = 0; i < c.length; ++i) {
            c[i] = a[i] * b[i];
        }

        return c;
    }
}
