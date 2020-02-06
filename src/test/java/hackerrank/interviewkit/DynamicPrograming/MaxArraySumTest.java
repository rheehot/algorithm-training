package hackerrank.interviewkit.DynamicPrograming;

import hackerrank.interviewkit.DynamincPrograming.MaxArraySum;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxArraySumTest {

    @Test
    public void test() {
        //Given & When  & Then
        assertEquals(13, MaxArraySum.maxSubsetSum(new int[]{3, 7, 4, 6, 5}));
        assertEquals(11, MaxArraySum.maxSubsetSum(new int[]{2, 1, 5, 8, 4}));
        assertEquals(15, MaxArraySum.maxSubsetSum(new int[]{3, 5, -7, 8, 10}));
    }
}