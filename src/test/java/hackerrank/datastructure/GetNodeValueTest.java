package hackerrank.datastructure;

import hackerrank.LinkedListUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetNodeValueTest extends LinkedListUtil {
    @Test
    public void test() {
        //Given
        int[] items = {3, 2, 1, 2};
        int position = 3;
        SinglyLinkedList likedList = createLikedList(items, new SinglyLinkedList());

        //When
        int value = GetNodeValue.getNode(likedList.head, position);

        //Then
        assertEquals(3 , value);
    }

}