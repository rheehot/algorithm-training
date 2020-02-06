package programmers.codingTestKit.stackAndQueue;

import java.util.Arrays;
import java.util.Stack;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42588
 * []
 */
public class Lessons42588 {
    public static int[] solution(int[] heights) {
        int[] result = new int[heights.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <  heights.length; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] <= heights[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? 0 : stack.peek()+1;
            stack.push(i);
        }

        return result;
    }
}
