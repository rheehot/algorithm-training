package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class LinkedListUtil {

    public static class SinglyLinkedListNode extends LinkedListNode {
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            super(nodeData);
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

    public static SinglyLinkedList createLikedList(int[] items, SinglyLinkedList singlyLinkedList) {
        SinglyLinkedList llist = new SinglyLinkedList();

        for (int i = 0; i < items.length; i++) {

            llist.insertNode(items[i]);
        }

        return llist;
    }

    public static class DoublyLinkedListNode extends LinkedListNode {
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            super(nodeData);
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    public static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static DoublyLinkedList createLikedList(int[] items, DoublyLinkedList doublyLinkedList) {

        for (int i = 0; i < items.length; i++) {
            doublyLinkedList.insertNode(items[i]);
        }

        return doublyLinkedList;
    }


    public static String getData(LinkedListNode node) {
        return (node == null) ? " " : String.valueOf(node.data);
    }

    public int[] toArrays(LinkedListNode head) {
        List<Integer> items = new ArrayList<>();
        while (head != null) {
            System.out.println("DATA = " + head.data);
            items.add(head.data);
            head = head.next;
        }
        return items.stream().mapToInt(Integer::intValue).toArray();
    }
}
