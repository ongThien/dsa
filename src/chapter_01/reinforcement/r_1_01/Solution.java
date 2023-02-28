package chapter_01.reinforcement.r_1_01;



import java.io.IOException;
import java.util.Scanner;

/*
- Requirement:
Write a short Java method, inputAllBaseTypes, that inputs a different value of
each base type from the standard input device and prints it back to the standard
output device.

Java has the following base types:
- boolean
- byte
- char
- short
- int
- float
- long
- double
 */

public class Solution {

    public void inputAllBaseTypes() {
        try (Scanner sc = new Scanner(System.in)) {
            boolean bool;
            byte b;
            short sh;
            int i;
            float f;
            long l;
            double d;
            char ch = 0;

            promptInput("boolean (true or false)");
            while (!sc.hasNextBoolean()) {
                printErr("boolean");
                sc.next();
            }
            bool = sc.nextBoolean();

            promptInput("byte");
            while (!sc.hasNextByte()) {
                printErr("byte");
                sc.next();
            }
            b = sc.nextByte();

            promptInput("short");
            while (!sc.hasNextShort()) {
                printErr("short");
                sc.next();
            }
            sh = sc.nextShort();

            promptInput("int");
            while (!sc.hasNextInt()) {
                printErr("int");
                sc.next();
            }
            i = sc.nextInt();

            promptInput("float");
            while (!sc.hasNextFloat()) {
                printErr("float");
                sc.next();
            }
            f = sc.nextFloat();

            promptInput("long");
            while (!sc.hasNextLong()) {
                printErr("long");
                sc.next();
            }
            l = sc.nextLong();

            promptInput("double");
            while (!sc.hasNextDouble()) {
                printErr("double");
                sc.next();
            }
            d = sc.nextDouble();

            // The Scanner class is designed  for reading in whitespace-separated tokens.
            // It's a convenience class that wraps an underlying input stream. e.g: System.in
            // Before scanner all you could do was read in single bytes,
            // and that's a big pain if you want to read words or lines.
            // Reading a single character is a more basic operation.
            promptInput("char");
            try {
                ch = (char) System.in.read();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("--- All base types from the input were ---");
            System.out.printf("boolean: %s\n", bool);
            System.out.printf("byte: %d\n", b);
            System.out.printf("char: %c\n", ch);
            System.out.printf("short: %d\n", sh);
            System.out.printf("int: %d\n", i);
            System.out.printf("float: %f\n", f);
            System.out.printf("long: %d\n", l);
            System.out.printf("double: %f\n", d);
        }
    }

    private void promptInput(String type) {
        System.out.printf("Input a single %s value:\n", type);
    }

    private void printErr(String type) {
        System.out.printf("Please enter a valid %s value.\n", type);
    }
}
