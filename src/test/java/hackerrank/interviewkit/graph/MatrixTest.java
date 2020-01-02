package test.java.hackerrank.interviewkit.graph;

import main.java.hackerrank.interviewkit.graph.Matrix;
import org.junit.Test;

public class MatrixTest {

    @Test
    public void test() {
        int[][] roads = {{2, 1, 8},
                {1, 0, 5},
                {2, 4, 5},
                {1, 3, 4}};
        int[] machines = {2, 4, 0};

//        int[][] roads = {{0, 1, 4},
//            {1, 2, 3},
//                {1, 3, 7},
//                    {0, 4, 2}};
//        int[] machines = {2, 3, 4};
        Matrix.minTime(roads, machines);

    }

}