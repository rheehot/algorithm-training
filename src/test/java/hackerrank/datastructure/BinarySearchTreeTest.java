package hackerrank.datastructure;

import hackerrank.Node;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void test() {
        //Given
        int[] items = {4, 2, 3, 1, 7,6};
        Node root = null;

        //When
        for (int item: items) {
            root = BinarySearchTree.insert(root, item);
        }

    }

}