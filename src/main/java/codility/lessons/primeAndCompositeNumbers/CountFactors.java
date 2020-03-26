package codility.lessons.primeAndCompositeNumbers;

/**
 * Created by kimchanjung on 2020-03-10 3:45 오후
 * https://app.codility.com/programmers/lessons/10-prime_and_composite_numbers/count_factors/
 * [CountFactors]
 * [EASY]
 * <p>
 * 특정 숫자의 약수의 개수를 모두 구하는 문제
 */
public class CountFactors {
    public static int solution(int N) {
        int ret = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (i ==  Math.sqrt(N)) {
                ret++;
            } else if (N % i == 0) {
                ret += 2;
            }

        }

        return ret;
    }
}
