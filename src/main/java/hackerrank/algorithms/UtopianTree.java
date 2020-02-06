package hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/utopian-tree
 *
 * 0  1  2  3  4  5   6
 * 1, 2, 3, 6, 7, 14, 15
 *
 * 2, 4, 8 ,16
 *
 * 공비가 2인 등비 수열에서
 * 홀수N번의 수들은 짝수 이며 등비 수열에서 -2 한 값과 일치한다
 *
 * 4  - 2 =  2 (1번째)
 * 8  - 2 =  6 (3번째)
 * 16 - 2 = 14 (5번째)
 *
 * 짝수N뻔째 수들은 등비수열에서 -1 한 값과 일치한다.
 *
 * 4  - 1 = 3
 * 8  - 1 = 7
 * 16 - 1 = 15
 *
 * 등비수열의 일반항은 ar^(n-1) 인데 여기서 지수를 결정짓는 공식이 중요함
 *
 * (n + 1)/2 하면 1번째는 = 지수가 1, 3번째는 지수가 = 2
 * 즉 등비 수열에서 - 2 는 원래 수열 홀수 번째 값
 * ar^1 = 4 - 2 = 2 (원래 수열 1번째 = 1번째)
 * ar^2 = 8 - 2 = 6 (원래 수열 3번째 = 2번째)
 *
 * 등비수열에서 원래 수열 짝수 번째는 -2 대신 -1 하면 된다
 *
 * 즉 n이 0일 때 1리턴
 * n이 홀수이면 ar^((n+1)/2) - 2 = 2 *( 2^((n+1)/2) -2
 * n이 짝수이면 ar^((n+1)/2) - 1 = 2 *( 2^((n+1)/2) -1
 *
 *
 */
public class UtopianTree {
    public static int utopianTree(int n) {
        return (int) (2 * Math.pow(2, (n + 1) / 2)) - ((n % 2) + 1);
    }

}
