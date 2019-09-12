package test.java.datastructure;

import main.java.datastructure.PrintTheElementsOfALinkedList;
import org.junit.Test;

import static main.java.datastructure.PrintTheElementsOfALinkedList.*;
import static org.junit.Assert.*;

public class PrintTheElementsOfALinkedListTest {

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