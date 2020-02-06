package programmers.codingTestKit.stackAndQueue;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by kimchanjung on 2020-01-21 3:01 오후
 */
public class Lessons42584Test {

    @Test
    public void test() {
        assertArrayEquals(new int[]{4, 3, 1, 1, 0}, Lessons42584.solution(new int[]{1, 2, 3, 2, 3}));
        assertArrayEquals(new int[]{1,1,3,2,1,0}, Lessons42584.solution(new int[]{5,4,3,5,6,5}));
        assertArrayEquals(new int[]{8, 7, 5, 3, 1, 1, 1, 1, 0}, Lessons42584.solution(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 3}));

    }
}