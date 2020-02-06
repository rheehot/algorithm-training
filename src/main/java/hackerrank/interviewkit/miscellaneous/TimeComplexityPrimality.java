package hackerrank.interviewkit.miscellaneous;

/**
 * https://www.hackerrank.com/challenges/ctci-big-o/problem
 * 소수(1과 자기자신만으로 나눠지는 수)
 * 소수 판별
 * 판별 과정을 줄이기 위하여
 * 판별 숫자의 2부터 제곱근(9 => 3) 까지의 숫자로 나눠 떨어지는지 판별
 *
 */
public class TimeComplexityPrimality {
    public static String primality(int n) {
        if (n == 1) return "Not prime";
        int sqrt = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) return "Not prime";
        }

        return "Prime";
    }
}
