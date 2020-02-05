package main.java.hackerrank.datastructure;

import java.Node;

/**
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
