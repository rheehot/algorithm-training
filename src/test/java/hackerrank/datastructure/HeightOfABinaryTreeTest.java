package test.java.hackerrank.datastructure;

import main.java.Node;
import main.java.TreeUtil;
import main.java.hackerrank.datastructure.HeightOfABinaryTree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeightOfABinaryTreeTest {

    @Test
    public void test() {
        //Given
        int[] items = {3, 5, 2, 1, 4, 6, 7};
        Node root = TreeUtil.createTree(items);

        //When
        int height = HeightOfABinaryTree.height(root);

        System.out.println(height);
        assertEquals(3 , height);


    }


}