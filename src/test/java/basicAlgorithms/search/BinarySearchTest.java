package basicAlgorithms.search;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-25 5:51 오후
 */
public class BinarySearchTest {

    @Test
    public void test() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinarySearch.binarySearch(arr, 2);
    }
}