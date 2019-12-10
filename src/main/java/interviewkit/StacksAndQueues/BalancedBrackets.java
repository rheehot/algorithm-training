package main.java.interviewkit.StacksAndQueues;

import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            Integer bracketNum = Integer.valueOf(s.charAt(i));

            if ("{([".contains(String.valueOf(s.charAt(i)))) {
                stack.push(bracketNum);
            } else {
                Integer popNum = bracketNum - (stack.isEmpty() ? 0 : stack.pop());
                if (popNum > 2 || popNum < 1) return "NO";
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}
