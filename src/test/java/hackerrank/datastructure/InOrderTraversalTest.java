package test.java.hackerrank.datastructure;

import main.java.Node;
import main.java.TreeUtil;
import main.java.hackerrank.datastructure.InOrderTraversal;
import org.junit.Test;

public class InOrderTraversalTest {

    @Test
    public void test() {
        //Given
        int[] items = {1, 2, 5, 3, 6, 4};
        Node root = TreeUtil.createTree(items);

        //When
        InOrderTraversal.inOrder(root);
    }

}