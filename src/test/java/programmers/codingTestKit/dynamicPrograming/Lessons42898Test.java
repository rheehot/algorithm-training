package test.java.programmers.codingTestKit.dynamicPrograming;

import main.java.programmers.codingTestKit.dynamicPrograming.Lessons42898;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lessons42898Test {

    @Test
    public void test() {
        int[][] puddles = {{2, 2}};
        assertEquals(4, Lessons42898.solution(4, 3, puddles));
    }
}