package hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 * [Electronics Shop]
 * [EASY]
 */

public class ElectronicsShop {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int result = -1;

        for (int i = 0; i < keyboards.length ; i++) {
            for (int j = 0; j < drives.length ; j++) {
                int sum = keyboards[i] + drives[j];
                result = sum <= b && sum > result ? sum : result;
            }
        }

        return result;
    }
}
