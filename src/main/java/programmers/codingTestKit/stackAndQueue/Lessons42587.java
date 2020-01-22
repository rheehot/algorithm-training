package main.java.programmers.codingTestKit.stackAndQueue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-01-21 11:44 오전
 * https://programmers.co.kr/learn/courses/30/lessons/42587
 * 코딩테스트 연습
 * 스택/큐
 * 프린터
 */
public class Lessons42587 {
    public static int solution(int[] priorities, int location) {
        int order = 0;
        Queue<Integer> queue = new LinkedList(IntStream
                .of(priorities)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length ; i++) {
                if (priorities[i] == queue.peek()) {
                    queue.poll();
                    order++;
                    if (location == i) {
                        queue.clear();
                        break;
                    }
                }
            }
        }


        return order;
    }
}
