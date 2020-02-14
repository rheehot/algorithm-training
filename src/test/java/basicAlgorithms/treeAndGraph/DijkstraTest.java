package basicAlgorithms.treeAndGraph;

import basicAlgorithms.treeAndGraph.Dijkstra;
import org.junit.Test;

public class DijkstraTest {
    @Test
    public void test() {
        int[][] nodes = {{0, 2, 5, 1, 100000, 100000},
                {2, 0, 3, 2, 100000, 100000},
                {5, 3, 0, 3, 1, 5},
                {1, 2, 3, 0, 1, 100000},
                {100000, 100000, 1, 1, 0, 2},
                {100000, 100000, 5, 100000, 2, 0}};
        Dijkstra.shortPath(nodes, 0, 5);
    }

}