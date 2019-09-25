package test.java.datastructure;

import main.java.LinkedList;
import org.junit.Test;

import static main.java.datastructure.PrintTheElementsOfALinkedList.printLinkedList;


public class PrintTheElementsOfALinkedListTest extends LinkedList {

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