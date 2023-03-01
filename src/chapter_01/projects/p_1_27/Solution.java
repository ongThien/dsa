package chapter_01.projects.p_1_27;

/*
Write a Java program that can simulate a simple calculator, using the Java console
as the exclusive input and output device. That is, each input to the calculator, be
it a number, like 12.34 or 1034, or an operator, like + or =, can be done on a
separate line. After each such input, you should output to the Java console what
would be displayed on your calculator.
 */

import java.util.Scanner;

public class Solution {

    private static final String LONG = "1";
    private static final String DOUBLE = "2";
    private static final String EXIT = "0";

    public static void main(String[] args) {

        System.out.println("---- Java simple calculator ----");

        try (Scanner sc = new Scanner(System.in)) {
            String mode;
            while (true) {
                printMenu();
                mode = sc.nextLine();

                if (EXIT.equals(mode)) {
                    System.out.println("Goodbye!");
                    return;
                }

                Calculator calculator = new Calculator();

                if (LONG.equals(mode)) {
                    long firstNumber, secondNumber;
                    String operator;
                    try {
                        System.out.println("Enter first number:");
                        firstNumber = Long.parseLong(sc.nextLine());

                        System.out.println("Enter second number:");
                        secondNumber = Long.parseLong(sc.nextLine());

                        operator = getOperator(sc);

                        long res = 0;
                        switch (operator) {
                            case "+":
                                res = calculator.add(firstNumber, secondNumber);
                                break;
                            case "-":
                                res = calculator.subtract(firstNumber, secondNumber);
                                break;
                            case "*":
                                res = calculator.multiply(firstNumber, secondNumber);
                                break;
                            case "/":
                                res = calculator.divide(firstNumber, secondNumber);
                                break;
                            default:
                        }

                        System.out.printf("%d %s %d = %d\n\n", firstNumber, operator, secondNumber, res);

                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid number... Try again.");
                    }
                } else if (DOUBLE.equals(mode)) {
                    double firstNumber, secondNumber;
                    String operator;
                    try {
                        System.out.println("Enter first number:");
                        firstNumber = Double.parseDouble(sc.nextLine());

                        System.out.println("Enter second number:");
                        secondNumber = Double.parseDouble(sc.nextLine());

                        operator = getOperator(sc);

                        double res = 0;
                        switch (operator) {
                            case "+":
                                res = calculator.add(firstNumber, secondNumber);
                                break;
                            case "-":
                                res = calculator.subtract(firstNumber, secondNumber);
                                break;
                            case "*":
                                res = calculator.multiply(firstNumber, secondNumber);
                                break;
                            case "/":
                                res = calculator.divide(firstNumber, secondNumber);
                                break;
                            default:
                        }

                        System.out.printf("%f %s %f = %f\n\n", firstNumber, operator, secondNumber, res);

                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid number... Try again.");
                    }
                } else {
                    System.out.println("Invalid mode! Try again.");
                }
            }
        }
    }

    private static void printMenu() {
        String menu = "Select mode:\n" +"1. Long number\n" + "2. Double number\n" + "0. Exit\n";

        System.out.println(menu);
    }

    private static String getOperator(Scanner sc) {
        System.out.println("Enter an operator (+, -, *, /):");
        String operator;
        while (true) {
            operator = sc.nextLine();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                break;
            }

            System.out.println("Invalid operator");
        }

        return operator;
    }
}

class Calculator {

    long add(long firstNum, long seconNum) {
        return firstNum + seconNum;
    }

    long subtract(long firstNum, long seconNum) {
        return firstNum - seconNum;
    }

    long multiply(long firstNum, long seconNum) {
        return firstNum * seconNum;
    }

    long divide(long firstNum, long seconNum) {
        return firstNum / seconNum;
    }

    double add(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    double subtract(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    double multiply(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    double divide(double firstNum, double secondNum) {
        return firstNum / secondNum;
    }
}
