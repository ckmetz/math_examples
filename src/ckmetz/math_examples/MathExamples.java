package ckmetz.math_examples;

import java.util.Scanner;

public class MathExamples {

    private Scanner sc = new Scanner(System.in);

    public void fibonacci() {
        int currentValue = 0;
        int previousValue = 0;

        System.out.println("Enter a number to count up to in the Fibonacci Sequence");
        int ceiling =  Integer.parseInt(this.sc.nextLine());
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
    public void factorial() {
        System.out.println("Enter a number to get it's factorial");
        int factorial = Integer.parseInt(this.sc.nextLine());
        int total = MathExamples.factorialRecursion(factorial);
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
        return current * MathExamples.factorialRecursion(current-1);
    }

    public void fizzbuzz() {
        System.out.println("Enter a number to count to with FizzBuzz!");
        int target = Integer.parseInt(this.sc.nextLine());

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
