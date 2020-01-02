package test.java.hackerrank.interviewkit.miscellaneous;

import main.java.hackerrank.interviewkit.miscellaneous.FriendCircleQueries;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendCircleQueriesTest {

    @Test
    public void test() {
        int[][] inputs = {
                {6, 4},
                {5, 9},
                {8, 5},
                {4, 1},
                {1, 5},
                {7, 2},
                {4, 2},
                {7, 6}};


        assertArrayEquals(new int[]{2, 2, 3, 3, 6, 6, 8, 8}, FriendCircleQueries.maxCircle(inputs));
    }
}