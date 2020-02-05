package test.java.hackerrank.datastructure;

import java.Node;
import java.TreeUtil;
import main.java.hackerrank.datastructure.InOrderTraversal;
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