package codility.lessons.stacksAndQueues;

import java.util.Stack;

/**
 * Created by kimchanjung on 2020-03-06 5:06 오후
 * https://app.codility.com/programmers/lessons/7-stacks_and_queues/brackets/
 * [Brackets]
 * [EASY]
 *
 * 브라켓 즉 {[()()]} 올바르게 괄호과 매겨 져 있는 지 확인 문제
 * ([)()] <= 되면 올바르지 않음
 *
 * 스택에 {, [, ( 여는 괄호를 넣고 닫는 괄호가 나왔을 때
 * 스택에서 꺼내서 같은 기호인지 확인 하고 아니면 올바르지 않음
 *
 * 일단 너저분한 코드를 줄이기 위해서
 * 괄호 문자를 아스키 코드로 저장한다 {, [, ], } 는 각각 아스키 코드상 차이가 2만큼 나고
 * () 경우는 아스키코드 상 1 만큼 난다 즉 닫는 괄호에서 여는 괄호를 뺀 수가 1, 2일 경우 일치한다고
 * 보면된다. 아니면 올바르지 않은 괄호 여닫기가 됨
*
 */
public class Brackets {
    public static int solution(String S) {
        Stack<Integer> stack = new Stack<>();

        for (int ch : S.toCharArray()) {
            if ("{([".contains(String.valueOf((char) ch))) {
                stack.push(ch);
            } else {
                int popNum = ch - (stack.isEmpty() ? 0 : stack.pop());
                if (popNum > 2 || popNum < 1) return 0;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
