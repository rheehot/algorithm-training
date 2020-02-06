package hackerrank.interviewkit.search;

import java.util.TreeSet;

/**
 * [REMIND]
 * https://www.hackerrank.com/challenges/maximum-subarray-sum
 * https://brokensandals.net/hackerrank-maximum-subarray-sum/
 * kadane's algorithm
 * https://progresivojs.tistory.com/10
 */
public class MaximumSubarraySum {

    public static long maximumSum(long[] a, long m) {
        TreeSet<Long> prefix = new TreeSet<Long>();
        long currSum = 0;
        long maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            currSum = (currSum + a[i]) % m;
            maxSum = Math.max(maxSum, currSum);

            Long pr = prefix.higher(currSum);
            if (pr != null) maxSum = Math.max(maxSum, (currSum - pr + m));

            prefix.add(currSum);
        }

        return maxSum;
    }

    /**
     * Kadane's Algorithm 과 연과 있어서 Kadane's Algorithm 이용한 최대 부분합 을 찾는 함수다 (참고용)
     * 점화식
     * n번째 max값은(일반항은) 현재까지 max값 과 현재값 중에 max값 이다.
     * max(n) = max(a[n] + max(n-1), a[n])
     * => 현재맥스 = 맥스(이전맥스+현재값, 현재값)
     * 일반항중 가장 큰값을 찾는 문제이니 현재 까지 가장 큰값과 일반항 max값 중 큰
     * max = max(max(n), max)
     */
    public static int maxSubArray(int[] nums) {
        int currentMax = 0; // 일반항임
        int max = 0; // 최대값

        for (int i = 0; i < nums.length ; i++) {
            currentMax = Math.max(currentMax + nums[i], nums[i]);
            max = Math.max(max, currentMax);
        }

        return max;
    }

}


