package programmers.codingTestKit.hash;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 */
public class Lessons42576 {
    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < participant.length ; i++) {
            map.compute(participant[i], (k, v) -> v != null ? null : 1);
            if (i < completion.length) map.compute(completion[i], (k,v) -> v != null ? null : 1);

        }

        return map.keySet().iterator().next();
    }

}
