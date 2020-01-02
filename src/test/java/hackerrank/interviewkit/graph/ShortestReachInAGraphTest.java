package test.java.hackerrank.interviewkit.graph;

import main.java.hackerrank.interviewkit.graph.ShortestReachInAGraph;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestReachInAGraphTest {

    @Test
    public void test() {
        ShortestReachInAGraph.Graph graph = new ShortestReachInAGraph.Graph(4);
        graph.addEdge(1-1,2-1);
        graph.addEdge(1-1,3-1);
        assertArrayEquals(new int[]{0, 6, 6, -1}, graph.shortestReach(1-1));
    }

}