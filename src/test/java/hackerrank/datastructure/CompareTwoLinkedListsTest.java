package test.java.hackerrank.datastructure;

import main.java.LinkedListUtil;
import main.java.datastructure.CompareTwoLinkedLists;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompareTwoLinkedListsTest extends LinkedListUtil {

    @Test
    public void test() {
        //Given
        int[] firstLinkedListItems = {1, 2};
        int[] secondLinkedListItems = {1};
        SinglyLinkedList firstLikedList = createLikedList(firstLinkedListItems, new SinglyLinkedList());
        SinglyLinkedList secondLinkedList = createLikedList(secondLinkedListItems, new SinglyLinkedList());

        //When
        boolean results = CompareTwoLinkedLists.compareLists(firstLikedList.head, secondLinkedList.head);


        //Then
        assertFalse(results);
    }

    @Test
    public void test2() {
        //Given
        int[] firstLinkedListItems = {1, 2};
        int[] secondLinkedListItems = {1, 2};
        SinglyLinkedList firstLikedList = createLikedList(firstLinkedListItems, new SinglyLinkedList());
        SinglyLinkedList secondLinkedList = createLikedList(secondLinkedListItems, new SinglyLinkedList());

        //When
        boolean results = CompareTwoLinkedLists.compareLists(firstLikedList.head, secondLinkedList.head);


        //Then
        assertTrue(results);
    }

}