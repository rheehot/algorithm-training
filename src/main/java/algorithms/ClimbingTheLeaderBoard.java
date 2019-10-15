package main.java.algorithms;

import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard
 *
 * 랭킹 보드가 있다
 *
 * 100 , 100 , 50 , 30, 30 ,10 -> 오름 차
 *
 * 한 선수의 스코어는 5, 30, 120 순 -> 내림차순
 *
 * 5 는 랭킹이 5다
 * 30 은 3이다
 * 120은 100을 넘었으므로 1이 된다
 *
 * 해결책은
 * 일단 랭킹 보드의 중복제거한 후 순서대로 들어 가 있어야한다 100, 50, 30, 10
 */
public class ClimbingTheLeaderBoard {
    public static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];
        int[] ranks = IntStream.of(scores).distinct().toArray();
        int ranking = ranks.length - 1;

        for (int i = 0; i < alice.length; i++) {
            while (ranking >= 0) {
                if (alice[i] >= ranks[ranking]) {
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
