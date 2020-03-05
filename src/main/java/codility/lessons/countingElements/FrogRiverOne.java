package codility.lessons.countingElements;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kimchanjung on 2020-03-05 5:57 오후
 * https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 * [FrogRiverOne]
 * [EASY]
 *
 * 문제 설명이 아주 헷갈린다.
 *
 * [1, 3, 1, 4, 2, 3, 5, 4] 있는경우 K = 5 라고 한다면
 * 1 부터 5까지 즉 1,2,3,4,5 가 모두 포함 되는 가장 짧은 지점의 배열 index를 리턴하는문제
 *
 * [1, 3, 1, 4, 2, 3, 5, 4]
 *  1  3     4  2  3  5   => 5 까지 왔을 때 중복 숫자를 제외 하고 1,2,3,4,5 까지 포함 되는 지점이 5의 index 6 이다.
 *
 * 문제 해결은 일단 중복이 없는 자료 구조에
 * 5 이하의 숫자들을 넣어서 개수가 5이면 해당 하는 배열 index를 리턴하면 정답.
 *
 */
public class FrogRiverOne {
    public static int solution(int X, int[] A) {
        Set<Integer> set = new HashSet();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) set.add(A[i]);
            if (set.size() == X) return i;
        }

        return -1;
    }
}
