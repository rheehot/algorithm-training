package hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum
 * [A Very Big Sum]
 * [EASY]
 *
 */
public class AVeryBigSum {
    // Complete the aVeryBigSum function below.
    public static long aVeryBigSum(long[] ar) {
        long result = 0;

        for (int i = 0; i < ar.length; i++) {
            result += ar[i];
        }

        return result;
    }
}
