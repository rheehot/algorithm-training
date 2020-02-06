package hackerrank.interviewkit.graph;

import hackerrank.interviewkit.graph.RoadsAndLibraries;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoadsAndLibrariesTest {

    @Test
    public void test() {

        int[][] cities = {{1, 3},
                {3, 4},
                {2, 4},
                {1, 2},
                {2, 3},
                {5, 6}};
       // assertEquals(12, RoadsAndLibraries.roadsAndLibraries(6, 2, 5, cities));

        int[][] cities2 =  {{1, 2},
            {1, 3},
                {1, 4}};


        assertEquals(15, RoadsAndLibraries.roadsAndLibraries(5, 6, 1, cities2));
    }

}