package test.java.datastructure;

import main.java.datastructure.PrintInReverse;
import org.junit.Test;
import main.java.LinkedList;

import static main.java.datastructure.PrintInReverse.*;

public class PrintInReverseTest extends LinkedList {

    @Test
    public void test() {
        //Given
        int[] items = {16, 12, 4, 2, 5};
        SinglyLinkedList llist = createLikedList(items);

        //When
        reversePrint(llist.head);
    }
}