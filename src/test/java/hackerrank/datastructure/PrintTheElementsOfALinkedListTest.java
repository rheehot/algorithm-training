package test.java.hackerrank.datastructure;

import main.java.LinkedListUtil;
import org.junit.Test;

import static main.java.hackerrank.datastructure.PrintTheElementsOfALinkedList.printLinkedList;


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