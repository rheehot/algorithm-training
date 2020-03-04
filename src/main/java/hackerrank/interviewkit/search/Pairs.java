package hackerrank.interviewkit.search;

import java.util.HashMap;

/**
 * https://www.hackerrank.com/challenges/pairs
 * [PAIRS]
 * [MEDIUM]
 *
 * 주어진 배열에서 각 두 요소의차이가 k값과 같은 조합이 몇개 인가 찾는다
 * 각 개별 요소는 유니크 하고, 중복 가능하다. k = 2 , 1 5 3 4 2
 * [5,3], [4,2] [3,1]
 *
 * 1 + 2 = 3  => 0
 * 1 - 2 = -1 => 0
 * 1
 *
 * 5 + 2 = 7 => 0
 * 5 - 2 = 3 => 0
 * 5
 *
 * 3 + 2 = 5 => 1개 즉 5 - 3 =  2 가 되는 케이스
 * 3 - 2 = 1 => 1개   3 - 1 =  2 2가 되는 케이스
 * 를 찾는 것이 됨.
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
