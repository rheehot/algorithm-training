package leetcode.topInterViewQuestions.easy.dynamicPrograming;

/**
 * Created by kimchanjung on 2020-02-14 6:25 오후
 * https://leetcode.com/problems/climbing-stairs/
 * [Climbing Stairs]
 * 유명하면서도 기본적인 문제
 * 계단을 오르는 방법이 몇개 인지 푸는 문제이다
 * 피보나치 수열 이면서 알고리즘은 dynamic programing 으로 해결한다.
 *
 * 일단 계단을 오르는 방법이 주어진다
 * 1칸 오르는 방법과
 * 2칸 오르는 방법 2가지가 주어졌을 때(계단 오르는 방법이 많으면 문제는 그에 따라 달라진다)
 *
 * a1 = 1 가지 방법 (1칸만 올라가는 방법 뿐이다)
 * a2 = 2 가지 방법 (1칸씩 2번 올라가는 방법, 2칸을 1번에 올라가는 방법 2가지이다)
 * a3 = a2 + a1 이 된다.
 * ...
 * an = a(n-1) + a(n-2)
 * 된다.
 */
public class ClimbingStairs {
    
    public static int climbStairs(int n) {
        return climb(n, new int[n + 1]);
    }

    private static int climb(int n, int[] dp) {
        if (n <= 2  ) return n;
        if (dp[n] > 0) return dp[n];
        return dp[n] = climb(n-1, dp) + climb(n - 2, dp);
    }
}
