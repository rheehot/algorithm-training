package hackerrank;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtil {
    public static Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;

    }

    public static Node createTree(int[] items) {
        Node root = null;

        for (int i = 0; i < items.length; i++) {
            root = insert(root, items[i]);
        }

        return root;
    }

    public static String getData(Node root) {
        return root != null ? String.valueOf(root.data) : "";
    }

    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }

        printInOrder(root.left);
        System.out.print(root.data + "(" + getHeight(root) + ") -> ");
        printInOrder(root.right);
    }

    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            System.out.print(root.data + "(" + getHeight(root) + ") -> ");

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

    }

    private static String getHeight(Node root) {
        return root == null ? "-1" : String.valueOf(root.height);
    }
}
