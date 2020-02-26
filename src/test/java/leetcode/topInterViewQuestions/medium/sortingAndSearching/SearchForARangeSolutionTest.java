package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import org.junit.Test;

/**
 * Created by kimchanjung on 2020-02-24 5:02 오후
 */
public class SearchForARangeSolutionTest {

    @Test
    public void test() {
        SearchForARange.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        SearchForARange.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
        SearchForARange.searchRange(new int[]{1}, 1);
        SearchForARange.searchRange(new int[]{3,3,3}, 3);
    }
}