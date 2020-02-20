package basicAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

/**
 * Created by kimchanjung on 2020-02-20 2:33 오후
 */
public class LIS {

    /**
     * O(n²) 의 해법
     * [10, 9, 2, 5, 3, 7, 101, 18]
     * 위 숫자들을 루프 돌면서 자기 보다 앞에 있는 숫자들을 비교하는 것임
     * 5의 경우
     * 10 > 5
     * 9  > 5
     * 2  < 5 => 2의 dp값 1+1 = 2 , 5의 dp 값 1 중 2가 크므로 5의 dp값을 3로 갱신
     * 2 , 5 증가 개수가 2이니 까 딱 들어 맞음
     * @param nums
     * @return
     */
    public static int lis(int[] nums) {
        System.out.println(Arrays.toString(nums));
        int[] dp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(dp));
        return dp[nums.length - 1];
    }

    /**
     * n log n 해법
     * [10, 9, 2, 5, 3, 7, 101, 18]
     * vector에 증가하는 숫자만 넣을 것임
     * lower bound를 사용할 것인데 배열에서 비교 할 대상의 작은 값 중 제일 큰값 다음 index를 반환 한다.
     * java 에서는 Collection.binarySearch를 사용하는데
     * [1,2,3,4] , 3 인경우 3이랑 값이 일치 하므로 3의 index 2가 반환되는데
     * [1,2,3,5] , 4 => 라고 하면 index인 -4를 반환한다.
     * 3 다음에 들어가면 되므로 4을 양수로 변경후 -1하면 = 3 즉 3다음 index가 나오게 되므로 적적히 요구사항에 맞게 처리한다.

     *
     * [10', 9, 2, 5, 3, 7, 101, 18]
     * [] => [10] = 첫번째 값은 벡터가 비었으므로 들어간다.
     * [10, 9', 2, 5, 3, 7, 101, 18]
     * [10] => 10 > 9 => [9]
     *
     * [10, 9, 2', 5, 3, 7, 101, 18]
     * [9] => 9 > 2 => [2]

     * [10, 9, 2, 5', 3, 7, 101, 18]
     * [2] => 2 < 5 => [2, 5]

     * [10, 9, 2, 5, 3', 7, 101, 18]
     * [2', 5] => 2 < 3 => [2, 3]
     * =>  3은 2보다 크므로 2다음 위치에 넣는다 그로 인해 5 대신 3으로 대체 된다.
     * => lower bound에서 3보다 작은 수중 2가 제일크므로 2다음 index를 리턴하고 5대신 3이 들어간다.

     * [10, 9, 2, 5, 3, 7', 101, 18]
     * [2, 3'] => 3 < 7 => [2, 3, 7]

     * [10, 9, 2', 5, 3, 7, 101', 18]
     * [2, 3, 7'] => 7 < 101 => [2, 3, 7, 101]
     *
     * [10, 9, 2', 5, 3, 7, 101, 18']
     * [2, 3, 7', 101] => 7 < 18 => [2, 3, 7, 18]
     *
     *
     *
     * @param nums
     * @return
     */
    public static int lisWithLowerBound(int[] nums) {
        System.out.println(Arrays.toString(nums));
        Vector<Integer> v = new Vector<>();

        for (int i = 0; i < nums.length; i++) {

            int p = Collections.binarySearch(v, nums[i]);
            int index = p < 0 ? -p - 1 : p; // - 값이 리턴 되는 경우에 적절히 보정 처리

            if (index < v.size()) {
               v.set(index, nums[i]);
            } else {
                v.add(nums[i]);
            }
        }

        System.out.println(v);
        return v.size();
    }
}
