package main.java.interviewkit.sorting;


import main.java.Player;

import java.util.Comparator;

/**
 * https://www.hackerrank.com/challenges/ctci-comparator-sorting
 * Comparator
 *
 * 이문제는 Arrays.sort 메소드를 사용 할때
 * Arrays.sort(array, comparator) 즉 comparator 인터페이스를 구현 하는 문제 이다
 *
 *  comparator 인터페이스는 1, 2 를 비교 한다고 하면
 *
 *  첫번째 1 보다 두번째 2가 작으면 -1
 *  같으면 0
 *  첫번째가 두번째 보다 크면 1
 *  이렇게 된다 알파벳도 마찬가지 a, b 인 경우 위와 같다
 *
 *  그런데 이문제에서는
 *  반대로 player의 score는 오름 차순 즉 큰 수가 먼저 정렬 되어야 하므로
 *
 *  score는 반대로  a > b  =  - 1, a < b =  1 처리하고
 *  name의 경우는 내림차순이므로 원래 대로 하면된다.
 */

public class Checker implements Comparator<Player> {
    // complete this method
    public int compare(Player a, Player b) {
        if (a.score > b.score) return -1;
        if (a.score < b.score) return 1;
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        }

        return 0;
    }
}

