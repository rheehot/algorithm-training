package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-26 5:56 오후
 */
public class SearchA2DMatrixIITest {

    @Test
    public void test() {
        int[][] inputs = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        SearchA2DMatrixII.searchMatrix(inputs, 20);
    }


    @Test
    public void test2() {
        int[][] inputs = {{}};
        SearchA2DMatrixII.searchMatrix(inputs, 1);
    }

    @Test
    public void test3() {
        int[][] inputs = {};
        SearchA2DMatrixII.searchMatrix(inputs, 0);
    }
}