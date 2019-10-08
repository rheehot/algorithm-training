package main.java.datastructure;


import main.java.Node;

import java.util.LinkedList;
import java.util.Queue;

public class SelfBalancingTree {

    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }

        printInOrder(root.left);
        System.out.print(root.data+"("+root.setHeight()+") -> ");
        printInOrder(root.right);
    }

    public static void levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
           Node node = queue.poll();

            System.out.print(root.data+"("+root.height+") -> ");

            if (node.left != null) {
                queue.offer(node.left);
            }

            if (node.right != null) {
                queue.offer(node.right);
            }
        }

    }

    public static class Node {
        public Node left;
        public Node right;
        public int height;

        public int data;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;

        }

        public int setHeight() {
            return height = 1 + Math.max(getLeftHeight(), getRightHeight());
        }


        public int getLeftHeight() {
            return left == null ? -1 : left.height;
        }

        public int getRightHeight() {
            return right == null ? -1 : right.height;
        }

        public int getBalance() {
            return getLeftHeight() - getRightHeight();
        }
    }


    public static Node insert(Node root, int val) {

        if (root == null) {
            Node node = new Node(val);
            node.setHeight();
            return node;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }


        int balance = root.getBalance();
        System.out.println("root.data = " + root.data + ", leftHeight = " + root.getLeftHeight() + ", rightHeight = " + root.getRightHeight() + ", balance = " + root.getBalance());


        root.height = root.setHeight();
        return root;
    }

    public static Node rotateRight(Node root) {
        Node newRootNode = root.left;
        root.left = newRootNode.right;
        newRootNode.right = root;

        root.setHeight();
        newRootNode.setHeight();

        return newRootNode;
    }

    public static Node rotateLeft(Node root) {
        Node newRootNode = root.right;
        root.right = newRootNode.left;
        newRootNode.left = root;

        root.setHeight();
        newRootNode.setHeight();
        return newRootNode;
    }


}
