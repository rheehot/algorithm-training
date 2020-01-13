package main.java.programmers.codingTestKit.dynamicPrograming;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42898
 * [등굣길]
 *
 */
public class Lessons42898 {
    private static int[][] matrix;
    public static int solution(int m, int n, int[][] puddles) {
        matrix = new int[n+1][m+1];
        Arrays.stream(puddles).forEach(v -> matrix[v[0]][v[1]] = -1);
        matrix[1][1] = 1;
        return recursive(n, m);
    }

    private static int recursive(int row, int col) {
        if (row < 1 || col < 1 || matrix[row][col] < 0) return 0;
        if (matrix[row][col] > 0) return matrix[row][col];
        return matrix[row][col] = (recursive(row, col - 1) + recursive(row - 1, col)) % 1000000007;
    }


}
