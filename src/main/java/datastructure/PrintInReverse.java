package main.java.datastructure;

import main.java.LinkedList;

public class PrintInReverse extends LinkedList {

    public static void reversePrint(SinglyLinkedListNode head) {
        if (head == null) {
            return;
        } else {
            reversePrint(head.next);
            System.out.println(head.data);
        }
    }
}
