package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import java.util.Arrays;

/**
 * Created by kimchanjung on 2020-02-19 7:01 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/800/
 * [Kth Largest Element in an Array]
 *
 */
public class KthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
