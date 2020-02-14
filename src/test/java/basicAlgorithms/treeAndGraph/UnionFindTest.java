package basicAlgorithms.treeAndGraph;

import basicAlgorithms.treeAndGraph.UnionFind;
import org.junit.Test;

public class UnionFindTest {

    @Test
    public void test() {
        int[][] inputs = {{1, 2},
                {3, 4},
                {1, 3},
                {5, 7},
                {5, 6},
                {7, 4}};
        UnionFind.unionFind(inputs);
    }

}