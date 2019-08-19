package main.java.algorithms;

public class AveryBigSum {
    // Complete the aVeryBigSum function below.
    public static long aVeryBigSum(long[] ar) {
        long result = 0;

        for (int i = 0; i < ar.length; i++) {
            result += ar[i];
        }

        return result;
    }
}
