package main.java.datastructure;

import main.java.LinkedList;

/**
 * 링크드리스트의 특정 포지션에 새노드를 껴넣는다.
 */
public class InsertANodeAtASpecificPositionInALinkedList extends LinkedList {

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode node, int data, int insertPosition) {

        SinglyLinkedListNode insertNode = new SinglyLinkedListNode(data);
        SinglyLinkedListNode currentNode = node;

        // 껴넣을 포지션의 노드까지 이동한다.
        while (--insertPosition > 0) {
            currentNode = currentNode.next;
        }

        // 껴넣을 노드의 다음 노드에 껴넣기전 원래 노드의 다음 노드를 껴넣고
        insertNode.next = currentNode.next;
        // 껴녛을 노드의 앞노드(현재노드)의 다음 노드에 껴넣을 노드를 껴넣는다
        currentNode.next = insertNode;

        return node;

    }

}
