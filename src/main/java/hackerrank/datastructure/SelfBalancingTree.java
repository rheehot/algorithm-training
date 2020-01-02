package main.java.hackerrank.datastructure;


import java.util.LinkedList;
import java.util.Queue;

public class SelfBalancingTree {

    public static void printInOrder(Node root) {
        if (root == null) {
            return;
        }

        printInOrder(root.left);
        System.out.print(root.val + "(" + root.ht + ") -> ");
        printInOrder(root.right);
    }

    public static void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            System.out.print(node.val + "(" + node.ht + ") -> ");

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
        public int ht;

        public int val;

        public Node(int data) {
            this.val = data;
            left = null;
            right = null;

        }

    }


    private static int setHeight(Node node) {
        return node == null ? -1 : 1 + Math.max(height(node.left), height(node.right));
    }

    private static int height(Node node) {
        return node == null ? -1 : node.ht;
    }

    public static int getBalance(Node node) {
        return height(node.left) - height(node.right);
    }

    public static Node rotateRight(Node root) {

        Node newRootNode = root.left;
        root.left = newRootNode.right;
        newRootNode.right = root;

        root.ht = setHeight(root);
        newRootNode.ht = setHeight(newRootNode);

        return newRootNode;
    }

    public static Node rotateLeft(Node root) {

        Node newRootNode = root.right;
        root.right = newRootNode.left;
        newRootNode.left = root;

        root.ht = setHeight(root);
        newRootNode.ht = setHeight(newRootNode);

        return newRootNode;
    }


    public static Node insert(Node root, int val) {

        if (root == null) {
            Node node = new Node(val);

            node.ht = setHeight(node);
            return node;
        }

        if (root.val > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        /**
         * 문제에서 높이는 자식이 1개 깊이면 0 부터 시작, 없으면 -1
         * 트리에서 높이는 왼쪽이던 오른쪽이던 제일 많이 붙어 있는 쪽의 깊이 임 즉
         *
         *      6
         *    5      level  = 1
         *  2   4    level  = 2
         *    3      level  = 3
         *
         *  이렇게 있는 경우 6의 높이는 3이 됨
         */

        // root의 높이를 세팅한
        root.ht = setHeight(root);


        /**
         *
         *  balance는 왼쪽 높이 - 오른쪽 높이다.
         *
         *         3
         *     2
         *  1
         *  의 경우
         *
         *  3의 왼쪽의 2 높이는 0 (자식이 있는 경우 0부터), 오른쪽의 높이는 null  -1, 1 - -1 = 2 가 된다
         *  balance는 -1 , 0 , 1 범위에 있어야 정상임 범위를 초과 하면 절절히 rotation 시켜야함
         *  balance가 > 1 크면 왼쪽이 자식이 붙어 있는경우며 -1 보다 더 작으면 오른족에 자식이 붙어 있는 경우
         */

        int balance = getBalance(root);


        /**
         * 벨런스가 1 보다 큰경우 왼쪽자식이 더 많은 붙어 있는 경우 이며 , 왼쪽 자식 보다 입력 값이 작은 경우 다시 왼쪽에 붙어 있는 경우 이므로 오른쪽 로테이
         *
         *                   3 (높이 = 2)
         *       2 (높이 = 1)       null (높이 = -1)
         *
         *    1 (높이 = 0)
         *
         *
         *  3 bf = 1 - -1 = 2 됨으로 왼쪽에 자식이 더붙어서 불균형인 경우이다. 2보다 입력값이 작은경우 2의 왼쪽에 붙게 됨으로 오른쪽으로
         *
         *
         *      2
         *  1       3
         */
        if (balance > 1 && root.left.val > val) {
            root = rotateRight(root);
        }

        /**
         * 벨런스가 -1 보다 작은경우 오른쪽 자식이 더 많은 붙어 있는 경우
         *
         *      1
         *           2
         *               3
         * 왼쪽 -1, 오른쪽 1, -1 - 1 = -2 됨
         *
         */
        if (balance < -1 && root.right.val < val) {
            root = rotateLeft(root);
        }

        /**
         * 벨런스가 1 보다 크고 왼쪽 보다 입력 갚이 더 큰경
         *
         *     3
         *  1
         *     2
         *
         *  3의 왼쪽 노드 2를 왼쪽으로 이동
         *
         *
         *      3
         *    2
         *  1
         *
         *  그리고 3을 오늘쪽으로 이동
         *
         *    2
         *  1   3
         *
         */
        if (balance > 1 && root.left.val < val) {
            root.left = rotateLeft(root.left);
            root = rotateRight(root);
        }


        /**
         * 벨런스가 -1 보다 작고 오른쪽 이 입력 갚보다 더 큰경
         *
         *    3
         *       5
         *    4
         *
         *  3의 오른쪽 5를 오른쪽으로 이동
         *
         *  3
         *     4
         *        5
         *
         *  3을 왼쪽으로 이동
         *
         *     4
         *  3     5
         */
        if (balance < -1 && root.right.val > val) {
            root.right = rotateRight(root.right);
            root = rotateLeft(root);
        }


        return root;
    }


}
