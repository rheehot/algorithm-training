package hackerrank.interviewkit.StacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-03-02 4:28 오후
 */
public class CastleOnTheGrid2Test {

    @Test
    public void test() {

        String[] grid = {"...", ".X.", "..."};

        assertEquals(2, CastleOnTheGrid2.minimumMoves(grid, 0, 0, 1, 2));
    }
}