package chapter_01.reinforcement.r_1_02;


/*
Suppose that we create an array A of GameEntry objects, which has an integer
scores field, and we clone A and store the result in an array B. If we then im-
mediately set A[4].score equal to 550, what is the score value of the GameEntry
object referenced by B[4]?
 */

/*
Answer:
clearly the value of b[4] is 550 as we're cloning an array of reference type,
when we call clone() on array a and assign it to b, we're actually cloning the
addresses of a's elements, hence when we reassign any element in a, the value is
reflected in b as well.
 */

import java.util.Arrays;
import java.util.Random;

public class Solution {

    public static void main(String[] args) {
        GameEntry[] a = new GameEntry[5];

        for (int i = 0; i < a.length; i++) {
            a[i] = new GameEntry(new Random().nextInt(50));
        }

        GameEntry[] b = a.clone();

        a[4].setScore(550);

        System.out.println(b[4].getScore());
        System.out.println(Arrays.toString(a));
    }
}

class GameEntry {
    int score;

    GameEntry(int score) {
        this.score = score;
    }

    int getScore() {
        return this.score;
    }

    void setScore(int score)  {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.valueOf(this.score);
    }
}