package basicAlgorithms;

import java.util.Arrays;
import java.util.Stack;

/**
 * Stock Span 문제
 * 그림과 같이 높이가 있는 경우 왼쪽 방향으로 자기 높이에서 직선을 쏜다고 가정했을 때
 * 누가 수신 받는지를 찾는 것
 * 예를 들면 5는 9가 수신 받으므로 9의 인덱스 2, 7역시 9의 인덱스 2, 4는 7이 수신 받으므로 인덱스 4
 * (인덱스는 1부터 시작)
 *
 *        <-----|9|
 *              | |<--------|7|
 *              | |         | |
 * <------|6|   | |         | |
 *        | |   | |<--|5|   | |
 *        | |   | |   | |   | |<--|4|
 *
 *         0     0     2     2     4
 *
 * 핵심은 각 숫자들을 루프를 돌면서 스택에 저장하는데 그와중에
 * 본인보다 스택의 top이 낮은 애들을 모두 제거 해서 수신 받을 애가 있는지 체크 한다.
 *
 * 1. 스택에 숫자가 있고, 본인보다  큰 숫자가 있을 때 까지 본인보다 낮은 애들은 스택에서 다 제거 한다.
 * 2. 스택에서 본인 보다 낮은 애들을을 다 제거 한 후 스택이 비었다면 낮은 애들 말고 높은 애들이 없다는 이야기가 되서 수신받는 애들이 없다는 뜻
 * 3. 스택에 숫자가 남았으면 top 이 본인을 수신 받는다.
 * 4. 본인을 스택에 저장한다.
 *
 */

public class StockSpanProblem {

    public static int[] stockSpan(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <  arr.length; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? 0 : stack.peek()+1;
            stack.push(i);
        }

        Arrays.stream(result).forEach(v -> System.out.print(v+" "));
        System.out.println();

        return result;
    }
}
