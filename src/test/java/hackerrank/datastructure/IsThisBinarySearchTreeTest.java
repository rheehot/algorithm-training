package test.java.hackerrank.datastructure;

import java.Node;
import main.java.hackerrank.datastructure.IsThisBinarySearchTree;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class IsThisBinarySearchTreeTest {

    @Test
    public void test() {
        //Given
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(7);
        root.right.left = new Node(9);

        //When
        boolean isBST = IsThisBinarySearchTree.checkBST(root);

        //Then
        assertThat(false, is(isBST));


    }

}