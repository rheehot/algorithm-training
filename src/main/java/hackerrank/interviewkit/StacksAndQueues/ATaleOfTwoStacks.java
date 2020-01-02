package main.java.hackerrank.interviewkit.StacksAndQueues;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks
 * 숫자가 들어오면 stack으로 만 큐를 만들어 내는 문제 이다 입력과 출력, 삭제를 큐의 작동방식에 맞게 구현한
 * 입력 1
 * 입력 2
 * 입력 3
 * 맨처음 값 출력 1
 * 맨처음 값 1 삭제
 *
 * 해결책
 *
 * 첫번째 값이 들어오면 일단 stackOldestOnTop 에 입력 한다 => 여기는 맨처음 값만 저장되어 있다
 * 이후 값은 stackNewestOnTop 저장한다 그러면 1, 2, 3 값이 들어 온다면
 * ot  nt
 *     3
 * 1   2
 * 이렇게 구성된다 그래서 큐에서 처럼 pop 하면 1을 내보낸다( 자료구조가 stack이라서 첫번째 값이 후에 들어온 값들은 stackNewestOnTop 계속 저장한다)
 *
 * 1을 내보내면 stackOldestOnTop => 0이므로 stackNewestOnTop에서 데이터를 pop 해서 stackOldestOnTop push 하면 stack의 반대로 입력 되기 때문에
 * 마치 큐 처럼 데이터가 구성되어 버린다.
 * ot nt
 * 2
 * 3
 * 다음 4 5 입력
 * ot nt
 * 2  5
 * 3  4
 * 그리고 pop을 하면 ot에 있는 값을 pop 하면 큐 자료 구조 순서로 pop 된다
 * => ot 비워 지면 다시 nt -> ot 옯기는 식으로 처리한다.
 */
public class ATaleOfTwoStacks {
    public static class MyQueue<T> {
        Stack<T> stackNewestOnTop = new Stack<T>();
        Stack<T> stackOldestOnTop = new Stack<T>();

        public void enqueue(T value) { // Push onto newest stack
            if (stackOldestOnTop.empty()) {
                stackOldestOnTop.push(value);
            } else {
                stackNewestOnTop.push(value);
            }
        }

        public T peek() {
            return stackOldestOnTop.peek();
        }

        public T dequeue() {
            T pop = stackOldestOnTop.pop();
            if (stackOldestOnTop.empty()) {
                while (!stackNewestOnTop.empty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
            return pop;
        }
    }
}
