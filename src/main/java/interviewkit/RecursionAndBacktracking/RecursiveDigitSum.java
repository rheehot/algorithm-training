package main.java.interviewkit.RecursionAndBacktracking;

/**
 * https://www.hackerrank.com/challenges/recursive-digit-sum
 *
 * 이문제는 148, 3 주어지면 148 개별 숫자 1, 4, 8 을 더하고 3을 곱한 값을 39를 다음 변수로
 * 넘겨서 반복한다 단 처음에만 3을 곱하고 이후에는 곱하지 않는다.
 *
 * 1+4+8 = 13 * 3 = 39 처음에만
 * 3+9 = 12
 * 1+2 = 3
 */
public class RecursiveDigitSum {
    public static int superDigit(String n, int k) {
        String sum = ""+n.chars().mapToLong(v -> v - '0').sum() * k;
        return sum.length() > 1 ? superDigit(sum, 1) : Character.getNumericValue(sum.charAt(0));
    }
}
