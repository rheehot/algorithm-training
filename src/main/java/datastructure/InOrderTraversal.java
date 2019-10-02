package main.java.datastructure;

import main.java.Node;

/**
 * 중위탐색 left -> root -> right
 *
 *      1
 *        2
 *          5
 *        3   6
 *          4
 *
 *  1 -> 2 -> 3 -> 4-> 5 -> 6
 *
 */
public class InOrderTraversal {
    public static void inOrder(Node root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
}
