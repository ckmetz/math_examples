package ckmetz.math_examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

class MathExamplesTest {

    private MathExamples mathExamples;

    @BeforeEach
    public void setUp() throws Exception {
        mathExamples = new MathExamples();
    }

    @Test
    void fibonacci() {
        int ceiling = 10;
        ArrayList<Integer> testSequence = new ArrayList<Integer>(
                Arrays.asList(0, 1, 1, 2, 3, 5, 8)
        );
        ArrayList<Integer> sequence = mathExamples.fibonacci(ceiling);
        assertEquals(testSequence, sequence);
    }

    @Test
    void factorial() {
        int factorial = 5;
        int testTotal = 120;

        int total = mathExamples.factorial(factorial);
        assertEquals(testTotal, total);
    }

    @Test
    void fizzbuzz() {
        int target = 15;
        ArrayList<String> testSequence = getFizzBuzz();
        ArrayList<String> sequence = mathExamples.fizzbuzz(target);

        assertEquals(testSequence, sequence);
    }

    /**
     * @return ArrayList<String>
     */
    private ArrayList<String> getFizzBuzz() {
        return  new ArrayList<String>(
                        Arrays.asList(
                                "1",
                                "2",
                                "fizz",
                                "4",
                                "buzz",
                                "fizz",
                                "7",
                                "8",
                                "fizz",
                                "buzz",
                                "11",
                                "fizz",
                                "13",
                                "14",
                                "fizzbuzz"
                        )
                );
    }
}