package hackerrank.interviewkit.graph;

import hackerrank.interviewkit.graph.ConnectedCellInAGrid;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConnectedCellInAGridTest {

    @Test
    public void test() {

        int[][] inputs = new int[][]{{1, 1, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 1, 0},
                {1, 0, 0, 0}};
        assertEquals(5, ConnectedCellInAGrid.maxRegion(inputs));
    }
}