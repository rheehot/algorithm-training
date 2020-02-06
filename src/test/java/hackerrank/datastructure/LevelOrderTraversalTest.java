package hackerrank.datastructure;

import hackerrank.Node;
import hackerrank.TreeUtil;
import org.junit.Test;

public class LevelOrderTraversalTest {

    @Test
    public void test() {
        //Given
        int[] items = {1, 2, 5, 3, 6, 4};
        Node root = TreeUtil.createTree(items);

        //When
        LevelOrderTraversal.levelOrder(root);

    }
}