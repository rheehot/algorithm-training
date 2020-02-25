package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-25 2:55 오후
 */
public class MergeIntervalsTest {

    @Test
    public void test() {
        int[][] inputs = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        MergeIntervals.merge(inputs);
    }

    @Test
    public void test2() {
        int[][] inputs = {{1, 4}, {4, 5}};
        MergeIntervals.merge(inputs);
    }

    @Test
    public void test3() {
        int[][] inputs = {{1, 4}, {0, 1}};
        MergeIntervals.merge(inputs);
    }

    @Test
    public void test4() {
        int[][] inputs = {{1, 4}, {0, 0}};
        MergeIntervals.merge(inputs);
    }

    @Test
    public void test5() {
        int[][] inputs = {{1, 4}, {1, 4}};
        MergeIntervals.merge(inputs);
    }

    @Test
    public void test6() {
        int[][] inputs = {{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}};
        MergeIntervals.merge(inputs);
    }

    @Test
    public void test7() {
        int[][] inputs = {{1, 4}, {0, 2}, {3, 5}};
        MergeIntervals.merge(inputs);
    }
}