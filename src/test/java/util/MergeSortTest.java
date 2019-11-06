package test.java.util;

import main.java.util.MergeSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void test() {
        //Given
        int[] arr = {2, 1, 3, 5, 4};
        int[] expected = {1, 2, 3, 4, 5};
        //When
        MergeSort.sort(arr, 0, arr.length-1);

        Arrays.stream(arr).forEach(v -> System.out.printf(v+" "));

        //Then
        assertArrayEquals(expected, arr);
    }

}