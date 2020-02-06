package hackerrank.interviewkit.DynamicPrograming;

import hackerrank.interviewkit.DynamincPrograming.Candies;
import org.junit.Test;

import static org.junit.Assert.*;

public class CandiesTest {

    @Test
    public void test() {
        //Given
        int[] inputs = {2, 4, 2, 6, 1, 7, 8, 9, 2, 1};

        //When
        long result = Candies.candies(inputs.length, inputs);

        //Then
        assertEquals(19, result);
    }

}