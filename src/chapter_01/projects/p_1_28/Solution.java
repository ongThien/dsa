package chapter_01.projects.p_1_28;

/*
A common punishment for school children is to write out a sentence multiple
times. Write a Java stand-alone program that will write out the following sen-
tence one hundred times: “I will never spam my friends again.” Your program
should number each of the sentences and it should make eight different random-
looking typos.
 */


// Note: I've not be able to solve this as I don't understand the requirement.
// What does it mean it should make eight different random-looking typos?
public class Solution {

    private static final String sentence = "I will never spam my friends again";

    public void writeOutASentence(int times) {
        for (int i = 1; i <= times; ++i) {
            System.out.println(i + ". " + sentence);
        }
    }
}
