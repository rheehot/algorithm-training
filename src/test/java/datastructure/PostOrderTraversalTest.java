package test.java.datastructure;

import main.java.Node;
import main.java.TreeUtil;
import main.java.datastructure.PostOrderTraversal;
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