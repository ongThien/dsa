package chapter_01.projects.p_1_26;

/*
Write a short Java program that takes all the lines input to standard input and
writes them to standard output in reverse order. That is, each line is output in the
correct order, but the ordering of the lines is reversed.
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Deque<String> q = new ArrayDeque<>();

        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                q.push(sc.nextLine());
            }
        }

        while (!q.isEmpty()) {
            System.out.println(q.pop());
        }
    }

}
