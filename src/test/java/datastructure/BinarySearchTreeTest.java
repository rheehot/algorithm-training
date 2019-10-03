package test.java.datastructure;

import main.java.Node;
import main.java.TreeUtil;
import main.java.datastructure.BinarySearchTree;
import main.java.datastructure.PreOrderTraversal;
import org.junit.Test;

import static org.junit.Assert.*;

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