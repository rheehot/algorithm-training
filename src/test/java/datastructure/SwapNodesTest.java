package test.java.datastructure;

import main.java.datastructure.SwapNodes;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwapNodesTest {

    @Test
    public void test() {
        //Given
        int[][] indexes = {{2, 3},
                {4, -1},
                {5, -1},
                {6, -1},
                {7, 8},
                {-1, 9},
                {-1, -1},
                {10, 11},
                {-1, -1},
                {-1, -1},
                {-1, -1}};
        int[] queries = {2, 4};

        int[][] expected = {{2, 9, 6, 4, 1, 3, 7, 5, 11, 8, 10}, {2, 6, 9, 4, 1, 3, 7, 5, 10, 8, 11}};

        //When
        int[][] swapNodes = SwapNodes.swapNodes(indexes, queries);

        //Then

        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], swapNodes[i]);
        }
    }

}