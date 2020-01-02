package main.java.hackerrank.datastructure;

import main.java.LinkedListUtil;

/**
 * 두 링크드 리스트를 비교하여 같으면 1아니면 0 리턴
 * 여기서 같다는 것은 링크드 리스트의 요소의 같은 노드에 같은 값이면 일치라고 판단 즉 1->2 = 1->2 면 같은 것
 * 문제에서 햇갈리는데 첫번째 라인은 테스트 케이스가 2개라는 것이고 그다음이 첫번째 링크드 리스트의 요소수이다
 * 첫번째 라인이 첫번째 링크드 리스트의 요소수로 생각하면 햇갈린다 문제가 좀.....
 */
public class CompareTwoLinkedLists extends LinkedListUtil {
    public static boolean compareLists(SinglyLinkedListNode firstHead, SinglyLinkedListNode secondHead) {

        /**
         * 둘다 null이 아니며 값이 같을 경우 까지 포인터를 진행한다.
         * 1->2->null, 1-> null 인경우 1번째 노드에서 1 = 1 이므로 만족 해서 다음 노드로 진행
         * 2 != null 이 되므로 더이상 진행 안함
         * 비교하면 firstHead는 값이 존재하고 secondHead null 이므로 false가 된다
         *
         * 1->2->null, 1->2->null 인경우
         * 2 = 2 까지 만족 되고 다음 노드로 진행 -> 둘다 null 이므로 진행 중단
         * firstHead, secondHead 가 둘다 null 이므로 완전히 같으므로 true
         */
        while (firstHead != null && secondHead != null && firstHead.data == secondHead.data) {
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }

        return firstHead == secondHead;
    }
}
