package leetcode.topInterViewQuestions.medium.arrayAndStrings;

import java.util.stream.IntStream;

/**
 * Created by kimchanjung on 2020-02-13 2:48 오후
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/779/
 * [Longest Substring Without Repeating Characters]
 *
 * 주어진 문자열에서 반복된 문자가 없는 부분 문자열 가운데 가장 길이가 큰 문자열을 찾아서 길이를 리턴
 *
 * abcabcbb => abc
 * bbbbb => b
 * pwwkew => wke
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int start = 0, max = 0;
        s = s + " ";

        for (int i = 1; i < s.length(); i++) {
            String str = s.substring(start, i);
            max = Math.max(str.length(), max);

            if (str.indexOf(s.charAt(i)) > -1) {
                start = s.substring(0, i).lastIndexOf(s.charAt(i)) + 1;
            }
        }

        return max;
    }
}
