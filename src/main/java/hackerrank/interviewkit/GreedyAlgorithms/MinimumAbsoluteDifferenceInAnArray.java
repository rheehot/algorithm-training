package hackerrank.interviewkit.GreedyAlgorithms;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array
 * 1, 2, 3 이 있다면
 * 1 - 2, 1 - 3, 2 - 3 모든 요소들의 차의 절대 값의 크기가 가장 작은 수를 찾는다
 * 여기서 이중 for 문으로 모든 케이스를 다 구하면 timeout 남
 * 배열을 정렬한 후
 * 1 - 2, 2 - 3 이런 식으로만 값을 구한다
 * 정렬한 경우 1 - 3 처럼 범위가 큰 케이스는 당연히 차이의 절대값이 클수 밖에 없다~
 */
public class MinimumAbsoluteDifferenceInAnArray {
    public static int minimumAbsoluteDifference(int[] arr) {
        int min = Math.abs(arr[0] - arr[1]);
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
           int abs = Math.abs(arr[i - 1] - arr[i]);
            min = Math.min(abs, min);
        }

        return min;
    }
}
