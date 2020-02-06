package basicAlgorithms;


import basicAlgorithms.BFS;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class BFSTest {

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

        assertArrayEquals(new int[]{1,2,3,4,5,6,7}, BFS.search(nodes, 1));

    }

}