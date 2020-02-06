package hackerrank.interviewkit.StacksAndQueues;

import hackerrank.interviewkit.StacksAndQueues.CastleOnTheGrid;
import org.junit.Test;

import static org.junit.Assert.*;

public class CastleOnTheGridTest {

    @Test
    public void test() {

        String[] grid = {"...", ".X.", "..."};

        assertEquals(2, CastleOnTheGrid.minimumMoves(grid, 0, 0, 1, 2));
    }
}