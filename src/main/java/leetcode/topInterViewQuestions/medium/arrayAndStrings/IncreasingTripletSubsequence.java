package leetcode.topInterViewQuestions.medium.arrayAndStrings;

/**
 * Created by kimchanjung on 2020-02-21 2:22 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/781/
 * [Increasing Triplet Subsequence]
 *
 * 배열의 값중에 증가하는 숫자가 3개 있나 없나 판별
 *
 * [2, 1, 3, 4, 5]
 * n1 n2 n3
 * 세 숫자를 비교하는데
 * n1 <= n3 => n1 = n3 대체  아니면 다음 n2와 비교한
 * n2 <= n3 => n2 = n3 대체  아니면 n3은 n1보다 크고, 2보다도 큰 증가 3개를 만족한다.
 *
 * n1 = max, n2 = max, 2 => n1 보다 2가 작기 때문에
 * n1 = 2,   n2 = max, 1 => n1 보다 작아서 교체
 * n1 = 1,   n2 = max, 3 => n2 보다 작아서 교체
 * n1 = 1,   n2 = 3,   4 => n1 보다 크고, n2보다 크다 만족
 */
public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int n1 = Integer.MAX_VALUE, n2 = n1;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(n1+", "+n2+", "+nums[i]);
            if (nums[i] <= n1) {
                n1 = nums[i];
            } else if (nums[i] <= n2) {
                n2 = nums[i];
            } else {
                return true;
            }
        }

        return false;
    }
}
