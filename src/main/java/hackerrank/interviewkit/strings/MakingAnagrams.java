package hackerrank.interviewkit.strings;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/ctci-making-anagrams
 * 두문자열에서 일치하지 않는 문자의 개수를 찾는다.
 */
public class MakingAnagrams {
    public static int makeAnagram(String a, String b) {
        int[] arr = new int[26];
        a.chars().forEach(v -> arr[v - 'a']++);
        b.chars().forEach(v -> arr[v - 'a']--);

        return Arrays.stream(arr).map(Math::abs).sum();
    }
}
