package hackerrank.datastructure;

import hackerrank.LinkedListUtil;

/**
 * 링크드 리스트가 tail -> null 이 아니고 다시 앞의 노드를 next로 가지고 있으면 순환인데 이런 경우 true 리턴
 *
 * 1 -> 2 -> 3 -> null  = false
 * 1 -> 2 -> 3 -> 2 = true ( 3이 다시 2를 가리킨다 )
 *
 * 처음에는 루프를 두번 돌면서 링크리스트 원래 값의 노드 와 pointer를 이동하면서 pointer next노드와 일치 하는 것이 두개(1개는 자기자신이라서))
 * 이면 true를 리턴 하도록 했지만 루프가 두번 돌면서 시간복잡도가 초가 여서 테스트케이스 실패
 *
 * 근데 방법을 확인 해보니 head -> next == pointer.next.next 를 계속 이동하면 결국 만나게 되는 원리
 * 즉 head는 한칸식 이동 pointer는 두칸씩 이동해서 비교
 *
 * 1 -> 2 -> 3 (3의 next 2라면)
 *
 * 순번                   1                           2
 * head의 next           2(1의 next)                  3 (2의 next)
 * pointer의 next next   3(1의 next.next)             3 (3의 next.next 3 -> 2 -> 3)
 * */
public class CycleDetection extends LinkedListUtil {
    public static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode pointer = head;

        while (head != null || pointer != null && pointer.next != null) {
            head = head.next;
            pointer = pointer.next.next;
            if (head == pointer) return true;

        }

        return false;
    }

}
