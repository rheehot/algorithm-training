package test.java.hackerrank.interviewkit.arrays;

import main.java.hackerrank.interviewkit.arrays.MinimumSwaps2;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumSwaps2Test {

    @Test
    public void test() {
        //Given
        //int[] inputs = {2, 3, 4, 1, 5};
        int[] inputs = {4, 3, 1, 2};

        //When
        int result = MinimumSwaps2.minimumSwaps(inputs);

        //Then
        assertEquals(3, result);
    }

}