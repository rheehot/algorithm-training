package leetcode.topInterViewQuestions.medium.treesAndGraphs;

import org.junit.Test;

import static leetcode.topInterViewQuestions.medium.treesAndGraphs.KthSmallestElementInABST.*;
import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-18 4:48 오후
 */
public class KthSmallestElementInABSTTest {
    @Test
    public void test() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(1);
        treeNode.right = new TreeNode(4);
        treeNode.left.right = new TreeNode(2);
        KthSmallestElementInABST.kthSmallest(treeNode, 1);
    }

    @Test
    public void test2() {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.left.left.left = new TreeNode(1);
        KthSmallestElementInABST.kthSmallest(treeNode, 3);
    }
}