package hackerrank.datastructure;

import hackerrank.LinkedListUtil;
import org.junit.Test;

import static hackerrank.datastructure.InsertANodeAtTheTailOfALinkedList.insertNodeAtTail;
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