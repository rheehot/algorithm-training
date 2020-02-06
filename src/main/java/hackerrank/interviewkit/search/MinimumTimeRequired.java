package hackerrank.interviewkit.search;

import java.util.Arrays;

/**
 * [REMIND]
 * https://www.hackerrank.com/challenges/minimum-time-required
 *  2 , 3 있다
 *  2틀에 1개 생성
 *  3일에 1개 생성
 *  5개 생성 될려면
 *
 *    1 2 3 4 5 6
 *  2   1   1   1
 *  3     1     1
 *  총 6일 이면 5개 생성된다
 *  몇일이 걸리느냐 찾는 문제
 *
 */
public class MinimumTimeRequired {
    public static long minTime(long[] machines, long goal) {
        long max = Arrays.stream(machines).max().getAsLong() * goal;
        long min = 0;

        while (min < max) {
            long day = (min + max) / 2;
            long sum = Arrays.stream(machines).map(v -> day / v).sum();
            System.out.println("day = "+day+", sum = "+sum+", min = "+min+", max = "+max);
            if (sum < goal) {
                min = day + 1;
            } else {
                max = day;
            }
        }

        return max;
    }


}
