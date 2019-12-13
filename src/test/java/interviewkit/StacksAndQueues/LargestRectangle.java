package test.java.interviewkit.StacksAndQueues;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/largest-rectangle
 * 1 2 3 5 4 라는 높이가 있을 때
 *
 * 높이와 * 넚이 =  사각형 넓이 가 가장 큰 경우를 찾는다
 *
 *         3
 *        |5|4     5 * 1 =  5
 *       2| |4|    4 * 2 =  8
 *     1|3| | |    3 * 3 =  9  최대
 *   0|2| | | |    2 * 4 =  8
 *  |1| | | | |    1 * 5 =  5   값
 *
 *  해결책
 *
 *  일단 높이 배열을 루 프 돌린다
 *  스택이 비었거나 현재 높이가 이전 높이 보다 높거나 같으면  스택에 index를 저장한다. 그리고 인덱스 증가
 *  현재높이가 이전 높이 보다 낮으면 비교에 들어간다
 *   => 스택에서 index를 꺼내어 현재까지 현재 높이를 가져온다(현재까지 가장 높은 높이가 됨)
 *   => 현재높이(5)와 현재 인덱스에서 현재 높이 이전의 인덱스-1을 뺀값과(4 - 2 - 1 = 1) 곱한다 = 5 * 1 = 5
 *   => 인덱스를 증가 시키지 않는다 이유는 5까지 비교 처리만 한다 다음 높이 4를 처리 해야하기 때문
 *
 *  결론적으로 높이가 증가하면 스택에 인덱스를 저장하다가 높이가 낮아지면 값을 계산
 *  최종적으로 스택에는 1 2 3 4 높이만 저장 되어 있고
 *  증가하는 값만 있는 스택에서 비교 연산한다
 *   => 현재 높이 * (최종 index i - 이전 인덱스 - 1) 이 가장 넚은지 비교 하여 가장 넓은 값을 갱신한다.
 *   h[3] = 5(높이) * (index(4) - 2(5이전값 3의 인덱스 2) - 1) = 5 * 1 =  5
 *   h[4] = 4(높이) * (index(5) - 2(4이전값 3의 인덱스 2) - 1) = 4 * 2 =  8
 *   h[2] = 3(높이) * (index(5) - 1(3이전값 2의 인덱스 1) - 1) = 3 * 3 =  9  => max 넓이 됨
 *   h[1] = 2(높이) * (index(5) - 0(2이전값 1의 인덱스 0) - 1) = 2 * 4 =  8
 *   h[0] = 1(높이) * (1이 마지막이라 스택이 비었으므로 index(5))) = 1 * 5 =  5
 *
 */
public class LargestRectangle {
    public static long largestRectangle(int[] h) {
        long maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < h.length) {
            if (stack.empty() || h[stack.peek()] <= h[i]) {
                stack.push(i);
                i++;
            } else {
                maxArea = Math.max(maxArea, h[stack.pop()] * (stack.empty() ? i : i - stack.peek() - 1));
            }
        }

        while (!stack.empty()) {
            maxArea = Math.max(maxArea,(h[stack.pop()] * (stack.empty() ? i :   i - stack.peek() - 1)));
        }

        return maxArea;
    }
}
