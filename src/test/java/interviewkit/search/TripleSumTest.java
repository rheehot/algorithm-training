package test.java.interviewkit.search;

import main.java.interviewkit.search.TripleSum;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripleSumTest {
    @Test
    public void test() {
        //Given
        int[] p = {1, 4, 5};
        int[] q = {2, 3,3};
        int[] r = {1, 2, 3};

        //When
        long result = TripleSum.triplets(p, q, r);

        //Then
        assertEquals(5, result);
    }
}