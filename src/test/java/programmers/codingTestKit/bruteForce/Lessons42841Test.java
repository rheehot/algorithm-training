package test.java.programmers.codingTestKit.bruteForce;

import main.java.programmers.codingTestKit.bruteForce.Lessons42841;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-01-16 3:38 오후
 */
public class Lessons42841Test {

    @Test
    public void test() {
        assertEquals(2, Lessons42841.solution(new int[][]{{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}}));
    }
}