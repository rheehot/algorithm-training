package codility.lessons.learder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kimchanjung on 2020-03-09 3:32 오후
 * https://app.codility.com/programmers/lessons/8-leader/dominator/
 * [Dominator]
 * [EASY]
 */
public class Dominator {


    public static int solution(int[] A) {
        if (A.length == 0 ) return -1;
        Map<Integer, Integer> map = new HashMap<>();

        int max = 0,index = 0;

        for (int i = 0; i < A.length; i++) {
            Integer value = map.merge(A[i], 1, (o, n) -> ++o);
            if (value > max) {
                max = value;
                index = i;
            }

            if (max > A.length / 2) return index;
        }

        return max > A.length / 2 ? index : -1;
    }
}
