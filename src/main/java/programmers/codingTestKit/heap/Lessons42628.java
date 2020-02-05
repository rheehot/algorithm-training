package main.java.programmers.codingTestKit.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by kimchanjung on 2020-02-02 3:00 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42628
 * 코딩테스트 연습
 * 힙(Heap)
 * 이중우선순위큐
 */
public class Lessons42628 {
    public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> maxQ = new PriorityQueue(Collections.reverseOrder());
        PriorityQueue<Integer> minQ = new PriorityQueue();

        for (int i = 0; i < operations.length; i++) {
            String[] str = operations[i].split(" ");
            if (str[0].equals("I")) {
                maxQ.offer(Integer.valueOf(str[1]));
                minQ.offer(Integer.valueOf(str[1]));
            } else if (str[0].equals("D")) {
                if (str[1].equals("1")) {
                    minQ.remove(maxQ.poll());
                } else {
                    maxQ.remove(minQ.poll());
                }
            }
        }

        answer[0] = maxQ.peek() != null ? maxQ.poll() : 0;
        answer[1] = minQ.peek() != null ? minQ.poll() : 0;

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
