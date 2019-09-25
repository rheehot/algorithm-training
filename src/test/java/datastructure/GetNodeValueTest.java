package test.java.datastructure;

import main.java.LinkedList;
import main.java.datastructure.GetNodeValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetNodeValueTest extends LinkedList {
    @Test
    public void test() {
        //Given
        int[] items = {3, 2, 1, 2};
        int position = 3;
        SinglyLinkedList likedList = createLikedList(items);

        //When
        int value = GetNodeValue.getNode(likedList.head, position);

        //Then
        assertEquals(3 , value);
    }

}