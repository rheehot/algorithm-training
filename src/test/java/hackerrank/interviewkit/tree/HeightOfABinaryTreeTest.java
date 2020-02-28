package hackerrank.interviewkit.tree;

import hackerrank.Node;
import hackerrank.TreeUtil;
import hackerrank.interviewkit.tree.HeightOfABinaryTree;
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