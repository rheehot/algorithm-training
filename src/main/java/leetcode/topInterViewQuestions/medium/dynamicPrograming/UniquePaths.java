package leetcode.topInterViewQuestions.medium.dynamicPrograming;

/**
 * Created by kimchanjung on 2020-02-09 6:11 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/111/dynamic-programming/808/
 * [Unique Paths]
 */
public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        return recursive(new int[n][m], n - 1, m - 1);
    }

    private static int recursive(int[][] matrix, int row, int col) {
        if (row < 0 || col < 0) return 0;
        if (row == 0 && col == 0) return matrix[row][col] = 1;
        if (matrix[row][col] > 0) return matrix[row][col];
        return matrix[row][col] = recursive(matrix, row, col - 1) + recursive(matrix, row - 1, col);
    }
}
