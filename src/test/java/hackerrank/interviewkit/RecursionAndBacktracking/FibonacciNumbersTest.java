package hackerrank.interviewkit.RecursionAndBacktracking;

import hackerrank.interviewkit.RecursionAndBacktracking.FibonacciNumbers;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumbersTest {

    @Test
    public void test() {
        System.out.println(FibonacciNumbers.fibonacci(5));

        assertEquals(5, FibonacciNumbers.fibonacci(5));
    }
}