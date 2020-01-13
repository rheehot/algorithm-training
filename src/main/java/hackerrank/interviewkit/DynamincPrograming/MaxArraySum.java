package main.java.hackerrank.interviewkit.DynamincPrograming;

import java.util.Arrays;
import java.util.Vector;

/**
 * [REMIND]
 * https://www.hackerrank.com/challenges/max-array-sum/
 * 너무 어렵다.... ㅠㅠ
 * 3,7,4,6,5
 * 인접 하지 않은 부분 수열의 최대값
 *
 * 점화식을 세우면
 *
 * max0 = max(a0, 0)
 * max1 = max(max0, a1)
 * max2 = max(max0 + a2, a2, max1)
 * max3 = max(max1 + a3, a3, max2)
 * ....
 * maxN = max(max(N-2) + aN, max(N-1))
 */
public class MaxArraySum {

    public static int maxSubsetSum(int[] arr) {
        int[] currentMax = new int[arr.length];
        currentMax[0] = Math.max(0, arr[0]);
        currentMax[1] = Math.max(currentMax[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            currentMax[i] = Math.max(Math.max(arr[i], currentMax[i - 2] + arr[i]), currentMax[i - 1]);
        }

        return currentMax[arr.length - 1];
    }

}
