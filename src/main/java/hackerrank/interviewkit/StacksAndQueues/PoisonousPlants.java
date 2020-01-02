package main.java.hackerrank.interviewkit.StacksAndQueues;

import java.util.Arrays;
import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/poisonous-plants/
 *
 * 4 3 7 5 6 4 2 있다고 하면
 * 바로 앞 숫자가 작으면 죽고 반대면 살아 남는다
 *
 * 0  - 4 3 7 5 6 4 2
 * 1  - 4 3 5 4 2
 * 2  - 4 3 4 2
 * 3  - 4 3 2
 * 더이상 죽을 숫자가 없어 질 때 까지 3일 이 걸린다. 몇일이 걸리는지 찾는 문제
 *
 * 이 문제는 Stock Span Problem을 이용하여 해결한다.
 *
 *          |7|
 *          | |     |6|
 *          | | |5| |5|
 *  |4|     | | | | | | |4|
 *  | | |3| |3| |3| | | |3|
 *  | | | | | | | | | | | | |2|
 *  | | | | | | | | | | | | | |
 *
 *  7 => 3 때문에 죽는다 1일 걸림
 *  5 => 7 때문에 살고 7이 죽고 난 후 3 때문에 죽는다 5가 죽는 날은 7의 죽는날 + 1
 *  6 => 5 때문에 죽는다 1일 걸림
 *  4 => 6 때문에 살고 6이 죽고 난후 또 5 때문에 산다 마지막으로 5가 죽으면 3 때문에 죽는다. 4 가 죽는 날은 5가 죽는날 +1 이다.
 *  이중 가장 높은 날은 3 이고 최종 적으로 3일 후에 죽는 숫자가 모두 죽게 된다.
 *
 *
 *  위 처럼 각 숫자가 죽임을 당할하는 숫자를 표시 했다
 *  7 <- 3 , 5 <- 3, 6 <- 5, 4 <- 3 각각 7,5,4는 3 때문에 죽고 , 6은 5 때문에 죽는다.
 *
 *  숫자들을 루프 돌면서 스택에 넣는다.
 *
 *    1. 스택이 안 비었고, 스택의 top이 현재 숫자 보다 크면 계속 pop 한다.
 *    2. pop을 하면서 추출된 숫자들의 day 값중 max를 저장한다.
 *    3. 스택 pop이 끝고 현재 stack이 비었다면 day 값을 0, 아니라면 pop 하던 숫자들 중 가장 높은 day + 1 한다
 *       => 스택이 비었다면 앞의 값들이 큰값이라는 뜻 즉 살아 있게 되는 값이 되고
 *       => 스택이 비어 있지 않다면 앞의 값들이 더 작은 값이라 죽게 되는 값이 된다.
 *       => 죽게 되는 값들은 처음 0 -> 1일 후에 죽게 되므로 각 숫자의 day 값에 1이 저장되게 된다
 *       => 3 7 5를 예를 들면 7은 3때문에 죽지만 5는 7 때문에 살게 된다 하지만 7이 죽고 난 다음에는 3 때문에 죽게 되는 케이스라
 *       => 5 보다 7이 커서 pop을 했고 3은 5보다작아서 pop을 하지 않았다 즉 나중에 3 때문에 죽게 될 것이므로 7이 죽게 되는 day + 1 에 5는 죽게 된다.
 *       => 그래서 5가 stack에 push 될때는 7의 day+1 이 5의 day에 들어 가게 된다.
 *    4. day는 각각 maxDay중 더큰 값을 maxDay저장하고 , 루프에서 현재 요소인 숫자를 stack에 저장 할때 day값을 저장한다.
 *    5. 최종 적으로 루프가 끝나면 maxDay를 리턴한다.
 *
 */
public class PoisonousPlants {
    public static int poisonousPlants(int[] p) {
        Arrays.stream(p).forEach(v -> System.out.printf(v + " "));
        System.out.println();
        Stack<Integer[]> stack = new Stack<>();
        int maxDay = 0;

        for (int i = 0; i < p.length ; i++) {
            int popMaxDay = 0;
            System.out.print(i + ") num = " + p[i] + " popMaxDay = " + popMaxDay + ", maxDay = " + maxDay + ", stack = ");
            stack.forEach(v -> System.out.print(v[0] + "," + v[1] + " "));
            System.out.println();
            while (!stack.isEmpty() && stack.peek()[0] >= p[i]) {
                popMaxDay = Math.max(popMaxDay, stack.pop()[1]);
            }

            popMaxDay = stack.isEmpty() ? 0 : popMaxDay + 1;
            maxDay = Math.max(maxDay, popMaxDay);

            stack.push(new Integer[]{p[i], popMaxDay});

        }

        System.out.println(maxDay);
        return maxDay;
    }
}
