package leetcode.topInterViewQuestions.medium.linkedList;

/**
 * Created by kimchanjung on 2020-02-10 5:01 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/107/linked-list/785/
 * [Intersection of Two Linked Lists]
 *
 * 길이가 다른 두 링크드 리스트가 중간에 합쳐 지는 경우
 * 합쳐지는 노드를 찾아 출력
 */
public class IntersectionOfTwoLinkedLists {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private static int getLength(ListNode root, int len) {
        if (root == null) return len;
        return getLength(root.next, len + 1);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA, 0), lenB = getLength(headB, 0);
        int jumpNum = Math.abs(lenA - lenB);

        if (lenA < lenB) {
            ListNode temp = headA;
            headA = headB;
            headB = temp;
        }

        while ((headA != null || headB != null) && headA != headB) {
            if (jumpNum > 0) {
                headA = headA.next;
                jumpNum--;
                continue;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return headA == headB ? headA : null;
    }
}
