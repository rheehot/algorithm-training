package leetcode.topInterViewQuestions.medium.treesAndGraphs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-21 3:16 오후
 */
public class NumberOfIslandsTest {

    @Test
    public void test() {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        assertEquals(1, NumberOfIslands.numIslands(grid));
    }


    @Test
    public void test2() {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        assertEquals(3, NumberOfIslands.numIslands(grid));
    }

    @Test
    public void test3() {
        char[][] grid = new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };

        assertEquals(1, NumberOfIslands.numIslands(grid));
    }
}