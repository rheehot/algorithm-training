package hackerrank.datastructure;

import hackerrank.LinkedListUtil;
import org.junit.Test;

import static hackerrank.datastructure.PrintTheElementsOfALinkedList.printLinkedList;


public class PrintTheElementsOfALinkedListTest extends LinkedListUtil {

    @Test
    public void test() {
        //Given
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.insertNode(16);
        linkedList.insertNode(13);

        //When
        printLinkedList(linkedList.head);
    }
}