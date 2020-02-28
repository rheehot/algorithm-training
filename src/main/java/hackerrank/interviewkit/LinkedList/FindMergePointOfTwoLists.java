package hackerrank.interviewkit.LinkedList;

import hackerrank.LinkedListUtil;

/**
 * 두개의 링크드 리스트는 어떤 지점에서 둘이 합쳐 져 있다 이 합쳐진 지점을 찾는 것
 *
 * 1 -> 2 ->
 *           3 -> null
 *      1 ->
 *
 * 3을 찾는 것인데
 *
 * 아래 처럼 순서가 같은 지점에서 머지 되어 있다면
 * 그냥 한칸씩 비교 해나가면되지만
 * 1 -> 2 ->
 *           3 -> null
 * 1 -> 2 ->
 *
 * 첫 번째 예제처럼 되어 있다면 순서가 달라서 루프를 두번 돌려야 하는데 리스트 1은 1칸씩 리스트 2는 2칸 씩 이동 시켜 계속 순환 시키는
 * 방법을 했지만 그럴 필요 없었다 그냥 tail을 만나면 다시 head로 돌아 가도록 하고 어짜피 둘의 리스트의 머지 지점이 순서가 다르면
 * 리스트 1은 1칸 리스트2는 2칸 이동 과 같은 효과로 루프가 돌면서 언젠가는 만나게 되므로 둘다 1칸씩 이동하고 tail을 만나면 head로 가도록 처리
 *
 */
public class FindMergePointOfTwoLists extends LinkedListUtil {
    public static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode pointer1 = head1;
        SinglyLinkedListNode pointer2 = head2;

        while (pointer1 != pointer2) {
            pointer1 = pointer1.next == null ? head1 : pointer1.next;
            pointer2 = pointer2.next == null ? head2 : pointer2.next;

        }

        return pointer1.data;
    }
}
