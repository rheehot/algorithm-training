package test.java.interviewkit.graph;

import main.java.interviewkit.graph.FindTheNearestClone;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheNearestCloneTest {

    @Test
    public void test() {
        assertEquals(-1, FindTheNearestClone.findShortest(4, new int[]{1, 1, 4}, new int[]{2, 3, 2}, new long[]{1, 2, 3, 4}, 2));
        assertEquals(3, FindTheNearestClone.findShortest(5, new int[]{1, 1, 2, 3,}, new int[]{2, 3, 4, 5}, new long[]{1, 2, 3, 3, 2}, 2));
    }
}