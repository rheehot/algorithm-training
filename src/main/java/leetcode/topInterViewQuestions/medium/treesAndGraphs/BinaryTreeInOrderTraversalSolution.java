package main.java.leetcode.topInterViewQuestions.medium.treesAndGraphs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimchanjung on 2020-02-04 3:12 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/786/
 * [Binary Tree Inorder Traversal]
 *
 *
 */
public class BinaryTreeInOrderTraversalSolution {
    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
    }

    private static List<Integer> ret;

    public static List<Integer> inOrderTraversal(TreeNode root) {
        ret = new ArrayList<>();
        return recursive(root);
    }

    private static List<Integer>  recursive(TreeNode root) {
        if (root == null) return ret;

        recursive(root.left);
        ret.add(root.val);
        recursive(root.right);

        return ret;
    }
}
