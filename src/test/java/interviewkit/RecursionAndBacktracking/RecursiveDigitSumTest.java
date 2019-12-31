package test.java.interviewkit.RecursionAndBacktracking;

import main.java.interviewkit.RecursionAndBacktracking.RecursiveDigitSum;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecursiveDigitSumTest {

    @Test
    public void test() {
        int i = RecursiveDigitSum.superDigit("148", 3);
        System.out.println(i);
        assertEquals(3, i);
    }
}