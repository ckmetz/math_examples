package ckmetz.math_examples;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathExamples mathExamples = new MathExamples();
        boolean iterate = true;

        do {
            System.out.println("Enter the function you'd like to perform, or type quit to exit");
            System.out.println("fibonacci, factorial, fizzbuzz");
            String function = sc.nextLine();

            switch (function.toLowerCase()) {
                case "fibonacci":
                    mathExamples.fibonacci();
                    break;
                case "factorial":
                    mathExamples.factorial();
                    break;
                case "fizzbuzz":
                    mathExamples.fizzbuzz();
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

}
