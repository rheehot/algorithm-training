package programmers.codingTestKit.greedy;

import programmers.codingTestKit.greedy.Lessons42862;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-01-28 6:03 오후
 */
public class Lessons42862Test {

    @Test
    public void test() {
        assertEquals(5, Lessons42862.solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        assertEquals(4, Lessons42862.solution(5, new int[]{2, 4}, new int[]{3}));
        assertEquals(4, Lessons42862.solution(5, new int[]{1, 2}, new int[]{2, 3}));
        assertEquals(2, Lessons42862.solution(3, new int[]{1, 2}, new int[]{2, 3}));
        assertEquals(3, Lessons42862.solution(3, new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertEquals(2, Lessons42862.solution(3, new int[]{3}, new int[]{1}));
        assertEquals(6, Lessons42862.solution(7, new int[]{2, 3, 4}, new int[]{1, 2, 3, 6}));
        assertEquals(4, Lessons42862.solution(5, new int[]{2, 3, 4}, new int[]{3, 4, 5}));

    }
}