package programmers.codingTestKit.stackAndQueue;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-01-17 2:23 오후
 */
public class Lessons42583Test {

    @Test
    public void test() {
        assertEquals(8, Lessons42583.solution(2, 10, new int[]{7, 4, 5, 6}));
        assertEquals(101, Lessons42583.solution(100, 100, new int[]{10}));
        assertEquals(110, Lessons42583.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }
}