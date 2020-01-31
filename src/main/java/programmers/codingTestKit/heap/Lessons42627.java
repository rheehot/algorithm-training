package main.java.programmers.codingTestKit.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by kimchanjung on 2020-01-30 3:14 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42627
 * 코딩테스트 연습
 * 힙(Heap)
 * 디스크 컨트롤러
 *
 * 너무 어려운 문제였다. ......
 */
public class Lessons42627 {

    public static int solution(int[][] jobs) {
        int endTime = 0, total = 0, idx = 0;
        Arrays.sort(jobs, Comparator.comparingInt(v -> v[0]));
        PriorityQueue<int[]> q = new PriorityQueue<>(Comparator.comparingInt(p -> p[1]));

        while (!q.isEmpty() || idx < jobs.length) {
            if (idx < jobs.length && endTime >= jobs[idx][0]) {
                q.offer(jobs[idx++]);
            } else if (!q.isEmpty()) {
                int[] poll = q.poll();
                endTime +=poll[1];
                total += endTime - poll[0];
            } else {
                endTime = jobs[idx][0];
            }
        }

        return total / jobs.length;
    }
}
