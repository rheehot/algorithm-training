package hackerrank.algorithms;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/the-hurdle-race/
 * [The Hurdle Race]
 * [EASY]
 */
public class TheHurdleRace {
    public static int hurdleRace(int k, int[] height) {
        int maxHeight = Arrays.stream(height).max().orElse(0);
        return maxHeight - k < 0 ? 0 : maxHeight - k;
    }
}
