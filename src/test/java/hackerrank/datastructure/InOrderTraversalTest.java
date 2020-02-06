package hackerrank.datastructure;

import hackerrank.Node;
import hackerrank.TreeUtil;
import org.junit.Test;

public class InOrderTraversalTest {

    @Test
    public void test() {
        //Given
        int[] items = {5,4,6};
        Node root = TreeUtil.createTree(items);

        //When
        InOrderTraversal.inOrder(root);
    }

}