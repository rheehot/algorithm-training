package codility.lessons.prefixSums;

/**
 * Created by kimchanjung on 2020-03-06 3:19 오후
 * https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
 * [CountDiv]
 * [MEDIUM]
 *
 * A ~ B 까지의 수 중에 K 로 나누어 지는 수가 몇개 인지 찾는다
 *
 * 6 ~ 11 , 2로 나누어 지는 수는
 *
 * 6 8 10 3개다
 *
 * 특정 수 10 에서 2로 나누어 지는 수의 개수는
 * 2 4 6 8 10 5개 나온다 10 / 2 하면 5가 나오니 사실 해당 수에 나눠진 수가 개수가 되는데
 *
 * 6 부터 11 이라고 한다면 11 - (6-1, 6은 포함되어야 하니까) =  6 / 2 = 3 이 나온다
 * 그런데 A가 0 부터 시작이라면 그냥 B / k 하면 된다.
 *
 */
public class CountDiv {
    public static int solution(int A, int B, int K) {
        return A > 0 ? (B / K) - (A - 1) / K : B / K + 1;
    }
}
