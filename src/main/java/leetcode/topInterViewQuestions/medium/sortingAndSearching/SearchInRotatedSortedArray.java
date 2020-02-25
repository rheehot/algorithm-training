package leetcode.topInterViewQuestions.medium.sortingAndSearching;

/**
 * Created by kimchanjung on 2020-02-25 5:01 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/804/
 * [Search in Rotated Sorted Array]
 *
 * 이문제는 정렬 되어 있는 배열에서 탐색 하는데
 * 특정 위 치에서 반전 되어 있다
 * [1,2,3,4,5,6,7,8,9] => [4,5,6,7,8,9,1,2,3]
 *
 * O(log n) 시간 복잡도로 해결 해야하는데
 * 이진 탐색에서 중간 값과 목표 값을 비교 하여 좌, 우 어디를 탐색 할지 결정 하는 부분에서
 * 위 조건 처럼 반전이 되어 있다는 특징을 고려 해서 탐색 조건을 달리한다.
 *
 * [4,5,6,7,8,9,1,2,3] , target 이 3 일 경우
 * 중간 값은 8 이되고 타겟이 3이니 일반 적으로는 8보다 작은 쪽 왼쪽에 탐색 해야하나
 * [4,5,6,7,8,9,1,2,3] 반전 되어 있어서 8 왼쪽이 타켓 3 보다 크다.
 * 그런 경우 오른쪽으로 탐색 하도록 절절히 구분 해서 처리 하여 해결한다.
 */
public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;

        while (low <= high) {

            mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                if (nums[high] < nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (nums[low] > nums[mid] && target >= nums[low]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
}
