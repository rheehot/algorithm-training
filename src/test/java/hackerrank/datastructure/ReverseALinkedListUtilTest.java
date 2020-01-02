package test.java.hackerrank.datastructure;

import main.java.LinkedListUtil;
import org.junit.Test;

import static main.java.hackerrank.datastructure.ReverseALinkedList.*;
import static org.junit.Assert.assertEquals;


public class ReverseALinkedListUtilTest extends LinkedListUtil {

    @Test
    public void test() {
        //Given
        int[] items = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        SinglyLinkedList likedList = createLikedList(items,  new SinglyLinkedList());

        //When
        SinglyLinkedListNode reverse = reverse(likedList.head);

        //Then

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], reverse.data);
            reverse = reverse.next;
        }
    }

}