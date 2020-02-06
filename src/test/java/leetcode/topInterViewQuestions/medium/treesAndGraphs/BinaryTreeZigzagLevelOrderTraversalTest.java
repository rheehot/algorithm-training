package leetcode.topInterViewQuestions.medium.treesAndGraphs;

import org.junit.Test;

import static leetcode.topInterViewQuestions.medium.treesAndGraphs.BinaryTreeZigzagLevelOrderTraversal.*;
import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-06 5:33 오후
 */
public class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    public void test() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);
        zigzagLevelOrder(treeNode);
    }
}