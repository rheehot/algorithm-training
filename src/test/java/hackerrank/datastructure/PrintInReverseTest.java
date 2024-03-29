package hackerrank.datastructure;

import hackerrank.LinkedListUtil;
import org.junit.Test;

import static hackerrank.datastructure.PrintInReverse.*;

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