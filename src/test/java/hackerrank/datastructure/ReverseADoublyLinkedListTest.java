package test.java.hackerrank.datastructure;

import main.java.LinkedListUtil;
import main.java.datastructure.ReverseADoublyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseADoublyLinkedListTest extends LinkedListUtil {

    @Test
    public void test() {
        //Given
        int[] items = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        DoublyLinkedList likedList = createLikedList(items, new DoublyLinkedList());

        //When
        DoublyLinkedListNode doublyLinkedListNode = ReverseADoublyLinkedList.reverse(likedList.head);

        //Then
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], doublyLinkedListNode.data);
            doublyLinkedListNode = doublyLinkedListNode.next;
        }

    }
}