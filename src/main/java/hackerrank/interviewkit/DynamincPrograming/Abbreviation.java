package hackerrank.interviewkit.DynamincPrograming;

/**
 * [REMIND]
 * https://www.hackerrank.com/challenges/abbr/problem
 * 넘 어려움
 * a = baBcd
 * b = ABC
 * 두 문자열이 있다. b문자열이 a에 포함 되어야 한다 물론 b의 순서와 같으면서 포함된 문자열이다
 * 몇가지 조건은 a의 문자중 소문자는 삭제하거나 대문자로 치완할 수 있다.
 * a의 문자중 대문자는 삭제 활 수 없다
 *
 * 일단 다이나믹 프로그래밍 기법을 활용한다.
 *
 * 점화식을 세우는데
 * A00 = true (
 * Ann = 연속적으로 같아야 하므로 b의 첫번째이상 문자열과 a의 문자열들을 비교 시에는  a의 이전 문자, b의 이전 문자가 같 문자가 일치 하는 경우 만 true
 *     = 그외 a가 소문자이면 이전문자가 true 면 true
 */
public class Abbreviation {

    public static String abbreviation(String a, String b) {
        boolean[][] dp = new boolean[a.length() + 1][b.length() + 1];
        dp[0][0] = true;

        for (int i = 1; i <= a.length(); i++) {
            for (int j = 0; j <= b.length(); j++) {
                if (j > 0 && dp[i-1][j-1] && Character.toUpperCase(a.charAt(i - 1)) == b.charAt(j-1)) {
                    dp[i][j] = true;
                } else if (Character.isLowerCase(a.charAt(i - 1)) && dp[i - 1][j]) {
                    dp[i][j] = true;
                }
            }
        }

        return dp[a.length()][b.length()] ? "YES" : "NO";
    }

}
