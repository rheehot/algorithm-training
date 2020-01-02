package test.java.hackerrank.interviewkit.GreedyAlgorithms;

import main.java.hackerrank.interviewkit.GreedyAlgorithms.MinimumAbsoluteDifferenceInAnArray;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumAbsoluteDifferenceInAnArrayTest {
    @Test
    public void test() {
        //Given
        int[] arr = {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75};
        //int[] arr = {1, -3, 71, 68, 17};

        int expected = 1;

        //When
        int result = MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference(arr);

        //Then
        assertEquals(expected, result);
    }

}