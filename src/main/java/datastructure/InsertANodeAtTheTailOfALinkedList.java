package main.java.datastructure;

import java.io.BufferedWriter;
import java.io.IOException;

public class InsertANodeAtTheTailOfALinkedList {

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

        public SinglyLinkedList() {
            this.head = null;
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

    public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        // 데이터를 가지고 data, next 를 가진 노드를 생성한다

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        System.out.println("data = " + data);

        /**
         *  head가 null 이면 즉 첫번째 head null 이 때문에 head에 생성한 노드를 넣는다
         *  그러나 첫번째 노드가 head에 값이 선언되고 리턴 하고 다음 번에는 head가 null 이 아니기 때문데 data = 1, next = null
         *  값인 head가 들어 오기 때문에 next에다가 다음에 생성할 data = 2 인 새로운 노드를 넣는다.
         */
        if (head == null) {
            head = newNode;
        } else {
            System.out.println("head.data = " + head.data);

            // 맨마지막 노드의 next에 새 노드를 추가 해야 되기 때문에 node.next가 null 인 노드를 계속 해서 찾는데
            // 아래 while 문에서 node.next를 node에 대입하여 즉 1번노드 -> 2번노드 -> 3번 노드(next가 null 즉 맨마지막이다)까지 찾는다
            // SinglyLinkedListNode node = head; <= 이구문은 문젱서 첫번째 노드를 반환 해야 되서 첫번째 노드인 head는 배번 리턴하도록하고
            // head를 node에 대입 해서 node를 맨마지막 까지 찾아서 신규 노드를 추가하는 작업을 한다. 그리고 첫번째 노드은 head를 항상 반환한다.
            SinglyLinkedListNode node = head;
            while (node.next != null) {

                node = node.next;
                System.out.println("node.data = " + node.data);
            }
            node.next = newNode;
        }

        return head;
    }

}
