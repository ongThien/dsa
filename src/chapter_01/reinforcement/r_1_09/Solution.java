package chapter_01.reinforcement.r_1_09;

/*
Write a short Java method that uses a StringBuilder instance to remove all the
punctuation from a string s storing a sentence, for example, transforming the
string "Let’s try, Mike!" to "Lets try Mike".
 */
public class Solution {

    public String removePunctuation(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = sb.length() - 1; i >= 0; --i) {
            if (sb.charAt(i) == '!'
                    || sb.charAt(i) == '?'
                    || sb.charAt(i) == ','
                    || sb.charAt(i) == '.'
                    || sb.charAt(i) == '\'' ) {
                sb.deleteCharAt(i);
            }
        }

        return sb.toString();
    }
}
