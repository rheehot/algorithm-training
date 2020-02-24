package leetcode.topInterViewQuestions.medium.backTracking;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-24 1:44 오후
 */
public class WordSearchTest {

    @Test
    public void test() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        assertEquals(true, WordSearch.exist(board, "ABCCED"));

    }

    @Test
    public void test1() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };


        assertEquals(true, WordSearch.exist(board, "SEE"));

    }

    @Test
    public void test2() {
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };

        assertEquals(false, WordSearch.exist(board, "ABCB"));
    }

    @Test
    public void test3() {
        char[][] board = {
                {'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a'},
        };

        assertEquals(false, WordSearch.exist(board, "aaaaaaaaaaab"));
    }


    @Test
    public void test4() {
        char[][] board = {
                {'C','A','A'},
                {'A','A','A'},
                {'B','C','D'},
        };

        assertEquals(true, WordSearch.exist(board, "AAB"));
    }
}