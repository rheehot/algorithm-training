package hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/
 * [Divisible Sum Pairs]
 * [EASY]
 *
 * 주어진 배열의 각 원소들 중 두 수를 합한 수가 k 값으로 나눠지는 조합이 몇개 인지 찾는다.
 * 1 % 3 = 1 나머지가 1이 됨 즉 나머지가 같은 수들을 같은 배열에 개수를 더해주는 것임
 *
 * 1 % 3 = 1, 4 % 3 = 1 , 7 % 3 = 1 같은 수가 있다면 3 개 라는 것을 표시 해놓음(같은 배열에 arr[1] = 3 개)
 * 1,4,7은 결국 2 라는 숫자와 더해지면 3으로 나눠진다.
 * 2 % 3 = 2가 되고 결국 나머지가 1인 숫자들과 더해지면 3으로 나눠진다 즉 1,4,7은 2와 더해지면 되고 1,4,7 이 3개다 합산되어 있고(arr[1] = 3)
 * 2라는 숫자가 있는 경우 2%3 = 2 가 되고 2 가 3으로 나눠지기 위해서는 1,4,7 같은 숫자들이다
 * 즉 arr[1] 자리에 2 % 3 = 2 => 3-2 = 1 이 되는 숫자들이 몇개인지 파악 하면된다
 * 이숫자는 아까 1,4,7로 3개로 저장된 arr[1] = 3 값을 찾아서 count 해나가는 방식임
 */
public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        int[] arr = new int[k];

        for (int i = 0; i < n ; i++) {
            int remainder = ar[i] % k;
            int complement = remainder == 0 ? 0 : k - remainder;
            count += arr[complement];
            arr[remainder]++;
        }

        return count;

    }

}
