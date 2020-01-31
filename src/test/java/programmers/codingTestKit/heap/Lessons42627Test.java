package test.java.programmers.codingTestKit.heap;

import main.java.programmers.codingTestKit.heap.Lessons42627;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-01-30 3:14 오후
 */
public class Lessons42627Test {

    @Test
    public void test() {
        assertEquals(9, Lessons42627.solution(new int[][]{{1, 9}, {2, 6},{0, 3}}));
        assertEquals(6, Lessons42627.solution(new int[][]{{0, 5}, {1, 2}, {5, 5}}));
        assertEquals(3, Lessons42627.solution(new int[][]{{0, 3}, {4, 4}, {5, 3}, {4, 1}}));
        assertEquals(6, Lessons42627.solution(new int[][]{{0, 3}, {1, 9}, {500, 6}}));
        assertEquals(13, Lessons42627.solution(new int[][]{{0, 9}, {0, 4}, {0, 5}, {0, 7}, {0, 3}}));
        assertEquals(13, Lessons42627.solution(new int[][]{{1, 9}, {1, 4}, {1, 5}, {1, 7}, {1, 3}}));
    }
}