package main.java.hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/magic-square-forming
 *
 * 마방진 문제임서 -> 중복없는 자연수가 요소인 행열에서 가로 세로 선대각선 어느쪽으로 더해도 같은 숫자가 나오는 것
 * 3 X 3 행열의 마방진은 1~9 까지 자연수가 배치되고 가로 세로 대각선 어느쪽으로 각각을 더해도 같은 숫자가 나오는 형탸로 배치 되어 있다
 *
 * 주어진 행열에 합은 n * (n * n + 1) / 2 , 3 * (3 * 3 + 1) / 2 = 15가 나오고 가로, 세로, 대각선 어느 방행으로 더해도 15가 나오는 수가 배치되어 있어야함
 *
 * 문제에서는 3 * 3 행열이 있는데 정확한 마방진이 아님 어떻게 더해도 15가 안나옴
 * 그래서 15가 나오게 값을 변경하는데
 * 원래 숫자와 15가 나오도록 변경된 숫자 즉  |a - b| = 절대값 들의 합이 가장 작은 수를 찾는 것
 *
 * 해경방법
 * 3*3의 모든 마방진 케이스가 총 8개 임
 * 주어진 문제의 행열을 이 8개의 케이스를 가지고  각 자리의 숫자의 a - b 절대값의 합을 구해서 가장 작은 것을 리턴한다.
 */
public class FormingAMagicSquare {

    public static int formingMagicSquare(int[][] s) {

        int sum = s.length * (s.length * s.length+ 1) / 2;
        System.out.println("sum = "+sum);

        int[][][] matrix = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}}, {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}, {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}, {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}, {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}}};

        int prevCost = 1000;
        for (int i = 0; i < matrix.length; i++) {
            int cost = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    cost += Math.abs(matrix[i][j][k] - s[j][k]);
                    System.out.println(i + ", " + j + ", "+k+" matrix = " + matrix[i][j][k]+", s = "+s[j][k]+" = "+Math.abs(matrix[i][j][k] - s[j][k])+", cost = "+cost);
                }
            }
            System.out.println("cost = "+cost);
            prevCost = prevCost > cost ? cost : prevCost;
        }

        System.out.println(prevCost);
        return prevCost;
    }

}
