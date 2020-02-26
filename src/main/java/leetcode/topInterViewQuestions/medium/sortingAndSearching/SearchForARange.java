package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import java.util.Arrays;

/**
 * Created by kimchanjung on 2020-02-24 5:01 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/802/
 * [Search for a Range]
 * <p>
 * 아래와 같은 배열이 주어 졌을 경우
 * [5,7,7,8,8,10]
 * 타겟 번호 8이 앞에서 부터는  index 3에 있고 뒤에서 부터는 index 4에 위치한다.
 * 각각 앞에서, 뒤에서 index를 리턴한다.
 * 없는 경우는 -1,-1 을 리턴
 * 이 문제는  O(log n) 시간 복잡도로 풀어야 해서 이진 탐색 알고리즘을 사용
 */
public class SearchForARange {

    private static int[] ret;
    private static int min;
    private static int max;

    public static int[] searchRange(int[] nums, int target) {
        ret = new int[]{-1, -1};
        min = Integer.MAX_VALUE;
        max = 0;
        bs(nums, target, 0, nums.length - 1);
        System.out.println(Arrays.toString(ret));
        return ret;

    }

    private static void bs(int[] arr, int target, int start, int end) {
        int mid = 0;

        while (start <= end) {

            mid = (start + end) / 2;

            if (arr[mid] == target) {
                if (start <= mid - 1 && target == arr[mid - 1]) bs(arr, target, start, mid - 1);
                if (mid + 1 <= end && target == arr[mid + 1]) bs(arr, target, mid + 1, end);
                min = Math.min(min, mid);
                max = Math.max(max, mid);
                ret[0] = min = Math.min(min, mid);
                ret[1] = max = Math.max(max, mid);
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }

        }
    }
}
