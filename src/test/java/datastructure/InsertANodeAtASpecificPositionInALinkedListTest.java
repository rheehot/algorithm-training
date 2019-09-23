package test.java.datastructure;

import main.java.datastructure.InsertANodeAtASpecificPositionInALinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertANodeAtASpecificPositionInALinkedListTest {

    @Test
    public void test() {

        //Given
        int[] linkedListItems = {16, 13, 7};
        int[] expected = {16, 13, 1, 7};
        int insertData = 1;
        int position = 2;

        InsertANodeAtASpecificPositionInALinkedList.SinglyLinkedList singlyLinkedList = new InsertANodeAtASpecificPositionInALinkedList.SinglyLinkedList();

        for (int i = 0; i < linkedListItems.length; i++) {
            singlyLinkedList.insertNode(linkedListItems[i]);
        }

        //When
        InsertANodeAtASpecificPositionInALinkedList.SinglyLinkedListNode singlyLinkedListNode = InsertANodeAtASpecificPositionInALinkedList.insertNodeAtPosition(singlyLinkedList.head, insertData, position);


        //Then
        for (int i = 0; i < expected.length; i++) {
            System.out.println("data = " + singlyLinkedListNode.data);
            assertEquals(expected[i], singlyLinkedListNode.data);
            singlyLinkedListNode = singlyLinkedListNode.next;

        }
    }
}