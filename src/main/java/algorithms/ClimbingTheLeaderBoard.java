package main.java.algorithms;

import java.util.*;

public class ClimbingTheLeaderBoard {
    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];
        List<Integer> ranks = new ArrayList<>(new LinkedHashSet(Arrays.asList(Arrays.stream(scores).boxed().toArray(Integer[]::new))));

        int ranking = ranks.size() - 1;

        for (int i = 0; i < alice.length; i++) {
            while (ranking >= 0) {
                if (alice[i] >= ranks.get(ranking)) {
                    ranking--;
                } else {
                    result[i] = ranking + 2;
                    break;
                }
            }

            if (ranking < 0) {
                result[i] = 1;
            }
        }

        return result;
    }
}
