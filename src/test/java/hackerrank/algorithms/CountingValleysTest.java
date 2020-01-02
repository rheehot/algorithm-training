package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.CountingValleys;
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