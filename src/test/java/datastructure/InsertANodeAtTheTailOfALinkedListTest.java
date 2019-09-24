package test.java.datastructure;

import main.java.LinkedList;
import main.java.datastructure.InsertANodeAtTheTailOfALinkedList;
import org.junit.Test;

import java.util.Random;

import static main.java.datastructure.InsertANodeAtTheTailOfALinkedList.insertNodeAtTail;
import static main.java.datastructure.InsertANodeAtTheTailOfALinkedList.printSinglyLinkedList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class InsertANodeAtTheTailOfALinkedListTest extends LinkedList{


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