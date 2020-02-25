package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-25 5:02 오후
 */
public class SearchInRotatedSortedArrayTest {

    @Test
    public void test() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, SearchInRotatedSortedArray.search(nums, 0));
    }
}