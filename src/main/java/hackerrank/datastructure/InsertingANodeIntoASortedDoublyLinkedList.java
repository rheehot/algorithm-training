package hackerrank.datastructure;

import hackerrank.LinkedListUtil;

/**
 * 링크드 리스트에 특정 값을 껴넣는데 대신 순서에 맞게 껴넣는다
 *
 * 1 -> 2 -> 3 -> 5
 *
 * 4 :
 * 1 -> 2 -> 3 -> 4 -> 5
 *
 * 0 :
 * 0 -> 1 -> 2 -> 3 -> 5
 *
 * 6 :
 * 1 -> 2 -> 3 -> 5 -> 6
 *
 */
public class InsertingANodeIntoASortedDoublyLinkedList extends LinkedListUtil {


    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode pointer = head;
        DoublyLinkedListNode newDoublyLinkedListNode = new DoublyLinkedListNode(data);

        while (pointer != null) {

            newDoublyLinkedListNode.next = pointer;

            if (pointer.data >= data && pointer.prev == null) {

                return newDoublyLinkedListNode;

            } else if (pointer.data >= data) {

                pointer.prev.next = newDoublyLinkedListNode;
                return head;

            } else if ( pointer.next == null) {

                pointer.next = newDoublyLinkedListNode;
                return head;

            }

            pointer = pointer.next;
        }

        return head;
    }

}
