package main.java.datastructure;

import main.java.LinkedList;

/**
 * 링크드 리스트 역순
 */
public class ReverseALinkedList extends LinkedList {

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode pointer = head;
        SinglyLinkedListNode prev = null;

        while (pointer != null) {
            SinglyLinkedListNode nextPointer = pointer.next; // 일단 다음 포인터를 저장한다 1 -> 2를 저장한다.
            pointer.next = prev;    // 그리고 현재 포인터의 next를 2가 아닌 반대로 저장한다 1 -> null, 2 -> 1 되도록
            prev = pointer; // 현재포인터 값 1을 이전값으로 저장해두고 다음포인터 2차례가 되면 2의 next를 이값(1)이 되도록 하기위해 저장해둔다.
            pointer = nextPointer; // 1->2->3으로 진행하기위해 포인터는 정방향으로
        }

        return prev;
    }
}
