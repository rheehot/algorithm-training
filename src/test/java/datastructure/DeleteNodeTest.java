package test.java.datastructure;

import main.java.LinkedListUtil;
import org.junit.Test;

import static main.java.datastructure.DeleteNode.deleteNode;
import static org.junit.Assert.assertEquals;

public class DeleteNodeTest extends LinkedListUtil {

    @Test
    public void test() {
        //Given
        int[] items = {20, 6, 2, 19, 7, 4, 15, 9};
        int[] expected = {20, 6, 2, 7, 4, 15, 9};
        int deletePosition = 3;
        SinglyLinkedList linkedList = createLikedList(items, new SinglyLinkedList());

        //When
        SinglyLinkedListNode singlyLinkedListNode = deleteNode(linkedList.head, deletePosition);

        //Then
        for (int i = 0; i < expected.length; i++) {
            System.out.println("expected = " + expected[i] + ", result = " + singlyLinkedListNode.data);
            assertEquals(expected[i], singlyLinkedListNode.data);
            singlyLinkedListNode = singlyLinkedListNode.next;
        }
    }


}