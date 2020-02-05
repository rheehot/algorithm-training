package test.java.smallFunctions;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by kimchanjung on 2020-01-30 4:04 오후
 */

public class PriorityQueueTest {

    public class QTest implements Comparable<QTest> {
        public int a;
        public int b;

        public QTest(int[] arr) {
            this.a = arr[0];
            this.b = arr[1];
        }

        @Override
        public int compareTo(QTest test) {
            return this.a - test.a;
        }
    }

    @Test
    public void 우선순위큐_선언() {
        int[][] arrs = {{0, 3}, {1, 9}, {2, 6}};
        PriorityQueue<QTest> pq = new PriorityQueue(Arrays.stream(arrs).map(QTest::new).collect(Collectors.toList()));;
        pq.forEach(v -> System.out.println(v.a + "," + v.b));

        PriorityQueue<QTest> q = Arrays.stream(arrs).map(QTest::new).collect(Collectors.toCollection(PriorityQueue::new));
        q.forEach(v -> System.out.println(v.a + "," + v.b));
    }

    @Test
    public void 큐의_테이터_타입이_배열일때() {
        int[][] arr = {{1, 9}, {2, 6}, {0, 3}};
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(p -> p[0]));
        q.addAll(Arrays.asList(arr));

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            System.out.println(poll[0]+", "+poll[1]);
        }
    }
}