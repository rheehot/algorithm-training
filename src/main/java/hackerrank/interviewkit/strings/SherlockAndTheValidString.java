package hackerrank.interviewkit.strings;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-valid-string
 *
 * aabbccc 가 있다고 할때 빈도수가 모두 같으면 YES
 * 아닌 경우 원소중 1개를 뺄수 있는데 뺀 후 빈도수가 모두 같으면 YES
 * 아니면 NO를 출력하는 문제
 */

public class SherlockAndTheValidString {
    public static String isValid(String s) {

        int[] arr = new int[26];
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int freq = ++arr[chars[i] - 'a'];

            freqMap.merge(freq, 1, (cv, dv) -> cv + 1);
            freqMap.computeIfPresent(freq - 1, (k, v) -> v - 1);
            freqMap.remove(freq - 1, 0);
        }

        if (freqMap.size() == 1) return "YES";
        if (freqMap.size() > 2) return "NO";

        if (freqMap.firstKey() == 1 && freqMap.get(freqMap.firstKey()) == 1) return "YES";
        if (freqMap.lastKey() - freqMap.firstKey() == 1 && (freqMap.get(freqMap.firstKey()) == 1 || freqMap.get(freqMap.lastKey()) == 1)) return "YES";

        return "NO";

    }

}
