package test.java.datastructure;

import main.java.LinkedList;
import main.java.datastructure.CycleDetection;
import org.junit.Test;

import static org.junit.Assert.*;

public class CycleDetectionTest extends LinkedList {

   @Test
    public void test() {
       //Given
       SinglyLinkedList likedList = createLikedList(new int[]{1, 2, 3});
       likedList.tail.next = likedList.head.next;

       //When
       boolean result = CycleDetection.hasCycle(likedList.head);
       //Then
   }
}