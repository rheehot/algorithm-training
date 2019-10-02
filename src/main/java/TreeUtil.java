package main.java;

public class TreeUtil {
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
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
}
