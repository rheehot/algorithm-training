package test.java.hackerrank.datastructure;

import main.java.LinkedListUtil;
import main.java.hackerrank.datastructure.DeleteDuplicateValueNodesFromASortedLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteDuplicateValueNodesFromASortedLinkedListTest extends LinkedListUtil {

    @Test
    public void test() {
        //Given
        int[] items = {3,3,3,4,5,5};
        int[] expected = {3, 4,5};
        SinglyLinkedList likedList = createLikedList(items, new SinglyLinkedList());

        //When
        SinglyLinkedListNode results = DeleteDuplicateValueNodesFromASortedLinkedList.removeDuplicates(likedList.head);

        //Then
        assertArrayEquals(expected, toArrays(results));
    }
}