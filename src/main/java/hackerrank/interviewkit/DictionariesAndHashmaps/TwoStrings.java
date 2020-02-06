package hackerrank.interviewkit.DictionariesAndHashmaps;

import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/two-strings
 *
 * 두 스트링
 * helloo
 * world
 *
 * 각 알파벳 들이 일치하는게 있다면 YES 전혀 일치하는게 없다면 NO
 *
 * 여기서 o 가 둘다 포함되어 있다
 *
 * 솔루션
 *
 * 1. 일단 각 문자열을 중복 제거한다 => HashSet 을 이용해서 중복제거
 * 2. 그런 후 둘을 하나의 HashSet 으로 합치면서 중복을 제거한다 즉 o가 일치하므로 중복제거가 된다
 *
 * 그러면 모든 중복이 제거된 두문자열의 합은 9가됨
 * hellowrld => 9
 * hello + world  => 10 이됨
 *
 * 서로일치하는게 없으면 둘의 길이가 같다 => NO 출력
 * 일치하는게 있으면 중복제거 되서 둘의 길이가 달라진다 => YES 출
 *
 */
public class TwoStrings {
    public static String twoStrings(String s1, String s2) {

        HashSet<Integer> set1 = s1.chars().boxed().collect(Collectors.toCollection(HashSet::new));
        HashSet<Integer> set2 = s2.chars().boxed().collect(Collectors.toCollection(HashSet::new));
        HashSet<Integer> merge = new HashSet<>(set1);
        merge.addAll(set2);

        return merge.size() == set1.size() + set2.size() ? "NO" : "YES";

    }

}
