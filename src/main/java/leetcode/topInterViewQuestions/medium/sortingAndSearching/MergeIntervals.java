package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import java.util.*;

/**
 * Created by kimchanjung on 2020-02-25 2:54 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/803/
 * [Merge Intervals]
 *
 * [[1,3],[2,6],[8,10],[15,18]] 이 주어 졌을 경우
 * [[1,6],[8,10],[15,18]]
 * [1,3] [2,6] => 두 범위가 맞물리면 합친다 1,6
 * [1,3] [4,5] => 맞 물리지 않기 때문데 합치치 않는다.
 *
 * 케이스가 다양해서 처리가 까다로웠던 문제
 *
 * 일단 [1,3][2,6] => 각 요소의 배열에서 앞 숫자를 기준으로 오름차순 정렬 시킨다.
 *
 * 2 보다 3 이 크거나 같으면 맞물리게 되므로 1은 그대로 두고, 3, 6 중 큰 수를 3 대신 교체 하여
 * [1,6] 을 만들어 나가는 방법 으로 해결한다.
 */
public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(p -> p[0]));
        List<int[]> ret = new ArrayList<>(Arrays.asList(intervals[0]));

        for (int i = 1; i < intervals.length; i++) {
            int[] num1 = ret.get(ret.size() - 1);
            int[] num2 = intervals[i];

            if (num2[0] <= num1[1]) {
                num1[1] = Math.max(num1[1],num2[1]);
            } else {
                ret.add(num2);
            }
        }

        ret.forEach(v -> System.out.println(Arrays.toString(v)));
        return ret.toArray(new int[0][0]);
    }
}
