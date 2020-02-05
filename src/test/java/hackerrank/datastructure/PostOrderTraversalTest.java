package test.java.hackerrank.datastructure;

import java.Node;
import java.TreeUtil;
import main.java.hackerrank.datastructure.PostOrderTraversal;
import org.junit.Test;

public class PostOrderTraversalTest {
    @Test
    public void test() {
        //Given
        int[] items = {1, 2, 5, 3, 6, 4};
        Node root = TreeUtil.createTree(items);

        //When
        PostOrderTraversal.postOrder(root);
    }

}