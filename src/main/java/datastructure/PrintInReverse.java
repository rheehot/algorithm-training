package main.java.datastructure;

import main.java.LinkedListUtil;

public class PrintInReverse extends LinkedListUtil {

    public static void reversePrint(SinglyLinkedListNode head) {
        if (head == null) {
            return;
        } else {
            reversePrint(head.next);
            System.out.println(head.data);
        }
    }
}
