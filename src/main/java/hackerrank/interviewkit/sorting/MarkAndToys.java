package main.java.hackerrank.interviewkit.sorting;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/mark-and-toys
 *
 * 각 아이템의 합산이 k 이하인 수의 최대 개수
 *
 * 1 2 3 4 ,  7
 *
 * 이런 경우 1 2 3 = 6 , 3 4 = 7 이 나오고 1 2 3이 개수가 더 많으니 총 3 이 정답이다
 * 각 아이템을 1 + 2 + 3 + .. <= 7 이렇게 할 필요 없이
 *
 * 7 - 1 - 2 - 3 -.. 해서 k가 0 일때 까지만 루프를 돌리고 루프회수 - 1하면 됨
 */
public class MarkAndToys {
    public static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int i = 0;

        while (k > 0) {
            k -= prices[i++];
        }

        return i - 1;
    }
}
