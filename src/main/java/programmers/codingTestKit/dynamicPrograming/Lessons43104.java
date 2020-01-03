package main.java.programmers.codingTestKit.dynamicPrograming;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/43104
 * 이문제는 피보나치 수열 문제인데 문제가 좀 햇갈린다
 *
 * [1, 1, 2, 3, 5, 8, .]
 * 피보나치 수열 인데 위 숫자가 수열이 아니라 n 차에서 4변의 합 숫자가 수열이다 약간 꼬아 놓은 문제
 * [1, 1, 2,  3,  5,  8] 수열은 결국 아래와 같고
 * [4, 6, 10, 16, 26, 42]
 * an = a(n-2)+a(n-1)
 * 풀이 하면
 * |   | 3 |
 * | 5 |1|2|
 * |   |1| |
 *  점화식은 아래와 같다.
 *  a1 = 인경우 4변의 합 즉 4
 *  a2 = 2+2+1+1 = 6
 *  a3 = 2+2+3+3 = 10 ( a2 + a1)
 *  an = a(n-2)+a(n-1)
 */
public class Lessons43104 {
    private static long[] memo = new long[80];

    public static long solution(int n) {
        if (n == 1) return 4;
        if (n == 2) return 6;
        if (memo[n] > 0) return memo[n];
        return memo[n] = solution(n - 1) + solution(n - 2);
    }
}
