package ckmetz.math_examples;

import java.util.ArrayList;
import java.util.Scanner;

public class MathExamples {

    final private Scanner sc = new Scanner(System.in);

    /**
     * @param int ceiling
     * @return ArrayList<Integer>
     */
    public ArrayList<Integer> fibonacci(int ceiling) {
        int currentValue = 0;
        int previousValue = 0;
        ArrayList<Integer> sequence = new ArrayList<Integer>();

        while (ceiling > currentValue) {
            System.out.println(currentValue);
            sequence.add(currentValue);
            int swapValue = currentValue;

            currentValue = (currentValue == 0)
                    ? 1
                    : currentValue + previousValue;

            previousValue = swapValue;
        }

        return sequence;
    }

    /**
     * @param int factorial
     * @return int
     */
    public int factorial(int factorial) {
        int total = factorialRecursion(factorial);
        System.out.println("Your total is: " + total);
        return total;
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
        return current * MathExamples.factorialRecursion(current-1);
    }

    /**
     * @param int target
     * @return ArrayList<String>
     */
    public ArrayList<String> fizzbuzz(int target) {
        ArrayList<String> sequence = new ArrayList<String>();

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
            sequence.add(result);
        }
        return sequence;
    }
}
