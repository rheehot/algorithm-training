package leetcode.topInterViewQuestions.medium.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kimchanjung on 2020-02-14 2:14 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/109/backtracking/795
 * [Permutations]
 * 순열을 출력하는 문제
 * 기본 순열 알고리즘을 사용
 */
public class Permutations {

    public static List<List<Integer>> ret;

    public static List<List<Integer>> permute(int[] nums) {
        ret = new ArrayList<>();
        perm(nums, 0, nums.length);
        ret.forEach(v -> System.out.println(v));
        return ret;
    }

    public static void perm(int[] arr, int pivot, int n) {
        if (pivot == n) {
            ret.add(Arrays.stream(arr).boxed().collect(Collectors.toList()));
            return;
        }

        for (int i = pivot; i < n; i++) {
            swap(arr, i, pivot);
            perm(arr, pivot + 1, n);
            swap(arr, i, pivot);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
