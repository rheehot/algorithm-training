package basicAlgorithms;

import hackerrank.Node;
import hackerrank.TreeUtil;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-06 5:44 오후
 */
public class LevelOrderTraversalTest {

    @Test
    public void test() {
        // 8 5 10 4 6 9 11
        int[] items = {8, 5, 10, 4, 6, 9, 11};
        Node root = TreeUtil.createTree(items);
        LevelOrderTraversal.levelOrder(root);
    }
}