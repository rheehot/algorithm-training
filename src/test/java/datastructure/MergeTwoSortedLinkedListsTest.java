package test.java.datastructure;

import main.java.LinkedList;
import main.java.datastructure.MergeTwoSortedLinkedLists;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedLinkedListsTest extends LinkedList {

    @Test
    public void test() {
        int[] firstLinkedListItems = {1, 2,3};
        int[] secondLinkedListItems = {3, 4};
        SinglyLinkedList firstLikedList = createLikedList(firstLinkedListItems);
        SinglyLinkedList secondLinkedList = createLikedList(secondLinkedListItems);
        int[] expected = {1, 2, 3, 3, 4};

        //When
        SinglyLinkedListNode results = MergeTwoSortedLinkedLists.mergeLists(firstLikedList.head, secondLinkedList.head);


        //Then
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], results.data);
            results = results.next;
        }

    }
}