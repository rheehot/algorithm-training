package hackerrank.datastructure;

import hackerrank.LinkedListUtil;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindMergePointOfTwoListsTest extends LinkedListUtil {


    @Test
    public void test() {
        //Given
        SinglyLinkedList likedList1 = createLikedList(new int[]{1, 2, 3}, new SinglyLinkedList());
        SinglyLinkedList likedList2 = createLikedList(new int[]{1}, new SinglyLinkedList());
        likedList2.head.next = likedList1.head.next.next;

        //When
        int mergeNode = FindMergePointOfTwoLists.findMergeNode(likedList1.head, likedList2.head);

        //Then
        assertThat("result is = ", mergeNode, is(3));
    }
}