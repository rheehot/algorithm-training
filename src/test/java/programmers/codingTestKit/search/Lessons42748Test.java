package programmers.codingTestKit.search;

import programmers.codingTestKit.search.Lessons42748;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kimchanjung on 2020-01-13 2:47 오후
 */
public class Lessons42748Test {

    @Test
    public void test() {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] cmd = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Lessons42748.solution(arr, cmd);
    }
}