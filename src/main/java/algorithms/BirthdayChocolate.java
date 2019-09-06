package main.java.algorithms;

import java.util.List;

/**
 * 릴리는 초코랫바를 가지고 있다. 그녀가 그의 생일을 위해 론과 공유하기를 원하는 것입니다. 각 사각형에는 정수가 있습니다.
 * 그녀는 선택된 바의 연속적인 조각을 공유하기위서 결정합니다. 그런 조각의 길이는 론의 생월과 그의 생일과 같은 사각정 숫자의 합산과 일치합니다.
 * 당신은 그녀가 초코랫을 나눌 수 있는 방법이 몇개나 되는지 결정해야합니다.
 * <p>
 * 초코랫을 사갹형배열이라고 생각하세요. s = [2, 2, 1, 3, 2]. 그녀는 론의 생일(d = 4)의 합산 조각을 찾기를 원합니다.
 * m = 2 그의 생월과 같습니다. 이 경우 거기에 그녀의 기준에 만족하는 두조각이 [2, 2] 와  [1, 3] 있습니다.
 * <p>
 * 결론적으로
 * <p>
 * m = 2 두달 각 초코랫 2개
 * d = 4 4일 각 초코렛의 길이의 합산이 4
 * <p>
 * 두개의 초코랫을 더해서 (연속적으로) 초코랫의 길이의 합이 4인게 몇개이냐
 */
public class BirthdayChocolate {
    public static int birthday(List<Integer> s, int d, int m) {
        int result = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            Integer chocolateLength = s.subList(i, m + i).stream()
                    .reduce(0, Integer::sum);

            if (chocolateLength == d) result++;
        }

        return result;
    }

}
