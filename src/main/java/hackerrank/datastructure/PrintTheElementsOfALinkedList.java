package hackerrank.datastructure;

import hackerrank.LinkedListUtil;

public class PrintTheElementsOfALinkedList extends LinkedListUtil {


    public static void printLinkedList(SinglyLinkedListNode head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }
}
