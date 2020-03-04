package hackerrank.datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/sparse-arrays/
 * [Sparse Arrays]
 * [MEDIUM]
 *
 * 문자열 배열이 있다.
 * ["abc", "ab", "abc", "cvx"]
 *
 * 찾고자 하는 문자열 배열이 있다.
 * ["abc", "cvx", "fg"]
 *
 * 찾고자 하는 문자열 배열의 각요소가 문자열 배열에 몇개가 있는지 찾아서 집계한다.
 * ["abc", "ab", "abc", "cvx"]
 * ["abc", "cvx", "fg"]
 *   2개     1개     0 개
 *
 *  O(n2) 해결 해도 풀리지만
 *  map을 이용해서 O(2n) 정도에 해
 */
public class SparseArrays {

    public static int[] matchingStrings(String[] strings, String[] queries) {
        Map<String, Integer> map = new HashMap<>();
        int[] ret = new int[queries.length];

        for (int i = 0; i < strings.length; i++) {
            map.merge(strings[i], 1, (o, n) -> ++o);
        }

        for (int i = 0; i < queries.length ; i++) {
            ret[i] = map.getOrDefault(queries[i], 0);
        }

        return ret;
    }

}
