package main.java.programmers.codingTestKit.stackAndQueue;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Created by kimchanjung on 2020-01-17 2:06 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42583
 * 코딩테스트 연습
 * 스택/큐
 * 다리를 지나는 트럭
 *
 * 다리길이와  다리가 허용가능한 무게 가 있다
 * 다리길이 2, 무개 10
 * 각각 트럭의 무개 7,4,5,6
 * 1초에 1씩 이동한다
 *       1초  2초
 *            7
 *       7   --  4,5,6
 *
 *            3초
 *            4
 *       7   -- 5,6   4 + 5는 총 다리 무개 10 이하므로 같이 이동 가능
 *
 *           4 초
 *           45
 *       7   -- 6  4,5,6 은 총 다리묵 10 넘어가므로 4가 빠져 나가야함
 *          5 초
 *          5
 *     7,4  -- 5 + 6 도 10 초과 이므로 5가 빠져 나가야
 *           6초
 *           6
 *    7,4,5 --
 *
 *          7초
 *          6
 *    7,4,5 --
 *
 *        8초
 *   7,4,5,6 --
 *    총 8초 소요 됨
 *  큐를 이용하는건 맞는데 처음 생각 처럼 큐를 하나만 사용하서 하다보니 로직 자체가 것
 *  매끄럽지 못하고 딱떨어지는 모양세가 아니여서 접근자체가 잘못된 것
 *
 *  일단 다리에 해당하는 큐와, 트럭에 해당하는 큐를 생성한다
 *  다리 큐는 주어진 다리 길이에 맞게 0을 넣는다. 다리 길이가 2라면 아래와 같은 큐를 만든다.
 *
 *  다리  트럭
 *  00   7,4,5,6
 *
 *  다리가 빌 때 까지 루프를 돌린다,
 *  카운트   다리  트럭
 *    1     00   7,4,5,6
 *    2     07   4,5,6
 *    3     70   4,5,6
 *    4     04   5,6
 *    5     45   6
 *    6     50   6
 *    7     06
 *    8     6
 *
 */
public class Lessons42583 {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> trucks = new LinkedList(Arrays.stream(truck_weights).boxed().collect(Collectors.toList()));
        Queue<Integer> bridgeQueue = new LinkedList(IntStream.range(0, bridge_length).map(v -> 0).boxed().collect(Collectors.toList()));
        int count = 0;

        while (!bridgeQueue.isEmpty()) {
            count++;
            System.out.println("count = " + count + ", br = " + bridgeQueue.stream().map(v -> String.valueOf(v)).collect(Collectors.joining()) + ", t = " + trucks.peek());
            Integer poll = bridgeQueue.poll();
            if (!trucks.isEmpty()) {
                if (bridgeQueue.stream().mapToInt(v -> v).sum() + trucks.peek() <= weight) {
                    bridgeQueue.offer(trucks.poll());
                } else {
                    bridgeQueue.offer(0);
                }
            }
        }

        return count;
    }
}
