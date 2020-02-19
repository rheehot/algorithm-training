package leetcode.topInterViewQuestions.medium.dynamicPrograming;

/**
 * Created by kimchanjung on 2020-02-14 5:26 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/111/dynamic-programming/809/
 * [Coin Change]
 *
 */
public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        int[] amounts = new int[amount + 1];
        int recur = recur(coins, amounts, amount);
        return recur > amount ? -1 : recur;
    }

    private static int recur(int[] coins, int[] amounts, int amount) {
        if (amount < 0) return Integer.MAX_VALUE - 1;
        if (amount == 0) return 0;
        if (amounts[amount] > 0) return amounts[amount];
        int min = Integer.MAX_VALUE - 1;

        for (int i = 0; i < coins.length; i++) {
            min = Math.min(min, recur(coins, amounts, amount - coins[i]) + 1);
        }

        return amounts[amount] = min;
    }
}
