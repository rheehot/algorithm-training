package test.java.interviewkit.sorting;

import main.java.interviewkit.CountingInversions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CountingInversionsTest {
    @Test
    public void test() {
        //Given
        // int[] arr = {1, 1, 1, 2, 2};
        int[] arr = {2, 1, 3, 1, 2};

        //When
        long result = CountingInversions.countInversions(arr);
        Arrays.stream(arr).forEach(v -> System.out.printf(v+" "));
        //long result2 = CountingInversions.countInversions(arr2);
       // Arrays.stream(arr2).forEach(v -> System.out.printf(v+" "));

        //Then
        assertEquals(4, result);
       // assertEquals(4, result2);
    }
}