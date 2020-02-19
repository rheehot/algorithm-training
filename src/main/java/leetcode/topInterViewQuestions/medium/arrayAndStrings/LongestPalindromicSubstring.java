package leetcode.topInterViewQuestions.medium.arrayAndStrings;

import java.util.stream.Collectors;

/**
 * Created by kimchanjung on 2020-02-17 4:03 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/780/
 * [Longest Palindromic Substring]
 * [REMIND]
 * Manacher's algorithm을 사용해서 풀어야 하는 문제
 * Manacher's algorithm 자체가 이해하기 까다로움
 *
 */
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        String str = "#" + s.chars()
                .mapToObj(v -> Character.toString((char) v))
                .collect(Collectors.joining("#")) + "#";

        int right = 0; // 회문이 되는 문자열의 오른쪽 범위의 index
        int center = 0; // 회문이 되는 문자열의 중심이 되는 index
        int[] radius = new int[str.length()];
        int maxRadius = 0, radiusIndex = 0;

        for (int i = 0; i < str.length(); i++) {

            if (i <= right) radius[i] = Math.min(radius[2 * center - i], right - i);

            while (i - radius[i] - 1 >= 0
                    && i + radius[i] + 1 < str.length()
                    && str.charAt(i - radius[i] - 1) == str.charAt(i + radius[i] + 1))
                radius[i]++;

            if (right < i + radius[i]) {
                right = i + radius[i];
                center = i;
            }

            if (maxRadius < radius[i]) {
                maxRadius = radius[i];
                radiusIndex = i;
            }
        }

        return str.substring(radiusIndex - radius[radiusIndex], radiusIndex + radius[radiusIndex]+1).replace("#","");
    }
}
