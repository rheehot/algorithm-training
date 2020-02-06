package hackerrank.datastructure;

import hackerrank.LinkedListUtil;
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