package hackerrank.algorithms;

import java.util.Arrays;

public class TheHurdleRace {
    public static int hurdleRace(int k, int[] height) {
        int maxHeight = Arrays.stream(height).max().orElse(0);
        return maxHeight - k < 0 ? 0 : maxHeight - k;
    }
}
