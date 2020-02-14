package basicAlgorithms.sorting;

import basicAlgorithms.sorting.CountingSort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CountingSortTest {

    @Test
    public void test() {
        int[] input = { 4, 3, 2, 5, 4, 3, 5, 1, 0, 2, 5 };
        int[] sort = CountingSort.sort(input);

        int[] sorted = CountingSort.sort(input);

        Arrays.stream(sorted).forEach(v -> System.out.println(v));

        Arrays.sort(input);
        assertArrayEquals(input, sorted);
    }

}