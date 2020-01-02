package test.java.hackerrank.interviewkit.StacksAndQueues;

import main.java.hackerrank.interviewkit.StacksAndQueues.MinMaxRiddle;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxRiddleTest {

    @Test
    public void test() {
//        Queue<Long> queue = new LinkedList(LongStream.of(new long[]{2}).boxed().collect(Collectors.toList()));
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());


        assertArrayEquals(new long[]{12, 2, 1, 1}, MinMaxRiddle.riddle(new long[]{2,6,1,12}));
    }
}