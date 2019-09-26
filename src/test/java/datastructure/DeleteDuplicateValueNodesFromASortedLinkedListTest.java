package test.java.datastructure;

import main.java.LinkedList;
import main.java.datastructure.DeleteDuplicateValueNodesFromASortedLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteDuplicateValueNodesFromASortedLinkedListTest extends LinkedList {

    @Test
    public void test() {
        //Given
        int[] items = {3,3,3,4,5,5};
        int[] expected = {3, 4,5};
        SinglyLinkedList likedList = createLikedList(items);

        //When
        SinglyLinkedListNode results = DeleteDuplicateValueNodesFromASortedLinkedList.removeDuplicates(likedList.head);

        //Then
        assertArrayEquals(expected, toArrays(results));
    }
}