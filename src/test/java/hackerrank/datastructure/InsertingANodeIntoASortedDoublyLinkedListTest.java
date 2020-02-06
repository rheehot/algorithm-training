package hackerrank.datastructure;

import hackerrank.LinkedListUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertingANodeIntoASortedDoublyLinkedListTest extends LinkedListUtil {

    @Test
    public void test() {
        //Given
        DoublyLinkedList doublyLinkedList = createLikedList(new int[]{1, 3, 4, 10}, new DoublyLinkedList());
        int[] expected = { 1, 3, 4, 10,11};

        //When
        DoublyLinkedListNode doublyLinkedListNode = InsertingANodeIntoASortedDoublyLinkedList.sortedInsert(doublyLinkedList.head, 11);

        //Then
        for (int i = 0; i < expected.length; i++) {
            System.out.println("expected = "+ doublyLinkedListNode.data);
            assertEquals(expected[i], doublyLinkedListNode.data);
            doublyLinkedListNode = doublyLinkedListNode.next;
        }

    }

}