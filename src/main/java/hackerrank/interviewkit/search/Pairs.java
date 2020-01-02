package main.java.hackerrank.interviewkit.search;

import java.util.HashMap;

/**
 * https://www.hackerrank.com/challenges/pairs
 * 주어진 배열에서 각 두 요소의차이가 k값과 같은 조합이 몇개 인가 찾는다
 * 각 개별 요소는 유니크 하고, 중복 가능합 k = 2 , 1 5 3 4 2
 * [5,3], [4,2] [3,1]
 */
public class Pairs {
    public static int pairs(int k, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            count += map.getOrDefault(num+k, 0);
            count += map.getOrDefault(num-k, 0);
            map.put(num, 1);
        }

        return count;
    }
}
