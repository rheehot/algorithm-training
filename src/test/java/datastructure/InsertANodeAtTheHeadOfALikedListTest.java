package test.java.datastructure;

import main.java.LinkedListUtil;
import org.junit.Test;

import static main.java.datastructure.InsertANodeAtTheHeadOfALinkedList.insertNodeAtHead;
import static org.junit.Assert.assertEquals;

public class InsertANodeAtTheHeadOfALikedListTest extends LinkedListUtil {

    @Test
    public void test() {
        //Given
        int[] linkedListItems = {1, 2, 3, 4, 5};
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();


        //When
        for (int i = 0; i < linkedListItems.length; i++) {
            SinglyLinkedListNode node = insertNodeAtHead(singlyLinkedList.head, linkedListItems[i]);
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