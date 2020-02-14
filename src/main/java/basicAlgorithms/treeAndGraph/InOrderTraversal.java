package basicAlgorithms.treeAndGraph;

import hackerrank.Node;

/**
 * 중위탐색 left -> root -> right
 *
 *   5
 * 4   6
 *
 *  4 -> 5 -> 6
 *
 */
public class InOrderTraversal {
    public static void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data+" -> ");
        inOrder(root.right);
    }
}
