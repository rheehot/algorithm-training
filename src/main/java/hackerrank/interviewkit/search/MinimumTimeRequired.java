package hackerrank.interviewkit.search;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/minimum-time-required
 * [Minimum Time Required]
 * [MEDIUM]
 * [REMIND]
 *
 *  [2, 3, 2] 라는 배열이 주어지는데
 *  이 배열의 요소는 3개 제품을 만들어 내는 기계 이고 각 숫자의 의미는 해당 날짜가 지나면 1개의 제품을 만들어 낸다
 *  즉
 *  2  => 2틀 지나면 1개
 *  3  => 3일 지나면 1개
 *  2  => 2틀 지나면 1개
 *
 *  각 기계들은 동시에 작동하고 해당 날짜가 되면 1개 제품을 만들어 낸다.
 *  기계      1일, 2일, 3일 .. 8일
 *  2        0   1    0
 *  3        0   0    1
 *  2        0   1    0
 *
 *  누적합계   0   2    3 .. 10개(목표 값)
 *  즉 목표하는 제품의 개수를 만들어면 몇일이 필요하느냐를 구하는 문제
 *  이진 탐색 알고리즘을 사용하여 해결한다.
 *
 *  즉 가장 큰 날짜를 가지는 기계가 목표 값을 만들어낼때 필요한 날짜를 max로 하고
 *  범위를 0 ~ max
 *  이 범위의 중간 날짜에 각 기계가 만들어 내는 제품의 수가 목표 보다 큰지 작은지
 *  구분하여 범위를 줄여 나간다.
 *
 *  3이 가장 크고 10개를 만들어 내려면 30일 이 걸린다.
 *  0 ~ 30을 범위로 두로
 *  중간 15 에서 각 기계가 만들수 있는 제품이 10 보다 작으면
 *  16 ~ 30 사이에 있다 반대면
 *  0 ~  14 사이에 있게 되는것
 *  이렇게 목표 값에 맞게 날짜 범위를 선택해서 이진 탐색을 해나간다.
 *
 */
public class MinimumTimeRequired {
    public static long minTime(long[] machines, long goal) {
        long max = Arrays.stream(machines).max().getAsLong() * goal;
        long min = 0;

        while (min < max) {
            long day = (min + max) / 2;
            long sum = Arrays.stream(machines).map(v -> day / v).sum();

            if (sum < goal) {
                min = day + 1;
            } else {
                max = day;
            }
        }

        return max;
    }


}
