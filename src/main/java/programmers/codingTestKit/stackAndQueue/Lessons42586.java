package programmers.codingTestKit.stackAndQueue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-01-20 3:47 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42586
 * 코딩테스트 연습
 * 스택/큐
 * 기능개발
 *
 * 큐를 사용해서 푸는 문제지만 사실 큐로 안풀어도 됨....
 */
public class Lessons42586 {

    public static int[] solution2(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>(IntStream.range(0, speeds.length).
                mapToObj(i -> (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1)
                .collect(Collectors.toList()));

        int day = queue.poll(), cnt = 1;

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if (day >= poll) {
                cnt++;
            } else {
                list.add(cnt);
                day = poll;
                cnt = 1;
            }

        }

        list.add(cnt);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }


    public static int[] solution(int[] progresses, int[] speeds) {
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        int day = 1;

        for (int i = 0; i < speeds.length; i++) {
            if (100 > speeds[i] * day + progresses[i]) {
                day = (100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] == 0 ? 0 : 1);
            }
            map.merge(day, 1, (o, n) -> o + n);
        }

        return map.values().stream().mapToInt(Integer::intValue).toArray();
    }


}
