package leetcode.topInterViewQuestions.medium.dynamicPrograming;

import java.util.Arrays;

/**
 * Created by kimchanjung on 2020-02-04 4:05 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/111/dynamic-programming/807/
 * [Jump Game]
 *
 * 많이 햇갈리는문제
 *
 * 3,2,1,0,4 있다면
 *
 * 각 숫자의 의미는 그 자리에서 숫자만큼 점프해서 결국 마지막 까지 갈 수 있는냐를 판별
 *
 * 3,2,1,0,4
 * 0,1,2,3,4 => index
 * 3,3,3,3,8 => 각 index에서 점프 숫자를 합산
 *
 * 모두 3까지 밖에 못간다. 그래서 false
 * 혹시나 3,2,1,0,4,5 의 케이스에서 4의 경우 5까지 도달하지만  3,2,1 이 0 자리 를 띄어 넘지 못하고 0 이 마지막까지 못간다 이
 * 즉 뒤에 애들 4 까지 오는 애들이 하나도 없는 경우다.
 *
 * 0,2,3
 * 0,1,3 => index
 * 0,3,9 => 각 인덱스에서 점프 숫자 합산
 *
 * 2 의 경우 3이라서 마지막 값에 점프 할 수 있는 듯 하지만
 * 여기서 이전 값이 0이다 이 영 이후를 띄어 넘는 애들이 뒤에 하나도 없기 때문에 2 까지 갈 수 있는 애들이 하나도 없다 그래서 false
 *
 *
 */
public class JumpGame {
    public static boolean canJump2(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length-1 ; i++) {
            max =  Math.max(max, nums[i] + i);
            if (max <= i ) break;
        }

        return max >= nums.length - 1;
    }

    public static boolean canJump(int[] nums) {
        return recursive(nums, nums.length - 1) >= nums.length -1;
    }

    private static int recursive(int[] nums, int index) {
        if (index == 0 ) return nums[index]+index;
        int max = recursive(nums, index - 1);
        return max < index ? max : Math.max(max, nums[index] + index);
    }
}
