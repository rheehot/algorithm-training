package hackerrank.algorithms;

import java.util.List;

/**
 * 특정 배열에서 각 두요소의 차이 절대 값이 0, 1 인 수의 집합의 개수 중 제일 많은 개수를 찾는다
 *
 * 즉 1, 1, 2, 2, 4, 4, 5, 5, 5 있다면
 *
 * 1, 1, 2, 2 / 4, 4, 5, 5, 5 두개가 나오고
 *
 * 여기서 1 - 1 = 자|0|, 1 - 2 = |1| => 이렇게 그룹화 한 숫자들은 한 그룹에서 어떤 두수의 차이를 구해도 절대값이 0, 1인 수들만 모아 놓은 것
 *
 * 둘중에 4, 4, 5, 5, 5 => 5 개가 더 많으 므로 5가 정답
 *
 * 밑에 알고리즘은
 *
 * 각 수의 개수를 각 수를 index로 가지는 배열에 일단 카운트
 *
 * r[1] = 2
 * r[2] = 2
 * r[3] = 0
 * r[4] = 2
 * r[5] = 3
 *
 * 계산 할 때는 r[1] + r[2] , r[2] + [r3] 이렇게 하나 큰 자리의 숫자 개수를 더해서 제일 많은 수를 리턴하는데
 * 여기서 처음에는 이해가 안되었는데 여기서 r[1] + r[2] => 자기 보다 1 이 큰수의 개수를 더하는 것 즉 두수의 차이가 절대값 1 이 되는 두수의 개수만 서로 다하는
 * 꼴이 된다 즉 2, 3 / 3,4 / 4,5 이렇게 1 차이가 나는 숫자의 개수만 합산 하기 때문에 자연스럽게 절대값 1 ,0 인 숫자만 모이는 부분 집합이 되는 것
 * 그리고 그 수들의 개수를 더하면 절대값이 1, 0  인 숫자의 집합의 원소 개수가 제일 큰 것을 찾을 수 있는 원리임
 *
 */
public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        int result = 0;

        int[] itemCount = new int[101];
        for (Integer item : a) {
            itemCount[item]++;
        }

        for (int i = 1; i < itemCount.length-1; i++) {
            if (result < itemCount[i] + itemCount[i + 1]) result = itemCount[i] + itemCount[i + 1];
        }

        return result;
    }
}
