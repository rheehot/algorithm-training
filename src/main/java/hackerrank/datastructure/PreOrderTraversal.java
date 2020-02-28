package hackerrank.datastructure;

import hackerrank.Node;

/**
 * https://www.hackerrank.com/challenges/tree-preorder-traversal/
 * [Tree: Preorder Traversal]
 * [EASY]
 *
 * 전위탐색 즉 root -> left(-> left 자식이 없을때 까지) -> right
 *      1
 *        2
 *          5
 *        3   6
 *      4
 *
 *  1 -> 2 -> 5 -> 3 -> 4 -> 6
 */
public class PreOrderTraversal {
    public static void preOrder(Node root) {

        if (root == null ) return;

        System.out.println(root.data);

        preOrder(root.left);
        preOrder(root.right);
    }

}
