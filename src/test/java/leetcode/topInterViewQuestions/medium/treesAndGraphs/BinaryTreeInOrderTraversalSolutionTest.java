package leetcode.topInterViewQuestions.medium.treesAndGraphs;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static leetcode.topInterViewQuestions.medium.treesAndGraphs.BinaryTreeInOrderTraversalSolution.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by kimchanjung on 2020-02-04 3:14 오후
 */
public class BinaryTreeInOrderTraversalSolutionTest {

    @Test
    public void test() {
        TreeNode treeNode = new TreeNode(1);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(3);
        List<Integer> integers = inOrderTraversal(treeNode);
        System.out.println(integers);
        assertEquals(Arrays.asList(1, 3, 2), integers);
    }
}