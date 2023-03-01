package chapter_01.creativity.c_1_18;

import java.util.Arrays;

/*
Find p-norm of a vector.
Give an implementation of a method named norm such that norm(v, p) returns
the p-norm value of v and norm(v) returns the Euclidean norm of v, where v
is represented as an array of coordinates.
 */
public class Solution {

    /*
    Steps to calculate P-norms:
    -- Get the absolute value of each element of the vector.
    -- Raise these absolute values to a power p.
    -- Calculate the sum of all these raised absolute values.
    -- Get the pₜₕ root or raise the power to 1/p on the result of the previous step.
     */

    public int norm(double[] v, int p) {
        double[] tmp = v.clone();

        double sum = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] < 0) {
                tmp[i] *= -1;
            }

            tmp[i] = Math.pow(tmp[i], p);
            sum += tmp[i];
        }

        return (int) Math.pow(sum, (1 / (double) p));
    }

    public int norm(double[] v) {
        return norm(v, 2);
    }
}
