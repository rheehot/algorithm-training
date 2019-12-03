package test.java.interviewkit.DynamicPrograming;

import main.java.interviewkit.DynamincPrograming.MaxArraySum;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxArraySumTest {

    @Test
    public void test() {
        //Given & When  & Then
        assertEquals(13, MaxArraySum.maxSubsetSum2(new int[]{3, 7, 4, 6, 5}));
        assertEquals(11, MaxArraySum.maxSubsetSum2(new int[]{2, 1, 5, 8, 4}));
        assertEquals(15, MaxArraySum.maxSubsetSum2(new int[]{3, 5, -7, 8, 10}));
    }

    @Test
    public void test2() {
        int result = MaxArraySum.maxSum(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

        System.out.printf("result = " + result);
        assertEquals(6, result);
    }
}