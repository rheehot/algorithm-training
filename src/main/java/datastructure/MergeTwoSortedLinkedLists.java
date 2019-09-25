package main.java.datastructure;

import com.sun.org.apache.xml.internal.serializer.utils.StringToIntTable;
import com.sun.xml.internal.ws.util.StringUtils;
import main.java.LinkedList;

public class MergeTwoSortedLinkedLists extends LinkedList {
    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        System.out.println("call mergeList head1 = " + getData(head1) + ", head2 = " + getData(head2));

        if (head1 == null) {
            return head2;
        } else if (head2 == null) {
            return head1;
        }

        if (head1.data < head2.data) {
            head1.next = mergeLists(head1.next, head2);
            System.out.println("head1.next = " + getData(head1.next)+", head1 = "+getData(head1));
            return head1;
        } else {
            head2.next = mergeLists(head2.next, head1);
            System.out.println("head2.next = " + getData(head1.next)+", head2 = "+getData(head1));
            return head2;
        }
    }
}
