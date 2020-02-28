package hackerrank.datastructure;

import hackerrank.LinkedListUtil;

/**
 * https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/
 * [Merge two sorted linked lists]
 * [EASY]
 */
public class MergeTwoSortedLinkedLists extends LinkedListUtil {
    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, LinkedListUtil.SinglyLinkedListNode head2) {
        System.out.println("call mergeList head1 = " + getData(head1) + ", head2 = " + getData(head2));

        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        if (head1.data < head2.data) {
            head1.next = mergeLists(head1.next, head2);
            System.out.println("head1.next = " + getData(head1.next)+", head1 = "+getData(head1));
            return head1;
        } else {
            head2.next = mergeLists(head2.next, head1);
            System.out.println("head2.next = " + getData(head1.next)+", head2 = "+getData(head1));
            return head2;
        }
    }
}

