package basicAlgorithms.treeAndGraph;

import basicAlgorithms.treeAndGraph.DFS;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DFSTest {

    @Test
    public void test() {


        List<Integer>[] nodes = new ArrayList[8];

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new ArrayList<>();
        }

        nodes[1].add(2);
        nodes[1].add(3);
        nodes[2].add(1);
        nodes[2].add(3);
        nodes[2].add(4);
        nodes[2].add(5);
        nodes[3].add(1);
        nodes[3].add(2);
        nodes[3].add(6);
        nodes[3].add(7);
        nodes[4].add(2);
        nodes[4].add(5);
        nodes[5].add(2);
        nodes[5].add(4);
        nodes[6].add(3);
        nodes[6].add(7);
        nodes[7].add(3);
        nodes[7].add(6);

        // Assert.assertArrayEquals(new int[]{1, 2, 3, 6, 7, 4, 5}, DFS.search(nodes, 1));
        Assert.assertArrayEquals(new int[]{1, 2, 3, 6, 7, 4, 5}, DFS.searchByStack(nodes, 1));
    }

    @Test
    public void test2() {

        List<Integer>[] nodes = new ArrayList[10];

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new ArrayList<>();
        }

        nodes[1].add(2);
        nodes[1].add(3);

        nodes[2].add(1);
        nodes[2].add(3);
        nodes[2].add(4);
        nodes[2].add(5);

        nodes[3].add(1);
        nodes[3].add(2);
        nodes[3].add(6);
        nodes[3].add(7);

        nodes[4].add(2);
        nodes[4].add(8);

        nodes[5].add(2);
        nodes[5].add(9);

        nodes[6].add(3);

        nodes[7].add(3);

        nodes[8].add(4);

        nodes[9].add(5);


        Assert.assertArrayEquals(new int[]{1, 2, 3, 6, 7, 4, 8, 5, 9}, DFS.search(nodes, 1));
        System.out.println("--");
        Assert.assertArrayEquals(new int[]{1, 2, 3, 6, 7, 4, 8, 5, 9}, DFS.searchByStack(nodes, 1));


    }
}