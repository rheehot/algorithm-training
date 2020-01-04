package test.java.programmers.codingTestKit.dynamicPrograming;

import main.java.programmers.codingTestKit.dynamicPrograming.Lessons43105;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lessons43105Test {

    @Test
    public void test() {
        int[][] inputs = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        assertEquals(30, Lessons43105.solution(inputs));
    }
}