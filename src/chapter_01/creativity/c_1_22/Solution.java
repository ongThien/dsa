package chapter_01.creativity.c_1_22;

/*
Write a short Java program that outputs all possible strings formed by using the
characters 'c', 'a', 't', 'd', 'o', and 'g' exactly once.
 */

import java.util.HashSet;
import java.util.Set;

// we can solve this by using a permutation algorithm
// the size of the result set should be 6 x 5 x 4 x 3 x 2 x 1 = 720 (strings)
public class Solution {

    public Set<String> findAllPermutations(String s) {
        Set<String> perms = new HashSet<>();

        if (s == null) {
            return null;
        } else if (s.length() == 0) {
            perms.add("");
            return perms;
        }

        char initial = s.charAt(0); // first character
        String rem = s.substring(1); // Full string without first character

        Set<String> words = findAllPermutations(rem);
        System.out.println(words);
        for (String word : words) {
            for (int i = 0; i <= word.length(); ++i){
                perms.add(merge(word, initial, i));
            }
        }
        return perms;
    }

    private String merge(String s, char c, int idx) {
        String begin = s.substring(0, idx);
        String end = s.substring(idx);
        return begin + c + end;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.findAllPermutations("catdog"));
    }
}
