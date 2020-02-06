package hackerrank.datastructure;

import hackerrank.Node;
import hackerrank.TreeUtil;
import org.junit.Test;

public class LevelOrderTraversalTest {

    @Test
    public void test() {
        //Given
        // 8 5 10 4 6 9 11
        int[] items = {8, 5, 10, 4, 6, 9, 11};
        Node root = TreeUtil.createTree(items);
        //When
        LevelOrderTraversal.levelOrder(root);
    }
}