package leetcode.topInterViewQuestions.medium.linkedList;

import org.junit.Test;

import static leetcode.topInterViewQuestions.medium.linkedList.IntersectionOfTwoLinkedLists.*;
import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-02-10 5:02 오후
 */
public class IntersectionOfTwoLinkedListsTest {

    @Test
    public void test() {
        //listA = [4,1,8,4,5], listB = [5,0,1,8,4,5
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(1);
        listNode.next.next= new ListNode(8);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);

        ListNode listNode2 = new ListNode(5);
        listNode2.next =  new ListNode(0);
        listNode2.next.next = new ListNode(1);
        listNode2.next.next.next = listNode.next.next;

        getIntersectionNode(listNode, listNode2);
    }
}