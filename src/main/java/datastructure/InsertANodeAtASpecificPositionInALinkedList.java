package main.java.datastructure;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * 링크드리스트의 특정 포지션에 새노드를 껴넣는다.
 */
public class InsertANodeAtASpecificPositionInALinkedList {
    public static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    public static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

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
