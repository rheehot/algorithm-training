package test.java.hackerrank.interviewkit.LinkedList;

import main.java.LinkedListNode;
import main.java.hackerrank.interviewkit.LinkedList.DetectACycle;
import org.junit.Test;

import static org.junit.Assert.*;

public class DetectACycleTest {

    @Test
    public void test() {

        LinkedListNode root = new LinkedListNode(1);
        root.next = new LinkedListNode(1);
        root.next.next = new LinkedListNode(1);
        root.next.next.next = new LinkedListNode(1);
        root.next.next.next.next = new LinkedListNode(1);
        root.next.next.next.next = root.next.next;

        assertEquals(true, DetectACycle.hasCycle(root));
    }
}