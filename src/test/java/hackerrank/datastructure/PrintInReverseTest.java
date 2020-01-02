package test.java.hackerrank.datastructure;

import org.junit.Test;
import main.java.LinkedListUtil;

import static main.java.hackerrank.datastructure.PrintInReverse.*;

public class PrintInReverseTest extends LinkedListUtil {

    @Test
    public void test() {
        //Given
        int[] items = {16, 12, 4, 2, 5};
        SinglyLinkedList llist = createLikedList(items, new SinglyLinkedList());

        //When
        reversePrint(llist.head);
    }
}