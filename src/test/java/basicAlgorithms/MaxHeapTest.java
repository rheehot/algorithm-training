package basicAlgorithms;

import basicAlgorithms.MaxHeap;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-01-28 2:31 오후
 */
public class MaxHeapTest {

    @Test
    public void test() {

        MaxHeap maxHeap = new MaxHeap();
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        maxHeap.print();
        maxHeap.poll();
        maxHeap.print();
        maxHeap.poll();
        maxHeap.print();
        maxHeap.poll();
        maxHeap.print();
        maxHeap.poll();
        maxHeap.print();
        maxHeap.poll();
        maxHeap.print();
    }
}