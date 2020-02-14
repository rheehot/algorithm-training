package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

/**
 * Created by kimchanjung on 2020-02-14 3:04 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/799/
 * [Top K Frequent Elements]
 *
 * 아래와 같은 배열이 있으면
 * [1,1,1,2,2,3], k = 2
 *
 * 빈도수가 가장 높은 숫자 k = 2(top 2)까지 리턴한다.
 *
 * 1 = 3
 * 2 = 2
 * 3 = 1
 * 이므로 1, 2를 리턴
 */
public class TopKFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, (o, n) -> ++o);
        }

        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(Map.Entry::getKey)
                .limit(k)
                .collect(Collectors.toList());
    }
}
