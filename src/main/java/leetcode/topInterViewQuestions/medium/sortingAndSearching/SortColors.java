package leetcode.topInterViewQuestions.medium.sortingAndSearching;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by kimchanjung on 2020-02-09 5:10 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/798/
 * [Sort colors]
 *
 * 계수정렬 사용 하여 해결
 */
public class SortColors {
    public static void sortColors(int[] nums) {
        int[] temp = nums.clone();
        int[] sumFrequency = new int[Arrays.stream(temp).max().getAsInt()+1];

        for (int i = 0; i < temp.length ; i++) {
            sumFrequency[temp[i]]++;
        }

        for (int i = 1; i < sumFrequency.length ; i++) {
            sumFrequency[i] += sumFrequency[i-1];
        }

        System.out.println(Arrays.toString(sumFrequency));

        for (int i = 0; i < temp.length ; i++) {
            nums[--sumFrequency[temp[i]]] = temp[i];
        }

        System.out.println(Arrays.toString(nums));

    }
}
