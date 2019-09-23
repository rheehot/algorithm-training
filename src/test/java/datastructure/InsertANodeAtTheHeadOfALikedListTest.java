package test.java.datastructure;

import main.java.datastructure.InsertANodeAtTheHeadOfALikedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertANodeAtTheHeadOfALikedListTest {

    @Test
    public void test() {
        //Given
        int[] linkedListItems = {1, 2, 3, 4, 5};
        InsertANodeAtTheHeadOfALikedList.SinglyLinkedList singlyLinkedList = new InsertANodeAtTheHeadOfALikedList.SinglyLinkedList();

        //When
        for (int i = 0; i < linkedListItems.length; i++) {
            InsertANodeAtTheHeadOfALikedList.SinglyLinkedListNode node = InsertANodeAtTheHeadOfALikedList.insertNodeAtHead(singlyLinkedList.head, linkedListItems[i]);
            singlyLinkedList.head = node;
        }

        //Then
        for (int i = linkedListItems.length-1; i >= 0; i--) {
            System.out.println("data = "+ singlyLinkedList.head.data);
            assertEquals(linkedListItems[i], singlyLinkedList.head.data);
            singlyLinkedList.head = singlyLinkedList.head.next;
        }
    }
}