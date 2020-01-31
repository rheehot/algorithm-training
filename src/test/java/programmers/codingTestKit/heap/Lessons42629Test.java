package test.java.programmers.codingTestKit.heap;

import main.java.programmers.codingTestKit.heap.Lessons42629;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-01-28 4:24 오후
 */
public class Lessons42629Test {

    @Test
    public void test() {
//        int[] arr = {4, 10, 15};
//        int id = 0;
//        System.out.println(arr[id++]);
        assertEquals(2, Lessons42629.solution(4, new int[]{4, 10, 15}, new int[]{20, 5, 10}, 30));
    }
}