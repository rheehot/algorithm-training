package test.java.hackerrank.algorithms;

import main.java.hackerrank.algorithms.BreakingTheRecord;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BreakingTheRecordTest {

    @Test
    public void test() {
        //Given
        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] expected = {4, 0};

        //When
        int[] results = BreakingTheRecord.breakingRecords(scores);

        //Then
        assertArrayEquals(expected, results);
    }

}