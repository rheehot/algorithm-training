package basicAlgorithms.search;

import java.util.Arrays;

/**
 * Created by kimchanjung on 2020-03-04 5:20 오후
 * LCS 최장 공통 부분수열
 * 두 문자열에서 공통인 인 것들 중 가장 큰것 즉 공통으로 포함된 문자열의 개수를 찾는 것임
 *
 * "ABC", "DEC" 있는 경우 두 문자열을 바탕으로 2차원 배열을 만드는데
 * 보통은 문자열에서 + 1 한 배열을 만들어
 * A 와 D 를 비교하여 같으면 배열의 대각선 값에 +1
 * 다르면 A 의 index에서 -1, B의 index에서 -1 곳의 값 중 큰 값을 저장한다.
 *     D E C
 *   0 0 0 0
 * A 0 0 0 0
 * B 0 0 0 0
 * C 0 0 0 1
 *
 * 그러나 재귀 방식에서 A, D 비교시 index가 0,0 이되고 비교값은 -1, -1 인데
 * 배열을 1 크게 만들지 않는 경우 더 직관적이고 index가 0 이하를 찾으면 그냥 0 리턴하게 하면된다.
 *
 * 재귀가 아닌경우에는 +1한 dp 배열을 만들어야함
 */
public class LCS {
    /**
     * 재귀 방식
     * @param a
     * @param b
     * @return
     */
    public static int lcs(String a, String b) {
        int[][] dp = new int[a.length()][b.length()];
        return recur(dp, a.toCharArray(), b.toCharArray(), a.length() - 1, b.length() - 1);

    }

    private static int recur(int[][] dp, char[] a, char[] b, int r, int c) {
        if (r < 0 || c < 0) return 0;
        if (dp[r][c] > 0) return dp[r][c];

        if (a[r] == b[c]) {
            return dp[r][c] = recur(dp, a, b, r - 1, c - 1) + 1;
        } else {
            return dp[r][c] = Math.max(recur(dp, a, b, r - 1, c), recur(dp,a, b, r,c - 1));
        }
    }

    /**
     * 루프를 이용한 방
     * @param a
     * @param b
     * @return
     */
    public static int lcs2(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        return dp[a.length()][b.length()];
    }
}
