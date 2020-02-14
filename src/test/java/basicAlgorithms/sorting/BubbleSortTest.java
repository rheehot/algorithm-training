package basicAlgorithms.sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-14 3:27 오후
 */
public class BubbleSortTest {
    @Test
    public void test() {
        int[] arr = {2, 3, 1, 4, 5, 8, 6, 7};
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}