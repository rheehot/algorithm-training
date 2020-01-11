package test.java.programmers.codingTestKit.dfsbfs;

import main.java.programmers.codingTestKit.dfsbfs.Lessons43162;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lessons43162Test {

    @Test
    public void test() {
        System.out.println("{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}");
        assertEquals(1, Lessons43162.solution(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
    }
}