package test.java.hackerrank.datastructure;

import main.java.LinkedListUtil;
import main.java.hackerrank.datastructure.MergeTwoSortedLinkedListsUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeTwoSortedLinkedListsTest extends LinkedListUtil {

    @Test
    public void test() {
        int[] firstLinkedListItems = {1, 2,3};
        int[] secondLinkedListItems = {3, 4};
        SinglyLinkedList firstLikedList = createLikedList(firstLinkedListItems, new SinglyLinkedList());
        SinglyLinkedList secondLinkedList = createLikedList(secondLinkedListItems, new SinglyLinkedList());
        int[] expected = {1, 2, 3, 3, 4};

        //When
        SinglyLinkedListNode results = MergeTwoSortedLinkedListsUtil.mergeLists(firstLikedList.head, secondLinkedList.head);


        //Then
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], results.data);
            results = results.next;
        }

    }
}