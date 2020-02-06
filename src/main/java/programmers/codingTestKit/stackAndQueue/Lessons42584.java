package programmers.codingTestKit.stackAndQueue;

import java.util.Stack;

/**
 * Created by kimchanjung on 2020-01-21 3:01 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42584
 * 코딩테스트 연습
 * 스택/큐
 * 주식가격
 */
public class Lessons42584 {
    public static int[] solution2(int[] prices) {
        int[] ret = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int count = 0;
            for (int j = i + 1; j < prices.length; j++) {
                count++;
                if (prices[i] > prices[j]) break;
            }

            ret[i] = count;
        }

        return ret;
    }

    public static int[] solution(int[] prices) {
        Stack<Integer[]> stack = new Stack<>();
        int[] ret = new int[prices.length];

        for (int i = prices.length - 2; i >= 0; i--) {
            int day = 1;

            while (!stack.isEmpty() && stack.peek()[0] >= prices[i]) {
                day += stack.pop()[1];
            }

            ret[i] = stack.push(new Integer[]{prices[i], day})[1];
        }

        return ret;
    }
}
