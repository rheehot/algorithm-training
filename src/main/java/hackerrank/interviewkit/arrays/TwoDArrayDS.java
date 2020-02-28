package hackerrank.interviewkit.arrays;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem
 * [2D Array - DS]
 * [EASY]
 */
public class TwoDArrayDS {

    public static int hourglassSum(int[][] arr) {

        int maxValue = 0, sum = 0;

        for (int v = 0; v < arr.length - 2; v++) {

            for (int h = 0; h < arr.length - 2; h++) {

                int topLine = 0, diagonal = 0, bottomLine = 0;

                for (int i = h; i < h + 3; i++) {

                    topLine = topLine + arr[v][i];
                    bottomLine = bottomLine + arr[v + 2][i];
                }

                diagonal = arr[v + 1][h + 1];

                sum = topLine + diagonal + bottomLine;

                maxValue = v + h == 0 || maxValue < sum ? sum : maxValue;

            }
        }

        return maxValue;
    }

}
