package chapter_01.creativity.c_1_19;

/*
Write a Java program that can take a positive integer greater than 2 as input and
write out the number of times one must repeatedly divide this number by 2 before
getting a value less than 2.
 */
public class Solution {

    public int numsOfDivideTimes(int n) {

        if (n <= 2) {
            throw new IllegalArgumentException("the number must be positive and greater than 2");
        }

        int counter = 0;

        while (n > 2) {
            n /= 2;
            ++counter;
        }

        return counter;
    }
}
