package leetcode.topInterViewQuestions.medium.treesAndGraphs;

import com.sun.tools.classfile.ConstantPool;
import hackerrank.Node;

/**
 * Created by kimchanjung on 2020-02-18 4:47 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/790/
 * [Kth Smallest Element in a BST]
 */
public class KthSmallestElementInABST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static int count = 0;
    public static int ret = 0;

    public static int kthSmallest(TreeNode root, int k) {
        count = k;
        inOrder(root);
        return ret;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) return;

        inOrder(root.left);
        count--;

        if (count == 0) {
            ret = root.val;
            return;
        }

        inOrder(root.right);
    }
}
