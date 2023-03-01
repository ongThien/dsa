package chapter_01.creativity.c_1_16;

import java.util.Scanner;

/*
Write a short program that takes as input three integers, a, b, and c, from the Java
console and determines if they can be used in a correct arithmetic formula (in the
given order), like “a + b = c,” “a = b − c,” or “a ∗ b = c.”
 */
public class Solution {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = getUserInput(sc, "A");
            int b = getUserInput(sc, "B");
            int c = getUserInput(sc, "C");

            boolean bool = correctSum(a, b, c) ||
                    correctSubtract(a, b, c) ||
                    correctMultiple(a, b, c);

            System.out.println("A = " + a + "\n" +
                    "B = " + b + "\n" +
                    "C = " + c);

            if (bool) {
                System.out.println("They can be used in a given formula");
            } else {
                System.out.println("They can not be used in a given formula");
            }
        }
    }

    private static boolean correctSum(int a, int b, int c) {
        return c == a + b;
    }

    private static boolean correctSubtract(int a, int b, int c) {
        return a == b - c;
    }

    private static boolean correctMultiple(int a, int b, int c) {
        return c == a * b;
    }

    private static int getUserInput(Scanner sc, String holder) {
        System.out.println("Input integer " + holder + ":");
        while (!sc.hasNextInt()) {
            System.out.println("Invalid value!");
            sc.next();
        }

        return sc.nextInt();
    }
}
