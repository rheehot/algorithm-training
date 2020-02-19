package leetcode.topInterViewQuestions.medium.sortingAndSearching;

/**
 * Created by kimchanjung on 2020-02-19 7:23 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/801/
 * [Find Peak Element]
 *
 * 주어진 배열에서 앞 뒤 요소보다 자기 자신이 큰 요소의 인댁스를 리턴한다.
 * [1,2,3,2] => 3(index = 2)
 *
 */
public class FindPeakElement {
    public static int findPeakElement(int[] nums) {
        int index = 1;

        while (index < nums.length && nums[index-1] < nums[index]) {
            index++;
        }

        return index-1;
    }
}
