package basicAlgorithms;

/**
 * Created by kimchanjung on 2020-03-13 4:03 오후
 * 에라토테네스의 체 (소수 판별 알고리즘)
 */
public class SieveOfEratosthenes {
    public static void sieveOfEratosthenes(int n) {
        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) continue;

            for (int j = i * i; j <= n; j += i) {
                prime[j] = true;
            }
        }


        for (int i = 2; i <= n; i++) {
            if (!prime[i])
                System.out.print(i + " ");
        }
    }
}
