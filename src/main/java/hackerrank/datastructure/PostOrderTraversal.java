package hackerrank.datastructure;

import hackerrank.Node;

/**
 * https://www.hackerrank.com/challenges/tree-preorder-traversal/
 * [Tree: Preorder Traversal]
 * [EASY]
 *
 * 후위 탐색은 left -> right -> root
 *
 *      1
 *        2
 *          5
 *        3   6
 *          4
 *
 *  4 -> 3 -> 6 -> 5 -> 2 -> 1
 */
public class PostOrderTraversal {
    public static void postOrder(Node root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
