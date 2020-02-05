package main.java.leetcode.topInterViewQuestions.medium.arrayAndStrings;

/**
 * Created by kimchanjung on 2020-02-05 4:18 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/777/
 * [Set Matrix Zeroes]
 * 번뜩이는 아이디어임
 * 1 1 1
 * 1 0 1
 * 1 1 1
 *
 * 0 이 있는 같은 행과 열을 모두 0으로 변경하는 문제임
 *
 * 1 0 1
 * 0 0 0
 * 1 0 1
 *
 * 루프를 돌다가 0 일때 때 다시 0인 지점을 기준으로 모든 행열을 0으로 변경하는 일반적인 생각으로 풀면 안되고
 *
 * 행, 열 배열을 가지고 있다가
 *
 * 0 이 2번째 행, 2번째 열 일때 각 행배열 2 = true, 열배열 2 = true 설정해놓고
 *
 * 원래 배열을 루프 돌다가 2번 행이거나 2번 열이면 그냥 다 0으로 만든다.
 *
 */
public class SetMatrixZeroes {
    public static int[][] setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                if (row[i] || col[j]) matrix[i][j] = 0;
            }

        }

        return matrix;
    }
}
