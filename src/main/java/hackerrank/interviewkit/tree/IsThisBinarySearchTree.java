package hackerrank.interviewkit.tree;

import hackerrank.Node;

/**
 * https://www.hackerrank.com/challenges/ctci-is-binary-search-tree
 * [Trees: Is This a Binary Search Tree?]
 * [MEDIUM]
 *
 * 이진 트리인지 판변 하는 문제
 */
public class IsThisBinarySearchTree {


    public static boolean checkBST(Node root) {
        return check(0, root, 100000);
    }

    private static boolean check(int minValue, Node node, int maxValue) {
        if (node == null) return true;

        if (node.data <= minValue || node.data >= maxValue) return false;

        return check(minValue, node.left, node.data) && check(node.data, node.right, maxValue);
    }
}
