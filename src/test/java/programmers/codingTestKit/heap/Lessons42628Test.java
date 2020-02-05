package test.java.programmers.codingTestKit.heap;

import main.java.programmers.codingTestKit.heap.Lessons42628;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-02 3:01 오후
 */
public class Lessons42628Test {

    @Test
    public void test() {
        assertArrayEquals(new int[]{0, 0}, Lessons42628.solution(new String[]{"I 16", "D 1"}));
        assertArrayEquals(new int[]{7, 5}, Lessons42628.solution(new String[]{"I 7","I 5","I -5","D -1"}));
    }
}