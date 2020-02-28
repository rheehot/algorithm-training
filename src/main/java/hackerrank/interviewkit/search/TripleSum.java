package hackerrank.interviewkit.search;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/triple-sum
 * [Triple sum]
 * [MEDIUM]
 *
 * a = 1 3 5
 * b = 2 3
 * c = 1 2 3
 *
 * 각 라인별 숫자의 조합의 개수를 찾는다.
 * 조건은 a <= b, c <= b 은 숫의 조합으로 개수를 찾는 것
 *
 * 해결책
 * 1. 일단 각 라인별  중복 숫 제거하고 오름차순 정렬한다.
 *
 * 1 3 5
 * 2 3
 * 1 2 3
 *
 * 2. 2 이하 케이스 1,2,1 | 1,2,2 2
 *    3 이하 1,3,1 | 1,3,2 | 1,3,3 | 3,3,1 | 3,3,2 | 3,3,3개 6개
 *    => 이 케이스를 보면 3 이하 인 a 2개(1,2), c는 3개(1,2,3) 즉 2 * 3  = 6 이렇게 나오는 것
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
