package test.java.hackerrank.datastructure;

import main.java.LinkedListUtil;
import org.junit.Test;

import static main.java.hackerrank.datastructure.InsertANodeAtASpecificPositionInALinkedList.insertNodeAtPosition;
import static org.junit.Assert.assertEquals;

public class InsertANodeAtASpecificPositionInALinkedListTest extends LinkedListUtil {

    @Test
    public void test() {

        //Given
        int[] linkedListItems = {16, 13, 7};
        int[] expected = {16, 13, 1, 7};
        int insertData = 1;
        int position = 2;

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        for (int i = 0; i < linkedListItems.length; i++) {
            singlyLinkedList.insertNode(linkedListItems[i]);
        }

        //When
        SinglyLinkedListNode singlyLinkedListNode = insertNodeAtPosition(singlyLinkedList.head, insertData, position);


        //Then
        for (int i = 0; i < expected.length; i++) {
            System.out.println("data = " + singlyLinkedListNode.data);
            assertEquals(expected[i], singlyLinkedListNode.data);
            singlyLinkedListNode = singlyLinkedListNode.next;

        }
    }
}