package main.java.leetcode.topInterViewQuestions.medium.arrayAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kimchanjung on 2020-02-02 4:33 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/776/
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int element = Integer.MAX_VALUE;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length ; i++) {
            if (element == nums[i] ) continue; // 중복 건너뛰
            int num = -nums[i], front = i + 1, rear = nums.length - 1;

            while (front < rear) {
                if (nums[front] + nums[rear] == num) {
                    res.add(Arrays.asList(nums[i], nums[front], nums[rear]));
                    // 중복건너뛰기
                    while(front < rear && nums[front] == nums[++front]);
                    while(front < rear && nums[rear] == nums[--rear]);
                } else if (nums[front] + nums[rear] > num) {
                    rear--;
                } else {
                    front++;
                }
            }

            element = nums[i];
        }

        return res;
    }
}
