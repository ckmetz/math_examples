package ckmetz.math_examples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What function would you like to perform?");
        System.out.println("fibonacci, factorial, fizzbuzz");
        String function = sc.nextLine();

        switch (function) {
            case "fibonacci":
                Main.fibonacci(sc);
                break;
            case "factorial":
                Main.factorial(sc);
                break;
            case "fizzbuzz":
                Main.fizzbuzz(sc);
                break;
            default:
                System.out.println("You entered a non matching option");

        }
    }

    /**
     * @param Scanner sc
     */
    public static void fibonacci(Scanner sc) {
        int currentValue = 0;
        int previousValue = 0;

        System.out.println("Enter a number to count up to in the Fibonacci Sequence");
        int ceiling = sc.nextInt();
        System.out.println("Counting up to your number!");

        while (ceiling > currentValue) {
            System.out.println(currentValue);
            int swapValue = currentValue;

            currentValue = (currentValue == 0)
                    ? 1
                    : currentValue + previousValue;

            previousValue = swapValue;
        }
    }

    /**
     * @param Scanner sc
     */
    public static void factorial(Scanner sc) {
        System.out.println("Enter a number to get it's factorial");
        int factorial = sc.nextInt();
        int total = Main.factorialRecursion(factorial);
        System.out.println("Your total is: " + total);
    }

    /**
     *
     * @param int current
     * @return int
     */
    private static int factorialRecursion(int current) {
        if (current == 1) {
            return 1;
        }
        return current * Main.factorialRecursion(current-1);
    }

    /**
     * @param Scanner sc
     */
    public static void fizzbuzz(Scanner sc) {
        System.out.println("Enter a number to count to with FizzBuzz!");
        int target = sc.nextInt();

        for (int i = 1; target >= i; i++) {
            String result = "";
            if ((i % 3) == 0) {
                result += "fizz";
            }
            if ((i % 5) == 0) {
                result += "buzz";
            }

            result = (!result.equals(""))
                    ? result
                    : Integer.toString(i);

            System.out.println(result);
        }
    }
}
