package hackerrank.interviewkit.search;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/triple-sum
 * [Triple sum]
 * [MEDIUM]
 *
 * 아래와 같은 입력 값이 주어진다
 * 3 3 3 -> 각 라인별 숫자의 개수 정보
 * 1 4 5
 * 2 3 3  => 총 9개의 숫자로 처리 하는 것임
 * 1 2 3
 *
 * (1,2,1) , (1,2,2), (1,2,3) (1,3,1) (1,3,2).... 이런식으로 조합을 하는데.
 * 특별한 조건이 있다
 * 3개의 각 라인 숫자가 주어지면
 * 조건은 1번라인숫자 <= 2번라인숫, c번라인숫자 <= 2번라인숫자 를 만족하는 케이스만 찾는 것
 * 즉
 * 1,2,1 => 만족
 * 1,2,2 => 만족
 * 1,2,3 => 2번보다 3이 크기 때문에 제외
 * 4,2,1 => 4번이 2번보다 크기 때문에 제외
 *
 *
 * 해결책
 * 1. 일단 각 라인별  중복 숫자를  제거하고 오름차순 정렬한다.
 *
 * 1 3 5
 * 2 3
 * 1 2 3
 *
 * 2. 2 이하 케이스 1,2,1 | 1,2,2 2
 *    3 이하 1,3,1 | 1,3,2 | 1,3,3 | 3,3,1 | 3,3,2 | 3,3,3개 6개
 *    이 케이스를 보면 3 이하 인 a 2개(1,2), c는 3개(1,2,3) 즉 2 * 3  = 6 이렇게 나오는 것
 *
 * 3. b의 아이템을 루프 돌면서 각각 b값 이하의 a 개수  c 개수 를 곱한 값을 합산 값이 케이스 개수가 됨
 */
public class TripleSum {
    public static long triplets(int[] a, int[] b, int[] c) {
        int[] p = Arrays.stream(a).distinct().sorted().toArray();
        int[] q = Arrays.stream(b).distinct().sorted().toArray();
        int[] r = Arrays.stream(c).distinct().sorted().toArray();
        long count = 0;
        int i = 0, j = 0, k = 0;

        while (i < q.length) {
            while (j < p.length && p[j] <= q[i]) {
                j++;
            }

            while (k < r.length && r[k] <= q[i]) {
                k++;
            }

            count += (long) j * k;
            i++;
        }

        return count;
    }
}
