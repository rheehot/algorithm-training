package main.java.interviewkit.GreedyAlgorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/angry-children/problem
 *
 * 4 2 5 3 1  있고 k = 3 이라면
 * 1 2 3 = 3, 1 2 3 = 1, 3 - 1 = 2
 * 즉 특정 3개의 수중 max 값에서 min 값을 뺄때 가장 작은 수를 찾는다
 * 일단 k 개수의 수에서 min max 의 차이가 가작 작기 위해서 오름 차순 정렬한다
 *
 * 배열을 순회 하면서 k값 만큼 묵에서 min max 차이를 계산 한 값중 가장 작은 값을 리턴한다.
 * 1 ~ 3 => 2 ~ 4 => 3 ~ 5
 *
 *
 */
public class MaxMin {
    public static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);
        return IntStream.range(0, arr.length-(k-1))
                .map(i -> arr[i + k - 1] - arr[i])
                .min()
                .getAsInt();
    }

}
