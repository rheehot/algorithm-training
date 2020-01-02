package test.java.hackerrank.datastructure;

import main.java.LinkedListUtil;
import main.java.datastructure.CycleDetection;
import org.junit.Test;

public class CycleDetectionTest extends LinkedListUtil {

   @Test
    public void test() {
       //Given
       SinglyLinkedList likedList = createLikedList(new int[]{1, 2, 3}, new SinglyLinkedList());
       likedList.tail.next = likedList.head.next;

       //When
       boolean result = CycleDetection.hasCycle(likedList.head);
       //Then
   }
}