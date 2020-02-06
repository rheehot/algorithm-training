package programmers.codingTestKit.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by kimchanjung on 2020-01-28 4:23 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42629
 * 코딩테스트 연습
 * 힙(Heap)
 * 라면공장
 *
 * 목표 날짜 까지 루프를 돈다
 * 날짜가 하루씩 증가하고, stock은 날짜가 증가할때 마다 1씩 줄어든다
 * 해당 날짜와 dates의 첫번째 값이 날짜가 일치하면 밀가루 수를 최대값 큐에 넣는다.
 * stock이 비는 경우 공급받은 밀가루 중 가장 큰 톤수의 밀가루를 stock 넣는다 이때 공급 받는 수 +1 증가
 */
public class Lessons42629 {
    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0, idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());

        for (int i = 0; i < k ; i++) {
            if (dates.length > idx && i >= dates[idx]) {
                pq.offer(supplies[idx++]);
            }

            if (stock == 0) {
                stock = pq.poll();
                answer++;
            }

            stock--;
        }

        return answer;
    }
}
