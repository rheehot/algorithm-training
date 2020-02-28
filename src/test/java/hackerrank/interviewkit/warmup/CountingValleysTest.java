package hackerrank.interviewkit.warmup;

import hackerrank.interviewkit.warmup.CountingValleys;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountingValleysTest {

    @Test
    public void test() {
        //Given
        String upDown = "UDDDUDUU";
        int stepNumber = 8;

        //When
        int result = CountingValleys.countingValleys(stepNumber, upDown);

        //Then
        assertEquals(1, result);

    }

}