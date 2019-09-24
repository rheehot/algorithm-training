package main.java.datastructure;

import main.java.LinkedList;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 * 링크드 리스트의 마지막에 꼬리에 새노드를 껴넣는다
 */
public class InsertANodeAtTheTailOfALinkedList extends LinkedList {

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    public static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode node, int data) {
        // 데이터를 가지고 data, next 를 가진 노드를 생성한다

        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
        System.out.println("data = " + data);

        /**
         * node가 null 이면 첫번째 노드라는 이야기 그래서 신규노드를 생성하고 node(data = 1) 인 신규 노드를 리턴
         * node가 null 이 아니라면 좀전에 리턴했던 node(data = 1) 노드가 되고
         * 매번 node의 맨마지막(tail)을 찾아서 신규 노드를 추가한다
         */
        if (node == null) {
            node = newNode;
        } else {
            System.out.println("node.data = " + node.data);

            // 맨마지막 노드의 next에 새 노드를 추가 해야 되기 때문에 node.next가 null 인 노드를 계속 해서 찾는데
            // 아래 while 문에서 node.next를 node에 대입하여 즉 1번노드 -> 2번노드 -> 3번 노드(next가 null 즉 맨마지막이다)까지 찾는다
            // SinglyLinkedListNode node = head; <= 이구문은 문젱서 첫번째 노드를 반환 해야 되서 첫번째 노드인 head는 배번 리턴하도록하고
            // head를 node에 대입 해서 node를 맨마지막 까지 찾아서 신규 노드를 추가하는 작업을 한다. 그리고 첫번째 노드은 head를 항상 반환한다.
            SinglyLinkedListNode pointer = node;

            while (pointer.next != null) {

                pointer = pointer.next;
                System.out.println("pointer.data = " + pointer.data);

            }

            pointer.next = newNode;
        }

        return node;
    }

}
