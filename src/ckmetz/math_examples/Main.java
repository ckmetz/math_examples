package ckmetz.math_examples;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static MathExamples mathExamples = new MathExamples();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean iterate = true;

        do {
            System.out.println("Enter the function you'd like to perform, or type quit to exit");
            System.out.println("fibonacci, factorial, fizzbuzz");
            String function = sc.nextLine();

            switch (function.toLowerCase()) {
                case "fibonacci":
                    Main.fibonacciFraming(sc);
                    break;
                case "factorial":
                    Main.factorialFraming(sc);
                    break;
                case "fizzbuzz":
                    Main.fizzbuzzFraming(sc);
                    break;
                case "quit":
                    System.out.println("Quitting now thank you");
                    iterate = false;
                    break;
                default:
                    System.out.println("You entered a non matching option");

            }
        } while (iterate);
    }

    /**
     * @param Scanner sc
     */
    private static void fibonacciFraming(Scanner sc) {
        System.out.println("Enter a number to count up to in the Fibonacci Sequence");
        int ceiling = Integer.parseInt(sc.nextLine());
        System.out.println("Counting up to your number!");
        Main.mathExamples.fibonacci(ceiling);
    }

    /**
     * @param Scanner sc
     */
    private static void factorialFraming(Scanner sc) {
        System.out.println("Enter a number to get it's factorial");
        int factorial = Integer.parseInt(sc.nextLine());
        Main.mathExamples.factorial(factorial);
    }

    /**
     * @param Scanner sc
     */
    private static void fizzbuzzFraming(Scanner sc) {
        System.out.println("Enter a number to count to with FizzBuzz!");
        int target = Integer.parseInt(sc.nextLine());
        Main.mathExamples.fizzbuzz(target);
    }
}
