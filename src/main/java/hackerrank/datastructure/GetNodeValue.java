package main.java.hackerrank.datastructure;

import main.java.LinkedListUtil;

/**
 * tail 로 부터 특정 위치의 값을 가져 온다
 *
 * 예를 들어 1 2 3 4 5 있고 위치가 1 라면 5 -> 4  즉 4이 되는데( index는 0부터 0 1  즉 뒤에서 번째 자리라는 뜻 )
 *
 * 5 - 2 = 하면 3이고 0부터 3까지니 앞에서 부터는 4번째 위치 즉 4가 되는데 총 노드 수가 5를 알기 위해서 모든 노드를 돌고 다시 처음 부터 4번 이동하면
 * 두번 수행 되기 때문에
 *
 * 총 5 번까지 일단 pointer를 이동 시키고
 * 위치 2보다 클때 즉 남은 이동 회수는 3 4 5 즉 3번 5-2 뺀 개수 3 만큼 이동을 이때 부터 시작 하는 것이다
 * 5번 다 돌고 난후 다시 3번을 도는게 아니고 위치 2번 까지 돌다가 남은 수 3부터 시작 할때 3 4 5 번을 돌게 될텐데 그때부터 시작하는 것임
 * 투트랙인 셈이다.
 */
public class GetNodeValue extends LinkedListUtil {
    public static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        int valueNodeIndex = 0;
        SinglyLinkedListNode pointer = head;

        while (pointer != null) {
            pointer = pointer.next;
            if (valueNodeIndex++ > positionFromTail) {
                head = head.next;
            }
        }

        return head.data;
    }

}
