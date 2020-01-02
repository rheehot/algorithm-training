package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.DivisibleSumPairs;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisibleSumPairsTest {

    @Test
    public void test() {
        //Given
        int[] inputs = {1, 3, 2, 6, 1, 2};
        int divider = 3;
        System.out.println(4%3);
        //When
        int divisibleSumPairs = DivisibleSumPairs.divisibleSumPairs(6, 3, inputs);

        //Then
        assertEquals(5, divisibleSumPairs);
    }

}