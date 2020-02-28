package hackerrank.datastructure;

import hackerrank.Node;

/**
 * https://www.hackerrank.com/challenges/tree-inorder-traversal/problem?h_r=internal-search
 * [Tree: Inorder Traversal]
 * [EASY]
 *
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
