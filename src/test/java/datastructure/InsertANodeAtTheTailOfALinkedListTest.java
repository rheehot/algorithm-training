package test.java.datastructure;

import main.java.datastructure.InsertANodeAtTheTailOfALinkedList;
import org.junit.Test;

import java.util.Random;

import static main.java.datastructure.InsertANodeAtTheTailOfALinkedList.insertNodeAtTail;
import static main.java.datastructure.InsertANodeAtTheTailOfALinkedList.printSinglyLinkedList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class InsertANodeAtTheTailOfALinkedListTest {


    @Test
    public void test() {
        //Given
        InsertANodeAtTheTailOfALinkedList.SinglyLinkedList llist = new InsertANodeAtTheTailOfALinkedList.SinglyLinkedList();

        //When
        InsertANodeAtTheTailOfALinkedList.SinglyLinkedListNode singlyLinkedListNode = insertNodeAtTail(llist.head, 12);

        //Then

        assertThat("result = ", singlyLinkedListNode, is(12));
    }

    @Test
    public void test2() {

        int[] llistItem = {1, 2, 3, 4, 5, 6, 7};
        InsertANodeAtTheTailOfALinkedList.SinglyLinkedList llist = new InsertANodeAtTheTailOfALinkedList.SinglyLinkedList();

        for (int i = 0; i < llistItem.length; i++) {

            InsertANodeAtTheTailOfALinkedList.SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem[i]);

            llist.head = llist_head;

        }

        System.out.println("list.head.data = "+llist.head.next);

    }

}