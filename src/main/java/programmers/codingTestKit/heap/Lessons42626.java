package main.java.programmers.codingTestKit.heap;

import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-01-28 3:11 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42626
 * 코딩테스트 연습
 * 힙(Heap)
 * 더 맵게
 *
 */
public class Lessons42626 {
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue(
                IntStream.of(scoville)
                        .boxed()
                        .collect(Collectors.toList()));

        while (pQueue.size() > 1 && pQueue.peek() < K) {
            pQueue.offer(pQueue.poll() + (pQueue.poll() * 2));
            answer++;
        }

        System.out.println(answer);
        return answer < K ? -1 : answer;
    }
}
