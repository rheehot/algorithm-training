package basicAlgorithms.sorting;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-14 3:35 오후
 */
public class SelectionSortTest {
    @Test
    public void test() {
        int[] arr = {2, 3, 1, 4, 5, 8, 6, 7};
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}