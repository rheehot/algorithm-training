package programmers.codingTestKit.stackAndQueue;

import java.util.Stack;
import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-01-21 2:02 오후
 * https://programmers.co.kr/learn/courses/30/lessons/42585
 * 코딩테스트 연습
 * 스택/큐
 * 쇠막대기
 */
public class Lessons42585 {
    public static int solution(String arrangement) {
        Stack<Character> stack = new Stack();
        int size = 0;

        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(') {
                stack.push(arrangement.charAt(i));
            } else {
                stack.pop();
                size += arrangement.charAt(i - 1) == '(' ? stack.size() : 1;
            }
        }

        return size;
    }
}
