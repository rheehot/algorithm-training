package test.java.basicAlgorithms;

import main.java.basicAlgorithms.MinHeap;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-01-25 7:55 오후
 */
public class MinHeapTest {

    @Test
    public void test() {
        // 3 5 6 9 84 19 17 22 10
        /**
         * 3 5 6 9 84 19 17 22 10
         * 5 9 6 10 84 19 17 22
         * 6 9 17 10 84 19 22
         * 9 10 17 22 84 19
         * 10 19 17 22 84
         * 17 19 84 22
         *
         * 3 5 6 9 84 19 17 22 10
         * 5 9 6 10 84 19 17 22
         * 6 9 17 10 84 19 22
         * 9 10 17 22 84 19
         * 10 19 17 22 84
         * 17 19 84 22
         *
         * 3 5 6 9 84 19 17 22 10
         * 5 9 6 10 84 19 17 22
         * 6 9 17 10 84 19 22
         * 9 10 17 22 84 19
         * 10 19 17 22 84
         * 17 19 84 22
         */
        MinHeap minHeap = new MinHeap();
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);
        minHeap.print();
        minHeap.poll();
        minHeap.print();
        minHeap.poll();
        minHeap.print();
        minHeap.poll();
        minHeap.print();
        minHeap.poll();
        minHeap.print();
        minHeap.poll();
        minHeap.print();

    }
}