package main.java.datastructure;

import main.java.LinkedListUtil;

/**
 * 특점 위치의 노드 삭제하기
 */
public class DeleteNode extends LinkedListUtil {

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode pointer = head;

        if (position == 0) {
            head = head.next;
        } else {

            while (--position > 0) {
                pointer = pointer.next;
            }

            pointer.next = pointer.next.next;
        }

        return head;
    }

}
