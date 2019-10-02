package test.java.datastructure;

import main.java.Node;
import main.java.TreeUtil;
import main.java.datastructure.LevelOrderTraversal;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

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