package main.java.interviewkit.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairsTest {

    @Test
    public void test() {
        //Given
        int[] arr = {1, 5, 3, 4, 2};
        int k = 2;

        //When
        int result = Pairs.pairs(k, arr);

        //Then
        assertEquals(3, result);
    }
}