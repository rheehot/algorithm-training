package codility.lessons.maximumSliceProblem;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/**
 * Created by kimchanjung on 2020-03-10 2:37 오후
 * https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_double_slice_sum/
 * [MaxDoubleSliceSum]
 * [MEDIUM]
 *
 * 문제가 좀 이해하기 어렵게 설명됨
 *
 * 아래와 같은 배열이 있다고 할때
 * {3, 2, 6, -1, 4, 5, -1, 2}
 * X = 왼쪽 시작 점
 * Y = 중간지점
 * Z = 오른쪽 시작점
 *
 * 사이의 값들을 합이 가장 큰 값을 리턴
 * 0, 3, 6 => 0 ~ 3 사이 값이 -> 2 + 6 = 8
 *         => 3 ~ 6 사이 값이 -> 4 + 5 = 9
 *         => 8 + 9 = 17 결론 적으로 가장 큰 값인데..
 * X, Y , Z 범위를 변경해가며 가장 큰 값을 찾는 것임
 *
 * 최장 증가 수열을 꼬아 놓은 문제
 *
 * 해결책은
 *
 * 오른쪽에서 부터 각 index별 max값을 저장해둔다.
 * 왼쪽에서서 부터 각 index별 max값을 저장해둔다.
 *
 * 배열을 순회 하면서     index - 1, index + 1 한 값을 합해서 가장 큰값을 리턴
 *
 */
public class MaxDoubleSliceSum {
    public static int solution(int[] A) {

        int[] maxSum1 = new int[A.length];
        int[] maxSum2 = new int[A.length];
        int max = 0;

        for (int i = 1; i < A.length - 1; i++) {
            maxSum1[i] = Math.max(0, maxSum1[i - 1] + A[i]);
        }

        for (int i = A.length - 2; i > 0; i--) {
            maxSum2[i] = Math.max(0, maxSum2[i + 1] + A[i]);
        }

        for (int i = 1; i < A.length-1; i++) {
            max = Math.max(max, maxSum1[i - 1] + maxSum2[i + 1]);
            System.out.println(max);
        }

        return max;
    }
}
