package main.java.datastructure;

import main.java.LinkedListUtil;

/**
 * 중복된 노드를 제거한
 */
public class DeleteDuplicateValueNodesFromASortedLinkedList extends LinkedListUtil {

    /**
     * 재귀적으로 해
     * @param head
     * @return
     */
    public static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        if (head == null || head.next == null  ) return head;

        // 재귀함수는 head.next를 넘겨서 계속 노드를 이동 시킨
        if (head.data == head.next.data) {
            // 현재 노드 값과(3) 다음 노드 값이(3) 같으면 head를 다음 노드로 변경시켜 버린다
            head = removeDuplicates(head.next);
        } else {
            // 현재노드 값(3)과 다음 노드 값(4) 같지 않으면 3의 next는 원래 대로 4로 해놓고 다음 노드로 진행
            head.next = removeDuplicates(head.next);
        }

        return head;
    }

    /**
     * 루프 이
     * @param head
     * @return
     */
    public static SinglyLinkedListNode removeDuplicates2(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head;

        while (head != null) {
            if (head.next != null && head.data == head.next.data) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return node;
    }

    /**
     * 원래 문제에서는 중복이 순서적으로 나오는데  1 2 2 3 4
     * 1 2 1 2 3 4 이렇게 2가 붙어 있지 않는 경우의 해
     * @param head
     * @return
     */
    public static SinglyLinkedListNode removeDuplicates3(SinglyLinkedListNode head) {

        SinglyLinkedListNode node = head;

        while (head != null) {
            SinglyLinkedListNode pointer = head;
            boolean isRemove = false;

            while (pointer != null) {

                if (pointer.next != null && head.data == pointer.next.data) {
                    head.next = head.next.next;
                    isRemove = true;
                    break;
                }

                pointer = pointer.next;
            }

            head =  isRemove ? head : head.next;

        }


        return node;
    }
}
