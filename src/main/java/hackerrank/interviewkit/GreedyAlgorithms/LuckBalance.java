package hackerrank.interviewkit.GreedyAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/luck-balance
 * [Luck Balance]
 * [EASY]
 *
 * 일단 문제 설명이 애매하다.
 * 5  1
 * 2  1
 * 1  1
 * 8  1
 * 10 0
 * 5  0
 * k = 3
 * 첫번째 행이 contest score 다
 * 두번째 행은 1 = 중요한 contest, 0 = 중요하지 않은 contest
 * k 값이 있는데 k 값은 중요한 contest 중에서 k 값 이상 질수 없다
 * 즉 중요한 contest 중에 3개수 만큼 최대값이 되는 수를 합산 하고 나머지는 승리므로 승리 contest는 점수를 뺀 후 최대 값을 구한다.
 * (여기서 승리하면 score가 합산되지 못하고 져야만 합산 된다)
 * 즉 k 값 이하로 으로 져 하여 합산되는값(져야되는값)에서 승리(빼야됨)를 뺀 가장 큰수 를 구한다.
 *
 * 풀이를 하자면
 * 5 2 1 8 10 5 의 모든 값이 합산되고 k 값 미만으로 중요 contest 중에서 최소 승리 하여 합산 되게 하여 가장 큰수 를 구한다.
 * 중요 contest는 모두 4개 5, 2, 1, 8 이고 k가 3 이니 5, 2, 1, 8 중에 3개를 합산하여 가장 큰값 5,2,8 이 된다.
 * 나머지 10 5 도 더해준다 즉 5, 2, 1, 8 중에 1을 빼고 나머지 수를 더한 값
 * 설명을 꼬아 놓았다.
 *
 * 해결책
 * 1. 일단 모든 스코어를 합산한다.
 * 2. 합산 중에 중요 contest 만 따로 배열에 저장
 * 3. 중요 contest를 오름차순 정렬한다.
 * 4. k값 만큼만 합산 할 수 있으니 중요 contest 수에 k 값을 뺀 횟수로 뺄값을 합한한다
 * 5. totalScore 에서 중 컨테스트 중에서 가작 적은 수로 뺄값이 합산 되어 나온 결과 * 2 를 뺀다
 *    2를 곱하는 이유는 5 + 2 = 7, 5에서 - 2를 하면 3 이되고 즉 5 + 2 = 7 에서 원래 2를 더하지 않고 빼는 경우 이므로
 *    7 - 4 = 3 , 5 - 2 = 3 이되므로 저렇게 계산한다.
 */
public class LuckBalance {
    public static int luckBalance(int k, int[][] contests) {
        List<Integer> importent = new ArrayList<>();
        int totalScore = 0;
        int subtractNum = 0;

        for (int i = 0; i < contests.length; i++) {
            totalScore += contests[i][0];
            if (contests[i][1] == 1) importent.add(contests[i][0]);
        }

        Collections.sort(importent);
        for (int i = 0; i < importent.size() - k; i++) {
            subtractNum += importent.get(i);
        }
        return totalScore - subtractNum * 2;
    }
}
