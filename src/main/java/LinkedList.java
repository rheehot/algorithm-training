package main.java;

import main.java.datastructure.DeleteNode;

public class LinkedList {

    public static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    public static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static SinglyLinkedList createLikedList(int[] items) {
        SinglyLinkedList llist = new SinglyLinkedList();

        for (int i = 0; i < items.length; i++) {

            llist.insertNode(items[i]);
        }

        return llist;
    }

    public static String getData(SinglyLinkedListNode node) {
        return (node == null) ? " " : String.valueOf(node.data);
    }
}
