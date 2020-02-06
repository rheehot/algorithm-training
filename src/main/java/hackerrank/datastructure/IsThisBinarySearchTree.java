package hackerrank.datastructure;

import hackerrank.Node;

/**
 * LEVEL : MEDIUM
 * https://www.hackerrank.com/challenges/ctci-is-binary-search-tree
 *
 */
public class IsThisBinarySearchTree {

    static boolean check(Node node, int minValue, int maxValue) {
        if (node == null ) return true;

        if (node.data <= minValue || node.data >= maxValue) return false;

        return check(node.left, minValue, node.data ) && check(node.right, node.data, maxValue);
    }

    public static boolean checkBST(Node root) {
        return check(root, 0, 100000);
    }
}
