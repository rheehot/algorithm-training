package main.java.datastructure;

import main.java.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 주어진 아이템들을 하나씩 노드를 생성하면서 이진 트리를 만든다
 * 4, 2, 3, 1, 7, 6 의 순서로 아이템을 입력 하면
 * 아래 처럼 이진 트리로 만든다.
 *           4
 *      2        7
 *    1   3   6
 */
public class BinarySearchTree {

    /**
     * loop 버
     * @param root
     * @param data
     * @return
     */
    public static Node insert2(Node root, int data) {

        Node newNode = new Node(data);

        if (root == null) return newNode;

        Node node = root;

        while (node != null) {

            if (node.data > data && node.left != null) {
                node = node.left;
            } else if (node.data < data && node.right != null) {
                node = node.right;
            } else if (node.data > data) {
                node.left = newNode;
                break;
            } else {
                node.right = newNode;
                break;
            }
        }

        return root;

    }

    /**
     * 재귀함수 버
     * @param root
     * @param data
     * @return
     */
    public static Node insert(Node root, int data) {
        if (root == null) return new Node(data);

        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root;

    }
}
