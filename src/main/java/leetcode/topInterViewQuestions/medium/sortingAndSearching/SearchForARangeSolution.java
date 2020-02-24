package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import java.util.Arrays;

/**
 * Created by kimchanjung on 2020-02-24 5:01 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/802/
 * [Search for a Range]
 *
 * 아래와 같은 배열이 주어 졌을 경우
 * [5,7,7,8,8,10]
 * 타겟 번호 8이 앞에서 부터는  index 3에 있고 뒤에서 부터는 index 4에 위치한다.
 * 각각 앞에서, 뒤에서 index를 리턴한다.
 * 없는 경우는 -1,-1 을 리턴
 */
public class SearchForARangeSolution {
    public static int[] searchRange(int[] nums, int target) {
        int[] ret = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ret = ret[0] > -1 ? new int[]{ret[0], i} : new int[]{i, i};
            }
        }

        return ret;
    }
}
