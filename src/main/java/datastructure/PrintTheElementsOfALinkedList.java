package main.java.datastructure;

import main.java.LinkedList;

public class PrintTheElementsOfALinkedList extends LinkedList {


    public static void printLinkedList(SinglyLinkedListNode head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }
}
