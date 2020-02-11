package hackerrank.datastructure;

import hackerrank.Node;
import hackerrank.TreeUtil;
import org.junit.Test;

public class PreOrderTraversalTest {

    @Test
    public void test() {
        //Given
        //int[] items = {1, 14, 3, 7, 4, 5, 15, 6, 13, 10, 11, 2, 12, 8, 9};
        int[] items = {10, 5, 4, 6, 15, 14, 16};
        Node root = TreeUtil.createTree(items);

        //When
        PreOrderTraversal.preOrder(root);
    }

}