package hackerrank.datastructure;

import hackerrank.LinkedListUtil;

/**
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/
 * [Print in Reverse]
 * [EASY]
 *
 */
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
