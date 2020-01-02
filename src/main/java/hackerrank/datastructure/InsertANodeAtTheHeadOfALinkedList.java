package main.java.hackerrank.datastructure;

import main.java.LinkedListUtil;

/**
 * 링크드 리스트의 head에 새노드를 껴넣는다.
 */
public class InsertANodeAtTheHeadOfALinkedList extends LinkedListUtil {

    /**
     * 노드가 null 이면 새 노드를 생성 (첫번째 노드라는 이야기)
     * 노드가 null 이 아니면 첫번째 노드가 생성 되고 난 이후 라는 이야기이며
     *
     * 새 노드를 생성하여 next에  파라메터로 받은 노드를 껴넣는다.
     *
     * 예)
     *
     * 노드 = null, data = 1 -> 노드는 null 이라 노드생성
     *
     * 노드 = (data = 1을 가진 노드) , data = 2 -> data 2를 가진 새노드의 next 파라메터로 받은 1을 가진 노드를 껴넣는다.
     *
     * ==> 새노드 노드(2).next = 노드(1)을 껴넣는다.다 (리턴되는 노드는 2가 되니까)
     * ==> 새노드 노드(3).next = 노드(2)를 껴넣는
     *
     * @param node
     * @param data
     * @return
     */
    public static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode node, int data) {

        SinglyLinkedListNode newLikedList = new SinglyLinkedListNode(data);

        if (node != null) {
            newLikedList.next = node;
        }

        return newLikedList;
    }

}
