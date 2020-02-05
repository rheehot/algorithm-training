package test.java.leetcode.topInterViewQuestions.medium.linkedList;


import main.java.leetcode.topInterViewQuestions.medium.linkedList.AddTwoNumbersSolution;

import org.junit.Test;

import static main.java.leetcode.topInterViewQuestions.medium.linkedList.AddTwoNumbersSolution.*;
import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-04 2:20 오후
 */
public class AddTwoNumbersSolutionTest {

    @Test
    public void test() {

        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);

        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);
        ListNode listNode = addTwoNumbers(listNode1, listNode2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}