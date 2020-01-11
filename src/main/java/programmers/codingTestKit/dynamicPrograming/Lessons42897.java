package main.java.programmers.codingTestKit.dynamicPrograming;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42897
 * 코딩테스트 연습
 * 동적계획법(Dynamic Programming)
 * 도둑질
 * <p>
 * 어렵다.. 기존 max sub sum 알고리즘에서 인접하지 않은 요소의 max sum과 다른 것
 * <p>
 * 1 2 3 4 5 일 때 마지막 숫자를 합산하지 못하는 경우가 생긴다
 * <p>
 *    1
 * 2    5
 *  3  4
 * <p>
 * 1 , 3, 5 에서 5를 합산하지 못하는 경우가 있다 5는 1과 인접 해 있기 때문에 <= 이조건 때문에
 * 기존 풀이 방법으로는 안풀린다...
 *
 * 1부터 시작 하는 합산 값과
 * 2부터 시작 하는 합산 값을 따로 계산하여
 *
 * 1부터 시작은 마지막 값을 제외한 최대값턴 ( 이유는 위 설명 처럼 1, 3, 5<- 5를 합산하지 못한다 사이클형식이라 1, 5는 인접 해 있기 때문)
 * 2부터 시작의 최대값 중 큰값을 리턴
 *
 */
public class Lessons42897 {

    public static int solution(int[] money) {
        int[][] pick = new int[2][money.length];

        pick[0][0] = money[0];
        pick[0][1] = money[0];
        pick[1][0] = 0;
        pick[1][1] = money[1];

        for (int i = 2; i < money.length; i++) {
            pick[0][i] = Math.max(pick[0][i - 2] + money[i], pick[0][i - 1]);
            pick[1][i] = Math.max(pick[1][i - 2] + money[i], pick[1][i - 1]);
        }

        return Math.max(pick[0][pick[0].length - 2], pick[1][pick[1].length - 1]);
    }
}

