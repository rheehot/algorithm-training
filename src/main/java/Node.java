package main.java;

public class Node {
    public Node left;
    public Node right;
    public int level;
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
