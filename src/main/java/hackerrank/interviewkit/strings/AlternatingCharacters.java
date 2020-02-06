package hackerrank.interviewkit.strings;

/**
 * https://www.hackerrank.com/challenges/alternating-characters
 * AABAAB
 * 개별 문자열에서 인접한 문자열이 몇개 인지 찾는다.
 *
 * 즉 A 다음 문자열이 A 이면 카운트
 *
 * */
public class AlternatingCharacters {
    public static int alternatingCharacters(String s) {
        char[] chars = s.toCharArray();
        int count = 0;

        for (int i = chars.length-1; i > 0 ; i--) {
            if (chars[i] == chars[i-1]) count++;
        }

        return count;
    }
}
