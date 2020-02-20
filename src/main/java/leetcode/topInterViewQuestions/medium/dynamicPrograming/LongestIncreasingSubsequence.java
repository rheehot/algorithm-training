package leetcode.topInterViewQuestions.medium.dynamicPrograming;

import java.util.Collections;
import java.util.Vector;

/**
 * Created by kimchanjung on 2020-02-20 1:40 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/111/dynamic-programming/810/
 * [Longest Increasing Subsequence]
 *
 * LIS 알고리즘의 n log n 시작복잡도 알고지금을 사용
 */
public class LongestIncreasingSubsequence {

    public static int lengthOfLIS(int[] nums) {
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

        return v.size();
    }
}
