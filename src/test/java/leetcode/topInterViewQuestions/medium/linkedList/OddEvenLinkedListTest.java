package leetcode.topInterViewQuestions.medium.linkedList;

import leetcode.topInterViewQuestions.medium.linkedList.OddEvenLinkedList.*;
import org.junit.Test;

import static leetcode.topInterViewQuestions.medium.linkedList.OddEvenLinkedList.oddEvenList;
import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-05 5:51 오후
 */
public class OddEvenLinkedListTest {

    @Test
    public void test() {
        // 2->1->3->5->6->4->7->NULL
        ListNode listNode = new ListNode(2);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(5);
        listNode.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next = new ListNode(4);
        listNode.next.next.next.next.next.next = new ListNode(7);
        oddEvenList(listNode);
    }
}