package leetcode.topInterViewQuestions.medium.sortingAndSearching;

/**
 * Created by kimchanjung on 2020-02-26 5:55 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/110/sorting-and-searching/806
 * [Search a 2D Matrix II]
 *
 * 2차원 배열이 아래와 같이 주어 지는 경우
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 *
 * 찾고자하는 숫자를 찾는다. 대신 O(n) 말고 시간 복잡도를 O(log n)으로 줄이기 위하여
 *
 * 이진 탐색을 사용한다.
 * 즉 각 row 를 이진 탐색 하면 되고, row의 숫자들 범위에 찾는 숫자가 들어가는지 판별하여 탐색 여부를 결정하면 더 줄어든다.
 *
 */
public class SearchA2DMatrixII {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;

        for (int i = 0; i < matrix.length ; i++) {
            if (target < matrix[i][0] || target > matrix[i][matrix[i].length - 1]) {
                continue;
            }

            if (bs(matrix[i], target))
                return true;
        }

        return false;
    }


    private static boolean bs(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {

            int mid = (low + high) / 2;
            System.out.println(arr[mid]);
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
