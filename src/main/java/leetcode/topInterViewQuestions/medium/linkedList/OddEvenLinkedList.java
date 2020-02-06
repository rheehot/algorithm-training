package leetcode.topInterViewQuestions.medium.linkedList;

/**
 * Created by kimchanjung on 2020-02-05 5:49 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/107/linked-list/784/
 * [Odd Even Linked List]
 *
 * Input: 1->2->3->4->5->NULL
 *        1  2  3  4  5
 * Output: 1->3->5->2->4->NULL 홀수자리, 짝수자리 분리 시킨 수 값을 출력 했을 때다 햇갈림주의
 *
 * Input: 2->1->3->5->6->4->7->NULL
 *        1  2  3  4  5  6  7
 * Output: 2->3->6->7->1->5->4->NULL
 *         1  3  5  5  2  4  6
 *
 * 즉 입력 노드의 값을 가지고 홀수 짝수 정렬이 아니고
 * 입력 노드의 자리 수 즉 1 3 5 7... 홀수자리 모으로
 * 2 4 6 8 ... 짝수 자리 모아서 이동 시킨 후 출력한다.
 *
 * 1 -> 2 -> 3 -> 4 라면
 * 1.next = 2.next로 변경 => 1 -> 3
 * 1 = 1.next(3) 으로 변
 * 2.next = 1.next(3.next 4가됨)로 변경 => 2 -> 4
 * 2 = 2.next경
 *
 * 그리고 홀수 tail.next = 짝수 head를 연결 시킨다.
 */
public class OddEvenLinkedList {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }

    public static ListNode oddEvenList(ListNode head){
        if (head == null) return null;
        ListNode evenHead = head.next;
        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p2 != null && p2.next != null) {
            p1.next = p2.next;
            p1 = p1.next;
            p2.next = p1.next;
            p2 = p2.next;
        }

        p1.next = evenHead;

        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        return head;
    }
}
