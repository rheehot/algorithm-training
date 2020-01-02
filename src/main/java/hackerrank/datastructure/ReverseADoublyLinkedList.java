package main.java.hackerrank.datastructure;

import main.java.LinkedListUtil;

public class ReverseADoublyLinkedList extends LinkedListUtil {

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode nextPointer;
        DoublyLinkedListNode next = null;

        while (head != null) {
            nextPointer = head.next;
            head.next = next;
            head.prev = nextPointer;
            next = head;
            head = nextPointer;
        }

        return next;
    }
}
