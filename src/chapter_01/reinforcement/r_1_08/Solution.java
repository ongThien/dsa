package chapter_01.reinforcement.r_1_08;

/*
Write a short Java method that counts the number of vowels in a given character
string.
 */
public class Solution {

    public int countVowels(String s) {
        return (int) s.chars()
                .filter(ch -> "aeiou".contains((char) ch + ""))
                .count();
    }
}
