package test.java.hackerrank.datastructure;

import main.java.Node;
import main.java.TreeUtil;
import main.java.datastructure.PreOrderTraversal;
import org.junit.Test;

public class PreOrderTraversalTest {

    @Test
    public void test() {
        //Given
        int[] items = {1, 14, 3, 7, 4, 5, 15, 6, 13, 10, 11, 2, 12, 8, 9};
        Node root = TreeUtil.createTree(items);

        //When
        PreOrderTraversal.preOrder(root);
    }

}