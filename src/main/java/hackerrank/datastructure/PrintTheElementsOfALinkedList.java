package hackerrank.datastructure;

import hackerrank.LinkedListUtil;

/**
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/
 * [Print the Elements of a Linked List]
 * [EASY]
 *
 */
public class PrintTheElementsOfALinkedList extends LinkedListUtil {


    public static void printLinkedList(SinglyLinkedListNode head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }

    }
}
