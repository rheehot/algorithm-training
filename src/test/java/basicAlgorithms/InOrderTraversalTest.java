package basicAlgorithms;

import hackerrank.Node;
import hackerrank.TreeUtil;
import hackerrank.datastructure.InOrderTraversal;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-06 5:42 오후
 */
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