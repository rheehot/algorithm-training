package main.java.datastructure;

import main.java.Node;

/**
 * 전위탐색 즉 root -> left -> right
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