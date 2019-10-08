package main.java;

public class Node {
    public Node left;
    public Node right;
    public int level; // 해당 노드의 깊이 레벨 즉 root 3 = level = 1, root.left = 2 는 level 2, root.left.left = 1은 level 3

    /**
     *       5
     *   3        7
     *        6       8
     *                     9
     *
     *  라면 왼쪽은 깊이 1, 오른쪽은 깊이가 3이된다 둘중 깊이가 3이 크니 5의 높이는 3이 됨
     *  즉 해당 노드의 자식중 제일 갚은 노드의 깊이 가
     */
    public  int height;

    public int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;

    }

    public Node(int data, int level) {
        this.data = data;
        this.level = level;
        left = null;
        right = null;
    }
}
