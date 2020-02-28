package hackerrank.interviewkit.search;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://www.hackerrank.com/challenges/ctci-ice-cream-parlor
 * [Hash Tables: Ice Cream Parlor]
 * [MEDIUM]
 *
 * 주어진 배열에서 각 요소 두개를 합산하여 money 값과 같은 요소의 인덱스를 출력

 */
public class HashTablesIceCreamParlor {
    public static void whatFlavors(int[] cost, int money) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < cost.length; i++) {
            int sub = money - cost[i];

            if (map.containsKey(sub)) {
                System.out.println(map.get(sub) + " " + (i + 1));
                break;
            }

            map.put(cost[i], i + 1);
        }
    }

}
