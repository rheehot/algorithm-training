package main.java.leetcode.topInterViewQuestions.medium.linkedList;

/**
 * Created by kimchanjung on 2020-02-04 2:10 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/107/linked-list/783/
 * [Add Two Numbers]
 */


public class AddTwoNumbersSolution {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode pointer = listNode;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            pointer.next = new ListNode(sum % 10);
            pointer = pointer.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            carry = sum / 10;
        }

        pointer.next = carry > 0 ? new ListNode(carry) : null;

        return listNode.next;
    }
}
