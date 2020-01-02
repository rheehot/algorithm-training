package main.java.hackerrank.interviewkit.LinkedList;

import main.java.LinkedListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/ctci-linked-list-cycle
 *
 *  1 -> 2 -> 3 -> 4 -> 5 - 3
 *
 *  링크드 리스트의 마지막 노드 5의 next가 null 이면 false
 *  순환이면 true 반환
 *
 *  해결책
 *  링크드 리스트를 순환 하면서 HashSet에 next가 이미 있던 node인지 확인 하여 있으면 true
 *  그냥 null을 만나 종료되면 false
 *
 *  주의!! data 값은 중복일 수도 있어서 Node Type을 Set에 저장한다.
 *
 */
public class DetectACycle {
    public static boolean hasCycle(LinkedListNode head) {
        Set<LinkedListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head.next)) return true;
            set.add(head);
            head = head.next;
        }

        return false;
    }
}
