package main.java.hackerrank.algorithms;

public class ViralAdvertising {
    public static int viralAdvertising(int n) {

       // double result = 2 * (Math.pow((double) 3 / 2, n) - 1) / ((double) 3 / 2 - 1);
       // System.out.println(result - (0.3 * n));

        int a1 = 2;
        int sum = a1;

        for (int i = 0; i < n-1 ; i++) {
            a1 = (a1 * 3 / 2);
            sum = sum + a1;
        }

        return sum;
    }
}
