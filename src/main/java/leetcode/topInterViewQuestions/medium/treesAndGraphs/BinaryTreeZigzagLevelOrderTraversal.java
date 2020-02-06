package leetcode.topInterViewQuestions.medium.treesAndGraphs;

import hackerrank.Node;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-02-06 5:32 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/787/
 * [Binary Tree Zigzag Level Order Traversal]
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        LinkedList<Integer> item = new LinkedList<>();
        Queue<List<Object>> queue = new LinkedList();
        queue.offer(Arrays.asList(root, 1));

        while (!queue.isEmpty() && root != null) {
            List<Object> poll = queue.poll();
            TreeNode node = (TreeNode) poll.get(0);
            Integer level = (Integer) poll.get(1);

            if (node.left != null) queue.offer(Arrays.asList(node.left, level+1));
            if (node.right != null) queue.offer(Arrays.asList(node.right, level+1));

            // Added part of the level order traversal base code
            if (ret.size() != level) {
                item = new LinkedList<>();
                ret.add(item);
            }

            if (level % 2 == 1) {
                item.add(node.val);
            } else {
                item.addFirst(node.val);
            }
        }

        return ret;
    }
}
