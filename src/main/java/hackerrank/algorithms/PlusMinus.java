package hackerrank.algorithms;

public class PlusMinus {

    public static void plusMinus(int[] arr) {

        double positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive += 1;
            } else if (arr[i] < 0) {
                negative += 1;
            } else {
                zero += 1;
            }
        }

        System.out.println(String.format("%.6f", positive / arr.length));
        System.out.println(String.format("%.6f", negative / arr.length));
        System.out.println(String.format("%.6f", zero / arr.length));
    }

}
