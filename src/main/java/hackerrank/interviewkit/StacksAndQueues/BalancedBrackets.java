package main.java.hackerrank.interviewkit.StacksAndQueues;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/balanced-brackets
 * {{()}} => 브라켓이 짝으로 잘 맞게 있는지 확인
 * {([)]} => 이런것 틀림으로 찾는다.
 */
public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Integer> stack = new Stack<>();

        for (int ch : s.toCharArray()) {
            if ("{([".contains(String.valueOf((char) ch))) {
                stack.push(ch);
            } else {
                int popNum = ch - (stack.isEmpty() ? 0 : stack.pop());
                if (popNum > 2 || popNum < 1) return "NO";
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}
