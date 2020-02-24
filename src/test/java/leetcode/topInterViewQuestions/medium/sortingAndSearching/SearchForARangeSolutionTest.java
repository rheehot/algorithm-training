package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-24 5:02 오후
 */
public class SearchForARangeSolutionTest {

    @Test
    public void test() {
        SearchForARangeSolution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        SearchForARangeSolution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6);
    }
}