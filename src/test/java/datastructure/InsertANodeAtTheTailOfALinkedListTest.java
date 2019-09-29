package test.java.datastructure;

import main.java.LinkedListUtil;
import org.junit.Test;

import static main.java.datastructure.InsertANodeAtTheTailOfALinkedList.insertNodeAtTail;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class InsertANodeAtTheTailOfALinkedListTest extends LinkedListUtil {


    @Test
    public void test() {
        //Given
        SinglyLinkedList llist = new SinglyLinkedList();

        //When
        SinglyLinkedListNode singlyLinkedListNode = insertNodeAtTail(llist.head, 12);

        //Then

        assertThat("result = ", singlyLinkedListNode.data, is(12));
    }
}