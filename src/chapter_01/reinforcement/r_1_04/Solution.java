package chapter_01.reinforcement.r_1_04;

/*
Write a short Java method, isEven, that takes an int i and returns true if and only
if i is even. Your method cannot use the multiplication, modulus, or division
operators, however.
 */
public class Solution {

    public boolean isEven(int i) {
        if (i == 0) {
            return true;
        }

        boolean isEven = false;

        if (i < 0) {
            for (int tmp = -1; tmp > i; --tmp) {
                isEven = !isEven;
            }
        } else {
            for (int tmp = 1; tmp < i; ++tmp) {
                isEven = !isEven;
            }
        }

        return isEven;
    }
}
